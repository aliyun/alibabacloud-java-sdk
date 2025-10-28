// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetContainerConfigurationRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3616cdca-4f92-**************</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the instance group.</p>
     * <ul>
     * <li>If this parameter is specified, this operation queries the Tomcat configuration of the instance group.</li>
     * <li>If this parameter is not specified, this operation queries the Tomcat configuration of the application.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8123db90-880f-**************</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    public static GetContainerConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetContainerConfigurationRequest self = new GetContainerConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public GetContainerConfigurationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetContainerConfigurationRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
