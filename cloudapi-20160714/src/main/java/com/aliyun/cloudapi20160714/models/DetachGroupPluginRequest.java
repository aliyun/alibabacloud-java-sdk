// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DetachGroupPluginRequest extends TeaModel {
    /**
     * <p>API group ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0009db9c828549768a200320714b8930</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>API Gateway plugin ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a96926e82f994915a8da40a119374537</p>
     */
    @NameInMap("PluginId")
    public String pluginId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>Specify the environment of the API to operate on.</p>
     * <ul>
     * <li><strong>RELEASE</strong>: Production</li>
     * <li><strong>PRE</strong>: Pre-release</li>
     * <li><strong>TEST</strong>: Test</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RELEASE</p>
     */
    @NameInMap("StageName")
    public String stageName;

    public static DetachGroupPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachGroupPluginRequest self = new DetachGroupPluginRequest();
        return TeaModel.build(map, self);
    }

    public DetachGroupPluginRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DetachGroupPluginRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public DetachGroupPluginRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DetachGroupPluginRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
