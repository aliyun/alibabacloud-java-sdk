// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateDataIngestionRequest extends TeaModel {
    @NameInMap("CapacityCount")
    public Integer capacityCount;

    /**
     * <strong>example:</strong>
     * <p>realtime。</p>
     */
    @NameInMap("DataIngestionMode")
    public String dataIngestionMode;

    @NameInMap("DataIngestionStateCode")
    public String dataIngestionStateCode;

    @NameInMap("DataIngestionType")
    public String dataIngestionType;

    @NameInMap("DataSourceEditable")
    public Boolean dataSourceEditable;

    /**
     * <strong>example:</strong>
     * <p>ds-3g6lyf4eonngyohaq7tr。</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <strong>example:</strong>
     * <p>zh。</p>
     */
    @NameInMap("Lang")
    public String lang;

    @NameInMap("NormalizationRuleEditable")
    public Boolean normalizationRuleEditable;

    /**
     * <strong>example:</strong>
     * <p>nr-hdmady54piigkjfv17yp。</p>
     */
    @NameInMap("NormalizationRuleId")
    public String normalizationRuleId;

    @NameInMap("ProductId")
    public String productId;

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

    @NameInMap("ScanDataSourceId")
    public String scanDataSourceId;

    @NameInMap("StreamJobId")
    public String streamJobId;

    @NameInMap("UpdateTime")
    public Long updateTime;

    public static CreateDataIngestionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataIngestionRequest self = new CreateDataIngestionRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataIngestionRequest setCapacityCount(Integer capacityCount) {
        this.capacityCount = capacityCount;
        return this;
    }
    public Integer getCapacityCount() {
        return this.capacityCount;
    }

    public CreateDataIngestionRequest setDataIngestionMode(String dataIngestionMode) {
        this.dataIngestionMode = dataIngestionMode;
        return this;
    }
    public String getDataIngestionMode() {
        return this.dataIngestionMode;
    }

    public CreateDataIngestionRequest setDataIngestionStateCode(String dataIngestionStateCode) {
        this.dataIngestionStateCode = dataIngestionStateCode;
        return this;
    }
    public String getDataIngestionStateCode() {
        return this.dataIngestionStateCode;
    }

    public CreateDataIngestionRequest setDataIngestionType(String dataIngestionType) {
        this.dataIngestionType = dataIngestionType;
        return this;
    }
    public String getDataIngestionType() {
        return this.dataIngestionType;
    }

    public CreateDataIngestionRequest setDataSourceEditable(Boolean dataSourceEditable) {
        this.dataSourceEditable = dataSourceEditable;
        return this;
    }
    public Boolean getDataSourceEditable() {
        return this.dataSourceEditable;
    }

    public CreateDataIngestionRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public CreateDataIngestionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateDataIngestionRequest setNormalizationRuleEditable(Boolean normalizationRuleEditable) {
        this.normalizationRuleEditable = normalizationRuleEditable;
        return this;
    }
    public Boolean getNormalizationRuleEditable() {
        return this.normalizationRuleEditable;
    }

    public CreateDataIngestionRequest setNormalizationRuleId(String normalizationRuleId) {
        this.normalizationRuleId = normalizationRuleId;
        return this;
    }
    public String getNormalizationRuleId() {
        return this.normalizationRuleId;
    }

    public CreateDataIngestionRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public CreateDataIngestionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDataIngestionRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public CreateDataIngestionRequest setScanDataSourceId(String scanDataSourceId) {
        this.scanDataSourceId = scanDataSourceId;
        return this;
    }
    public String getScanDataSourceId() {
        return this.scanDataSourceId;
    }

    public CreateDataIngestionRequest setStreamJobId(String streamJobId) {
        this.streamJobId = streamJobId;
        return this;
    }
    public String getStreamJobId() {
        return this.streamJobId;
    }

    public CreateDataIngestionRequest setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

}
