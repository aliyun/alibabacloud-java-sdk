// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class UpdateSkillRequest extends TeaModel {
    /**
     * <p>A unique, client-generated token to ensure request idempotence. <strong>ClientToken</strong> can contain only ASCII characters and must not exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required if <code>SourceType</code> is set to <code>UPLOAD</code>. It specifies the Object Storage Service (OSS) URL of the compressed skill package to upload.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://embedding-pic.oss-cn-beijing-internal.aliyuncs.com/30516570">https://embedding-pic.oss-cn-beijing-internal.aliyuncs.com/30516570</a></p>
     */
    @NameInMap("OssUrl")
    public String ossUrl;

    /**
     * <p>The skill description.</p>
     * 
     * <strong>example:</strong>
     * <p>11111</p>
     */
    @NameInMap("SkillDescription")
    public String skillDescription;

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
     * <p>An array of skill labels.</p>
     */
    @NameInMap("SkillLabels")
    public java.util.List<String> skillLabels;

    /**
     * <p>The skill name.</p>
     * 
     * <strong>example:</strong>
     * <p>111111</p>
     */
    @NameInMap("SkillName")
    public String skillName;

    /**
     * <p>This parameter is required if <code>SourceType</code> is set to <code>COPY</code>. It specifies the ID of the public skill.</p>
     * 
     * <strong>example:</strong>
     * <p>s-111</p>
     */
    @NameInMap("SourceSkillId")
    public String sourceSkillId;

    /**
     * <p>The source type for the skill update.</p>
     * <p>This parameter is required.</p>
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
