// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateDataIngestionRequest extends TeaModel {
    /**
     * <p>The number of associated security capabilities.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("CapacityCount")
    public Integer capacityCount;

    /**
     * <p>The data ingestion mode. Valid values:</p>
     * <ul>
     * <li><p>realtime</p>
     * </li>
     * <li><p>scan</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>realtime</p>
     */
    @NameInMap("DataIngestionMode")
    public String dataIngestionMode;

    /**
     * <p>The error code for the data ingestion status.</p>
     * 
     * <strong>example:</strong>
     * <p>UserUnauthorized</p>
     */
    @NameInMap("DataIngestionStateCode")
    public String dataIngestionStateCode;

    /**
     * <p>The data ingestion type. Valid values:</p>
     * <ul>
     * <li><p>preset</p>
     * </li>
     * <li><p>custom</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("DataIngestionType")
    public String dataIngestionType;

    /**
     * <p>Specifies whether the data source can be edited.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DataSourceEditable")
    public Boolean dataSourceEditable;

    /**
     * <p>The ID of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-3g6lyf4eonngyohaq7tr</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Specifies whether the normalization rule can be edited.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NormalizationRuleEditable")
    public Boolean normalizationRuleEditable;

    /**
     * <p>The ID of the normalization rule.</p>
     * 
     * <strong>example:</strong>
     * <p>nr-hdmady54piigkjfv17yp</p>
     */
    @NameInMap("NormalizationRuleId")
    public String normalizationRuleId;

    /**
     * <p>The product ID.</p>
     * 
     * <strong>example:</strong>
     * <p>alibaba_cloud_sas</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The region where the Data Management hub for threat analysis is located. Select a region for the management hub based on the region of your assets. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Your assets are in the Chinese mainland.</p>
     * </li>
     * <li><p>ap-southeast-1: Your assets are in a region outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of a member. An administrator can use this parameter to assume the permissions of the specified member.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The ID of the data source for the scan mode.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-014frtpy28m5ct2eoyo1</p>
     */
    @NameInMap("ScanDataSourceId")
    public String scanDataSourceId;

    /**
     * <p>The ID of the stream job.</p>
     * 
     * <strong>example:</strong>
     * <p>802c0129b6cfd50861d4b25deea29afb</p>
     */
    @NameInMap("StreamJobId")
    public String streamJobId;

    /**
     * <p>The update time.</p>
     * 
     * <strong>example:</strong>
     * <p>1733269771123</p>
     */
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
