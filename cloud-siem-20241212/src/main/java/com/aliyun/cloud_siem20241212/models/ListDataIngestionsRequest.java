// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDataIngestionsRequest extends TeaModel {
    /**
     * <p>An array of data ingestion policy IDs.</p>
     */
    @NameInMap("DataIngestionIds")
    public java.util.List<String> dataIngestionIds;

    /**
     * <p>The data ingestion status. Valid values:</p>
     * <ul>
     * <li><p><code>enabled</code>: Enabled.</p>
     * </li>
     * <li><p><code>disabled</code>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("DataIngestionStatus")
    public String dataIngestionStatus;

    /**
     * <p>An array of data ingestion template IDs.</p>
     */
    @NameInMap("DataIngestionTemplateIds")
    public java.util.List<String> dataIngestionTemplateIds;

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
     * <p>An array of normalization schema IDs.</p>
     */
    @NameInMap("NormalizationSchemaIds")
    public java.util.List<String> normalizationSchemaIds;

    /**
     * <p>The product ID.</p>
     * 
     * <strong>example:</strong>
     * <p>alibaba_cloud_sas</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The region where the threat analysis feature is deployed. Select the region that corresponds to the location of your asset. Valid values:</p>
     * <ul>
     * <li><p><code>cn-hangzhou</code>: Your asset is in the Chinese mainland.</p>
     * </li>
     * <li><p><code>ap-southeast-1</code>: Your asset is in a region outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of a member. An administrator can use this parameter to query data as the specified member.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static ListDataIngestionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataIngestionsRequest self = new ListDataIngestionsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataIngestionsRequest setDataIngestionIds(java.util.List<String> dataIngestionIds) {
        this.dataIngestionIds = dataIngestionIds;
        return this;
    }
    public java.util.List<String> getDataIngestionIds() {
        return this.dataIngestionIds;
    }

    public ListDataIngestionsRequest setDataIngestionStatus(String dataIngestionStatus) {
        this.dataIngestionStatus = dataIngestionStatus;
        return this;
    }
    public String getDataIngestionStatus() {
        return this.dataIngestionStatus;
    }

    public ListDataIngestionsRequest setDataIngestionTemplateIds(java.util.List<String> dataIngestionTemplateIds) {
        this.dataIngestionTemplateIds = dataIngestionTemplateIds;
        return this;
    }
    public java.util.List<String> getDataIngestionTemplateIds() {
        return this.dataIngestionTemplateIds;
    }

    public ListDataIngestionsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListDataIngestionsRequest setNormalizationSchemaIds(java.util.List<String> normalizationSchemaIds) {
        this.normalizationSchemaIds = normalizationSchemaIds;
        return this;
    }
    public java.util.List<String> getNormalizationSchemaIds() {
        return this.normalizationSchemaIds;
    }

    public ListDataIngestionsRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public ListDataIngestionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDataIngestionsRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
