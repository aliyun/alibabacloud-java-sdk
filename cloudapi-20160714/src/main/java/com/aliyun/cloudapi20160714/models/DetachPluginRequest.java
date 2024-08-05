// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DetachPluginRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>19a2846d8e8541c788c6be740035eb68</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <strong>example:</strong>
     * <p>93b87279e54c4c0baeb7113cdf9c67f5</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>05df2b52a3644a3a8b1935ab8ab59e9d</p>
     */
    @NameInMap("PluginId")
    public String pluginId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RELEASE</p>
     */
    @NameInMap("StageName")
    public String stageName;

    public static DetachPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachPluginRequest self = new DetachPluginRequest();
        return TeaModel.build(map, self);
    }

    public DetachPluginRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DetachPluginRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DetachPluginRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public DetachPluginRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DetachPluginRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
