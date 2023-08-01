// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetJvmConfigurationRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the instance group.</p>
     * <br>
     * <p>*   If an ID is specified, this operation queries the JVM configuration information of the instance group.</p>
     * <p>*   If an ID is not specified, this operation queries the JVM configuration information of the application.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    public static GetJvmConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJvmConfigurationRequest self = new GetJvmConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public GetJvmConfigurationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetJvmConfigurationRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
