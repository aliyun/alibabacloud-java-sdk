// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLivePackageChannelGroupRequest extends TeaModel {
    /**
     * <p>频道组名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>channel-group-1</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    public static GetLivePackageChannelGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLivePackageChannelGroupRequest self = new GetLivePackageChannelGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetLivePackageChannelGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
