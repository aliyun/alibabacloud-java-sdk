// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataIngestionRequest extends TeaModel {
    @NameInMap("DataIngestionId")
    public String dataIngestionId;

    @NameInMap("DataIngestionMode")
    public String dataIngestionMode;

    @NameInMap("DataSourceId")
    public String dataSourceId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("NormalizationRuleId")
    public String normalizationRuleId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleFor")
    public Long roleFor;

    public static UpdateDataIngestionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataIngestionRequest self = new UpdateDataIngestionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataIngestionRequest setDataIngestionId(String dataIngestionId) {
        this.dataIngestionId = dataIngestionId;
        return this;
    }
    public String getDataIngestionId() {
        return this.dataIngestionId;
    }

    public UpdateDataIngestionRequest setDataIngestionMode(String dataIngestionMode) {
        this.dataIngestionMode = dataIngestionMode;
        return this;
    }
    public String getDataIngestionMode() {
        return this.dataIngestionMode;
    }

    public UpdateDataIngestionRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public UpdateDataIngestionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDataIngestionRequest setNormalizationRuleId(String normalizationRuleId) {
        this.normalizationRuleId = normalizationRuleId;
        return this;
    }
    public String getNormalizationRuleId() {
        return this.normalizationRuleId;
    }

    public UpdateDataIngestionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateDataIngestionRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
