// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class ForcePublishSkillVersionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>customer-service-skill</p>
     */
    @NameInMap("SkillName")
    public String skillName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.2</p>
     */
    @NameInMap("SkillVersion")
    public String skillVersion;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UpdateLatestLabel")
    public Boolean updateLatestLabel;

    public static ForcePublishSkillVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        ForcePublishSkillVersionRequest self = new ForcePublishSkillVersionRequest();
        return TeaModel.build(map, self);
    }

    public ForcePublishSkillVersionRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public ForcePublishSkillVersionRequest setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

    public ForcePublishSkillVersionRequest setSkillVersion(String skillVersion) {
        this.skillVersion = skillVersion;
        return this;
    }
    public String getSkillVersion() {
        return this.skillVersion;
    }

    public ForcePublishSkillVersionRequest setUpdateLatestLabel(Boolean updateLatestLabel) {
        this.updateLatestLabel = updateLatestLabel;
        return this;
    }
    public Boolean getUpdateLatestLabel() {
        return this.updateLatestLabel;
    }

}
