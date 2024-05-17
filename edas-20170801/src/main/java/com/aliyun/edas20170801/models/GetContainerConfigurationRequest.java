// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetContainerConfigurationRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the instance group.</p>
     * <br>
     * <p>*   If this parameter is specified, this operation queries the Tomcat configuration of the instance group.</p>
     * <p>*   If this parameter is not specified, this operation queries the Tomcat configuration of the application.</p>
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
