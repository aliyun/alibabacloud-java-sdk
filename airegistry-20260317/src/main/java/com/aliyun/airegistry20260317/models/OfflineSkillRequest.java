// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class OfflineSkillRequest extends TeaModel {
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
     * <li>version: a specific version.</li>
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

    public static OfflineSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        OfflineSkillRequest self = new OfflineSkillRequest();
        return TeaModel.build(map, self);
    }

    public OfflineSkillRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public OfflineSkillRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public OfflineSkillRequest setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

    public OfflineSkillRequest setSkillVersion(String skillVersion) {
        this.skillVersion = skillVersion;
        return this;
    }
    public String getSkillVersion() {
        return this.skillVersion;
    }

}
