// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class UpdateSkillRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The value of <strong>ClientToken</strong> can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Required when SourceType is set to UPLOAD. The OSS URL of the skill package to upload.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://embedding-pic.oss-cn-beijing-internal.aliyuncs.com/30516570">https://embedding-pic.oss-cn-beijing-internal.aliyuncs.com/30516570</a></p>
     */
    @NameInMap("OssUrl")
    public String ossUrl;

    /**
     * <p>The description of the skill.</p>
     * 
     * <strong>example:</strong>
     * <p>11111</p>
     */
    @NameInMap("SkillDescription")
    public String skillDescription;

    @NameInMap("SkillDisplayName")
    public String skillDisplayName;

    /**
     * <p>The ID of the skill to update.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>06e9dca2-0ac9-4d2e-a965-e9db9c057e00</p>
     */
    @NameInMap("SkillId")
    public String skillId;

    /**
     * <p>The labels of the skill.</p>
     */
    @NameInMap("SkillLabels")
    public java.util.List<String> skillLabels;

    /**
     * <p>The name of the skill.</p>
     * 
     * <strong>example:</strong>
     * <p>111111</p>
     */
    @NameInMap("SkillName")
    public String skillName;

    /**
     * <p>Required when SourceType is set to COPY. The ID of the public skill.</p>
     * 
     * <strong>example:</strong>
     * <p>s-111</p>
     */
    @NameInMap("SourceSkillId")
    public String sourceSkillId;

    /**
     * <p>The source type for updating the skill.</p>
     * 
     * <strong>example:</strong>
     * <p>COPY</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static UpdateSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillRequest self = new UpdateSkillRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSkillRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateSkillRequest setOssUrl(String ossUrl) {
        this.ossUrl = ossUrl;
        return this;
    }
    public String getOssUrl() {
        return this.ossUrl;
    }

    public UpdateSkillRequest setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
        return this;
    }
    public String getSkillDescription() {
        return this.skillDescription;
    }

    public UpdateSkillRequest setSkillDisplayName(String skillDisplayName) {
        this.skillDisplayName = skillDisplayName;
        return this;
    }
    public String getSkillDisplayName() {
        return this.skillDisplayName;
    }

    public UpdateSkillRequest setSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }
    public String getSkillId() {
        return this.skillId;
    }

    public UpdateSkillRequest setSkillLabels(java.util.List<String> skillLabels) {
        this.skillLabels = skillLabels;
        return this;
    }
    public java.util.List<String> getSkillLabels() {
        return this.skillLabels;
    }

    public UpdateSkillRequest setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

    public UpdateSkillRequest setSourceSkillId(String sourceSkillId) {
        this.sourceSkillId = sourceSkillId;
        return this;
    }
    public String getSourceSkillId() {
        return this.sourceSkillId;
    }

    public UpdateSkillRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
