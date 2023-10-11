// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateOrgHonorTemplateRequest extends TeaModel {
    @NameInMap("TenantContext")
    public CreateOrgHonorTemplateRequestTenantContext tenantContext;

    @NameInMap("avatarFrameMediaId")
    public String avatarFrameMediaId;

    @NameInMap("defaultBgColor")
    public String defaultBgColor;

    @NameInMap("medalDesc")
    public String medalDesc;

    @NameInMap("medalMediaId")
    public String medalMediaId;

    @NameInMap("medalName")
    public String medalName;

    @NameInMap("orgId")
    public Long orgId;

    @NameInMap("userId")
    public String userId;

    public static CreateOrgHonorTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrgHonorTemplateRequest self = new CreateOrgHonorTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrgHonorTemplateRequest setTenantContext(CreateOrgHonorTemplateRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public CreateOrgHonorTemplateRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public CreateOrgHonorTemplateRequest setAvatarFrameMediaId(String avatarFrameMediaId) {
        this.avatarFrameMediaId = avatarFrameMediaId;
        return this;
    }
    public String getAvatarFrameMediaId() {
        return this.avatarFrameMediaId;
    }

    public CreateOrgHonorTemplateRequest setDefaultBgColor(String defaultBgColor) {
        this.defaultBgColor = defaultBgColor;
        return this;
    }
    public String getDefaultBgColor() {
        return this.defaultBgColor;
    }

    public CreateOrgHonorTemplateRequest setMedalDesc(String medalDesc) {
        this.medalDesc = medalDesc;
        return this;
    }
    public String getMedalDesc() {
        return this.medalDesc;
    }

    public CreateOrgHonorTemplateRequest setMedalMediaId(String medalMediaId) {
        this.medalMediaId = medalMediaId;
        return this;
    }
    public String getMedalMediaId() {
        return this.medalMediaId;
    }

    public CreateOrgHonorTemplateRequest setMedalName(String medalName) {
        this.medalName = medalName;
        return this;
    }
    public String getMedalName() {
        return this.medalName;
    }

    public CreateOrgHonorTemplateRequest setOrgId(Long orgId) {
        this.orgId = orgId;
        return this;
    }
    public Long getOrgId() {
        return this.orgId;
    }

    public CreateOrgHonorTemplateRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class CreateOrgHonorTemplateRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static CreateOrgHonorTemplateRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            CreateOrgHonorTemplateRequestTenantContext self = new CreateOrgHonorTemplateRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public CreateOrgHonorTemplateRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
