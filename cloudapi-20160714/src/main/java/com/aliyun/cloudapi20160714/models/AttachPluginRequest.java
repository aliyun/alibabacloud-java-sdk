// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class AttachPluginRequest extends TeaModel {
    /**
     * <p>The number of the API to be bound.</p>
     * 
     * <strong>example:</strong>
     * <p>8afff6c8c4c6447abb035812e4d66b65</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The number of the API to be operated. Separate multiple numbers with commas (,). A maximum of 100 numbers can be entered.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ApiIds")
    public String apiIds;

    /**
     * <p>The ID of the API group that contains the API to which the plug-in is to be bound.</p>
     * 
     * <strong>example:</strong>
     * <p>285bb759342649a1b70c2093a772e087</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the plug-in to be bound.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9a3f1a5279434f2ba74ccd91c295af9f</p>
     */
    @NameInMap("PluginId")
    public String pluginId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The name of the runtime environment. Valid values:</p>
     * <ul>
     * <li><strong>RELEASE</strong></li>
     * <li><strong>PRE: the pre-release environment</strong></li>
     * <li><strong>TEST</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TEST</p>
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
