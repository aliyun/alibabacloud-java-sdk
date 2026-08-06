// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class OnlineSkillRequest extends TeaModel {
    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The operation scope. Valid values:</p>
     * <ul>
     * <li>skill: the entire Skill.</li>
     * <li>version: a specified version.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>version</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The Skill name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>customer-service-skill</p>
     */
    @NameInMap("SkillName")
    public String skillName;

    /**
     * <p>The version number. This parameter is required when scope is set to version.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.2</p>
     */
    @NameInMap("SkillVersion")
    public String skillVersion;

    public static OnlineSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        OnlineSkillRequest self = new OnlineSkillRequest();
        return TeaModel.build(map, self);
    }

    public OnlineSkillRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public OnlineSkillRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public OnlineSkillRequest setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

    public OnlineSkillRequest setSkillVersion(String skillVersion) {
        this.skillVersion = skillVersion;
        return this;
    }
    public String getSkillVersion() {
        return this.skillVersion;
    }

}
