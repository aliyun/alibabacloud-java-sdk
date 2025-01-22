// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLivePackageOriginEndpointRequest extends TeaModel {
    /**
     * <p>频道名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>channel-1</p>
     */
    @NameInMap("ChannelName")
    public String channelName;

    /**
     * <p>端点名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>endpoint-1</p>
     */
    @NameInMap("EndpointName")
    public String endpointName;

    /**
     * <p>频道组名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>channel-group-1</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    public static GetLivePackageOriginEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLivePackageOriginEndpointRequest self = new GetLivePackageOriginEndpointRequest();
        return TeaModel.build(map, self);
    }

    public GetLivePackageOriginEndpointRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public GetLivePackageOriginEndpointRequest setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public GetLivePackageOriginEndpointRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
