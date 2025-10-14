// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataIngestionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>alibaba_cloud_actiontrail_event_ingestion_173326*******。</p>
     */
    @NameInMap("DataIngestionId")
    public String dataIngestionId;

    /**
     * <strong>example:</strong>
     * <p>realtime。</p>
     */
    @NameInMap("DataIngestionMode")
    public String dataIngestionMode;

    /**
     * <strong>example:</strong>
     * <p>alibaba_cloud_actiontrail_event_log_173326*******。</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <strong>example:</strong>
     * <p>zh。</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>alibaba_cloud_actiontrail_event_rule。</p>
     */
    @NameInMap("NormalizationRuleId")
    public String normalizationRuleId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>173326*******。</p>
     */
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
