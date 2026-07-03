// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDataIngestionsShrinkRequest extends TeaModel {
    /**
     * <p>An array of data ingestion policy IDs.</p>
     */
    @NameInMap("DataIngestionIds")
    public String dataIngestionIdsShrink;

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
    public String dataIngestionTemplateIdsShrink;

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
    public String normalizationSchemaIdsShrink;

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

    public static ListDataIngestionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataIngestionsShrinkRequest self = new ListDataIngestionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDataIngestionsShrinkRequest setDataIngestionIdsShrink(String dataIngestionIdsShrink) {
        this.dataIngestionIdsShrink = dataIngestionIdsShrink;
        return this;
    }
    public String getDataIngestionIdsShrink() {
        return this.dataIngestionIdsShrink;
    }

    public ListDataIngestionsShrinkRequest setDataIngestionStatus(String dataIngestionStatus) {
        this.dataIngestionStatus = dataIngestionStatus;
        return this;
    }
    public String getDataIngestionStatus() {
        return this.dataIngestionStatus;
    }

    public ListDataIngestionsShrinkRequest setDataIngestionTemplateIdsShrink(String dataIngestionTemplateIdsShrink) {
        this.dataIngestionTemplateIdsShrink = dataIngestionTemplateIdsShrink;
        return this;
    }
    public String getDataIngestionTemplateIdsShrink() {
        return this.dataIngestionTemplateIdsShrink;
    }

    public ListDataIngestionsShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListDataIngestionsShrinkRequest setNormalizationSchemaIdsShrink(String normalizationSchemaIdsShrink) {
        this.normalizationSchemaIdsShrink = normalizationSchemaIdsShrink;
        return this;
    }
    public String getNormalizationSchemaIdsShrink() {
        return this.normalizationSchemaIdsShrink;
    }

    public ListDataIngestionsShrinkRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public ListDataIngestionsShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDataIngestionsShrinkRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
