// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CreateSkillRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The value of <strong>ClientToken</strong> can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The OSS URL of the Skill package to upload. This parameter is required when SourceType is set to UPLOAD.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://embedding-pic.oss-cn-beijing-internal.aliyuncs.com/30516570">https://embedding-pic.oss-cn-beijing-internal.aliyuncs.com/30516570</a></p>
     */
    @NameInMap("OssUrl")
    public String ossUrl;

    /**
     * <p>The Skill description.</p>
     * 
     * <strong>example:</strong>
     * <p>11111</p>
     */
    @NameInMap("SkillDescription")
    public String skillDescription;

    @NameInMap("SkillDisplayName")
    public String skillDisplayName;

    /**
     * <p>The Skill labels.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;category:frontend-development&quot;]</p>
     */
    @NameInMap("SkillLabels")
    public java.util.List<String> skillLabels;

    /**
     * <p>The Skill name.</p>
     * 
     * <strong>example:</strong>
     * <p>11111</p>
     */
    @NameInMap("SkillName")
    public String skillName;

    /**
     * <p>The ID of the SkillSpace to which the Skill belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ss-111111</p>
     */
    @NameInMap("SkillSpaceId")
    public String skillSpaceId;

    /**
     * <p>The public Skill ID. This parameter is required when SourceType is set to COPY.</p>
     * 
     * <strong>example:</strong>
     * <p>s-11111</p>
     */
    @NameInMap("SourceSkillId")
    public String sourceSkillId;

    /**
     * <p>The source type used when creating the Skill.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>COPY</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static CreateSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillRequest self = new CreateSkillRequest();
        return TeaModel.build(map, self);
    }

    public CreateSkillRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateSkillRequest setOssUrl(String ossUrl) {
        this.ossUrl = ossUrl;
        return this;
    }
    public String getOssUrl() {
        return this.ossUrl;
    }

    public CreateSkillRequest setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
        return this;
    }
    public String getSkillDescription() {
        return this.skillDescription;
    }

    public CreateSkillRequest setSkillDisplayName(String skillDisplayName) {
        this.skillDisplayName = skillDisplayName;
        return this;
    }
    public String getSkillDisplayName() {
        return this.skillDisplayName;
    }

    public CreateSkillRequest setSkillLabels(java.util.List<String> skillLabels) {
        this.skillLabels = skillLabels;
        return this;
    }
    public java.util.List<String> getSkillLabels() {
        return this.skillLabels;
    }

    public CreateSkillRequest setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

    public CreateSkillRequest setSkillSpaceId(String skillSpaceId) {
        this.skillSpaceId = skillSpaceId;
        return this;
    }
    public String getSkillSpaceId() {
        return this.skillSpaceId;
    }

    public CreateSkillRequest setSourceSkillId(String sourceSkillId) {
        this.sourceSkillId = sourceSkillId;
        return this;
    }
    public String getSourceSkillId() {
        return this.sourceSkillId;
    }

    public CreateSkillRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
