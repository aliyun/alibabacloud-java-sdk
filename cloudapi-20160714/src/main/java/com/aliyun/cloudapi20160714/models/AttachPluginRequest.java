// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class AttachPluginRequest extends TeaModel {
    /**
     * <p>The number of the API to be bound.</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The number of the API to be operated. Separate multiple numbers with commas (,). A maximum of 100 numbers can be entered.</p>
     */
    @NameInMap("ApiIds")
    public String apiIds;

    /**
     * <p>The ID of the API group that contains the API to which the plug-in is to be bound.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the plug-in to be bound.</p>
     */
    @NameInMap("PluginId")
    public String pluginId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The name of the runtime environment. Valid values:</p>
     * <br>
     * <p>*   **RELEASE**</p>
     * <p>*   **PRE: the pre-release environment**</p>
     * <p>*   **TEST**</p>
     */
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
