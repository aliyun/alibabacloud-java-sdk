// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class AttachPluginRequest extends TeaModel {
    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("ApiIds")
    public String apiIds;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("PluginId")
    public String pluginId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("StageName")
    public String stageName;

    public static AttachPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachPluginRequest self = new AttachPluginRequest();
        return TeaModel.build(map, self);
    }

    public AttachPluginRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public AttachPluginRequest setApiIds(String apiIds) {
        this.apiIds = apiIds;
        return this;
    }
    public String getApiIds() {
        return this.apiIds;
    }

    public AttachPluginRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public AttachPluginRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public AttachPluginRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public AttachPluginRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
