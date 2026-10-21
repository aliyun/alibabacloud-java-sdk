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
     * <li>realtime</li>
     * <li>scan</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>realtime</p>
     */
    @NameInMap("DataIngestionMode")
    public String dataIngestionMode;

    /**
     * <p>The status code for data ingestion exceptions.</p>
     * 
     * <strong>example:</strong>
     * <p>UserUnauthorized</p>
     */
    @NameInMap("DataIngestionStateCode")
    public String dataIngestionStateCode;

    /**
     * <p>The data ingestion type. Valid values:</p>
     * <ul>
     * <li>preset</li>
     * <li>custom</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("DataIngestionType")
    public String dataIngestionType;

    /**
     * <p>Specifies whether the data source is editable.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DataSourceEditable")
    public Boolean dataSourceEditable;

    /**
     * <p>The data source ID.</p>
     * <blockquote>
     * <p>This parameter is required in practice. If you do not specify this parameter, the API returns a 400 error: &quot;The specified DataSourceId is invalid.&quot;
     * Before calling this operation, call the CreateDataSource operation to create a data source and obtain the data source ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ds-3g6lyf4eonngyohaq7tr</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.<blockquote>
     * <p>This parameter is required in practice. If you do not specify this parameter, the API returns a 400 error: &quot;The specified Lang can not be empty.&quot;</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Specifies whether the normalization rule is editable.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NormalizationRuleEditable")
    public Boolean normalizationRuleEditable;

    /**
     * <p>The normalization rule ID.
     * Before calling this operation, call the CreateNormalizationRule operation to create a normalization rule and obtain the normalization rule ID.</p>
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
     * <p>The region of the management center for threat analysis. Specify the management center based on the region where your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in the Chinese mainland.</li>
     * <li>ap-southeast-1: Your assets reside outside China.</li>
     * <li>cn-shanghai: The actual effective value. RegionId refers to the management center location, which is a different dimension from the API endpoint region (cn-shanghai).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the member to which the administrator switches the view.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The data source ID for scan mode.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-014frtpy28m5ct2eoyo1</p>
     */
    @NameInMap("ScanDataSourceId")
    public String scanDataSourceId;

    /**
     * <p>The job ID of the stream task.</p>
     * 
     * <strong>example:</strong>
     * <p>802c0129b6cfd50861d4b25deea29afb</p>
     */
    @NameInMap("StreamJobId")
    public String streamJobId;

    /**
     * <p>The update time. This value is a UNIX timestamp in milliseconds.</p>
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
