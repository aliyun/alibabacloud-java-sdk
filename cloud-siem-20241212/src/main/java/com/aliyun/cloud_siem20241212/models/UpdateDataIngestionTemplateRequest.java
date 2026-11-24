// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataIngestionTemplateRequest extends TeaModel {
    @NameInMap("DataIngestionStatus")
    public String dataIngestionStatus;

    @NameInMap("DataIngestionTemplateId")
    public String dataIngestionTemplateId;

    @NameInMap("DataIngestionTemplateName")
    public String dataIngestionTemplateName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("NormalizationRuleId")
    public String normalizationRuleId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleFor")
    public Long roleFor;

    public static UpdateDataIngestionTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataIngestionTemplateRequest self = new UpdateDataIngestionTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataIngestionTemplateRequest setDataIngestionStatus(String dataIngestionStatus) {
        this.dataIngestionStatus = dataIngestionStatus;
        return this;
    }
    public String getDataIngestionStatus() {
        return this.dataIngestionStatus;
    }

    public UpdateDataIngestionTemplateRequest setDataIngestionTemplateId(String dataIngestionTemplateId) {
        this.dataIngestionTemplateId = dataIngestionTemplateId;
        return this;
    }
    public String getDataIngestionTemplateId() {
        return this.dataIngestionTemplateId;
    }

    public UpdateDataIngestionTemplateRequest setDataIngestionTemplateName(String dataIngestionTemplateName) {
        this.dataIngestionTemplateName = dataIngestionTemplateName;
        return this;
    }
    public String getDataIngestionTemplateName() {
        return this.dataIngestionTemplateName;
    }

    public UpdateDataIngestionTemplateRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDataIngestionTemplateRequest setNormalizationRuleId(String normalizationRuleId) {
        this.normalizationRuleId = normalizationRuleId;
        return this;
    }
    public String getNormalizationRuleId() {
        return this.normalizationRuleId;
    }

    public UpdateDataIngestionTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateDataIngestionTemplateRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
