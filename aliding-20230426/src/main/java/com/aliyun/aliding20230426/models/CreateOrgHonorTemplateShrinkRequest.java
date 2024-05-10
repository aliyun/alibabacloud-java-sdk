// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateOrgHonorTemplateShrinkRequest extends TeaModel {
    @NameInMap("TenantContext")
    public String tenantContextShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("avatarFrameMediaId")
    public String avatarFrameMediaId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("defaultBgColor")
    public String defaultBgColor;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("medalDesc")
    public String medalDesc;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("medalMediaId")
    public String medalMediaId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("medalName")
    public String medalName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("orgId")
    public Long orgId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("userId")
    public String userId;

    public static CreateOrgHonorTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrgHonorTemplateShrinkRequest self = new CreateOrgHonorTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrgHonorTemplateShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public CreateOrgHonorTemplateShrinkRequest setAvatarFrameMediaId(String avatarFrameMediaId) {
        this.avatarFrameMediaId = avatarFrameMediaId;
        return this;
    }
    public String getAvatarFrameMediaId() {
        return this.avatarFrameMediaId;
    }

    public CreateOrgHonorTemplateShrinkRequest setDefaultBgColor(String defaultBgColor) {
        this.defaultBgColor = defaultBgColor;
        return this;
    }
    public String getDefaultBgColor() {
        return this.defaultBgColor;
    }

    public CreateOrgHonorTemplateShrinkRequest setMedalDesc(String medalDesc) {
        this.medalDesc = medalDesc;
        return this;
    }
    public String getMedalDesc() {
        return this.medalDesc;
    }

    public CreateOrgHonorTemplateShrinkRequest setMedalMediaId(String medalMediaId) {
        this.medalMediaId = medalMediaId;
        return this;
    }
    public String getMedalMediaId() {
        return this.medalMediaId;
    }

    public CreateOrgHonorTemplateShrinkRequest setMedalName(String medalName) {
        this.medalName = medalName;
        return this;
    }
    public String getMedalName() {
        return this.medalName;
    }

    public CreateOrgHonorTemplateShrinkRequest setOrgId(Long orgId) {
        this.orgId = orgId;
        return this;
    }
    public Long getOrgId() {
        return this.orgId;
    }

    public CreateOrgHonorTemplateShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
