// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateNormalizationRuleRequest extends TeaModel {
    @NameInMap("ExtendContentPacked")
    public String extendContentPacked;

    /**
     * <strong>example:</strong>
     * <p>flat</p>
     */
    @NameInMap("ExtendFieldStoreMode")
    public String extendFieldStoreMode;

    /**
     * <strong>example:</strong>
     * <p>zh。</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>NETWORK_CATEGORY。</p>
     */
    @NameInMap("NormalizationCategoryId")
    public String normalizationCategoryId;

    /**
     * <strong>example:</strong>
     * <p>normalization_rule_Z57np。</p>
     */
    @NameInMap("NormalizationRuleDescription")
    public String normalizationRuleDescription;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li>| pack-fields -include=\&quot;[\s\S]+\&quot; as extend_content。</li>
     * </ul>
     */
    @NameInMap("NormalizationRuleExpression")
    public String normalizationRuleExpression;

    /**
     * <strong>example:</strong>
     * <p>SPL。</p>
     */
    @NameInMap("NormalizationRuleFormat")
    public String normalizationRuleFormat;

    @NameInMap("NormalizationRuleIds")
    public java.util.List<String> normalizationRuleIds;

    /**
     * <strong>example:</strong>
     * <p>both。</p>
     */
    @NameInMap("NormalizationRuleMode")
    public String normalizationRuleMode;

    /**
     * <strong>example:</strong>
     * <p>normalization_rule_Z57np。</p>
     */
    @NameInMap("NormalizationRuleName")
    public String normalizationRuleName;

    @NameInMap("NormalizationRuleType")
    public String normalizationRuleType;

    @NameInMap("NormalizationRuleVersion")
    public Integer normalizationRuleVersion;

    /**
     * <strong>example:</strong>
     * <p>HTTP_ACTIVITY。</p>
     */
    @NameInMap("NormalizationSchemaId")
    public String normalizationSchemaId;

    @NameInMap("OrderField")
    public String orderField;

    /**
     * <strong>example:</strong>
     * <p>alibaba_cloud_sas。</p>
     */
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

    /**
     * <strong>example:</strong>
     * <p>alibaba_cloud。</p>
     */
    @NameInMap("VendorId")
    public String vendorId;

    public static CreateNormalizationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNormalizationRuleRequest self = new CreateNormalizationRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateNormalizationRuleRequest setExtendContentPacked(String extendContentPacked) {
        this.extendContentPacked = extendContentPacked;
        return this;
    }
    public String getExtendContentPacked() {
        return this.extendContentPacked;
    }

    public CreateNormalizationRuleRequest setExtendFieldStoreMode(String extendFieldStoreMode) {
        this.extendFieldStoreMode = extendFieldStoreMode;
        return this;
    }
    public String getExtendFieldStoreMode() {
        return this.extendFieldStoreMode;
    }

    public CreateNormalizationRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateNormalizationRuleRequest setNormalizationCategoryId(String normalizationCategoryId) {
        this.normalizationCategoryId = normalizationCategoryId;
        return this;
    }
    public String getNormalizationCategoryId() {
        return this.normalizationCategoryId;
    }

    public CreateNormalizationRuleRequest setNormalizationRuleDescription(String normalizationRuleDescription) {
        this.normalizationRuleDescription = normalizationRuleDescription;
        return this;
    }
    public String getNormalizationRuleDescription() {
        return this.normalizationRuleDescription;
    }

    public CreateNormalizationRuleRequest setNormalizationRuleExpression(String normalizationRuleExpression) {
        this.normalizationRuleExpression = normalizationRuleExpression;
        return this;
    }
    public String getNormalizationRuleExpression() {
        return this.normalizationRuleExpression;
    }

    public CreateNormalizationRuleRequest setNormalizationRuleFormat(String normalizationRuleFormat) {
        this.normalizationRuleFormat = normalizationRuleFormat;
        return this;
    }
    public String getNormalizationRuleFormat() {
        return this.normalizationRuleFormat;
    }

    public CreateNormalizationRuleRequest setNormalizationRuleIds(java.util.List<String> normalizationRuleIds) {
        this.normalizationRuleIds = normalizationRuleIds;
        return this;
    }
    public java.util.List<String> getNormalizationRuleIds() {
        return this.normalizationRuleIds;
    }

    public CreateNormalizationRuleRequest setNormalizationRuleMode(String normalizationRuleMode) {
        this.normalizationRuleMode = normalizationRuleMode;
        return this;
    }
    public String getNormalizationRuleMode() {
        return this.normalizationRuleMode;
    }

    public CreateNormalizationRuleRequest setNormalizationRuleName(String normalizationRuleName) {
        this.normalizationRuleName = normalizationRuleName;
        return this;
    }
    public String getNormalizationRuleName() {
        return this.normalizationRuleName;
    }

    public CreateNormalizationRuleRequest setNormalizationRuleType(String normalizationRuleType) {
        this.normalizationRuleType = normalizationRuleType;
        return this;
    }
    public String getNormalizationRuleType() {
        return this.normalizationRuleType;
    }

    public CreateNormalizationRuleRequest setNormalizationRuleVersion(Integer normalizationRuleVersion) {
        this.normalizationRuleVersion = normalizationRuleVersion;
        return this;
    }
    public Integer getNormalizationRuleVersion() {
        return this.normalizationRuleVersion;
    }

    public CreateNormalizationRuleRequest setNormalizationSchemaId(String normalizationSchemaId) {
        this.normalizationSchemaId = normalizationSchemaId;
        return this;
    }
    public String getNormalizationSchemaId() {
        return this.normalizationSchemaId;
    }

    public CreateNormalizationRuleRequest setOrderField(String orderField) {
        this.orderField = orderField;
        return this;
    }
    public String getOrderField() {
        return this.orderField;
    }

    public CreateNormalizationRuleRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public CreateNormalizationRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateNormalizationRuleRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public CreateNormalizationRuleRequest setVendorId(String vendorId) {
        this.vendorId = vendorId;
        return this;
    }
    public String getVendorId() {
        return this.vendorId;
    }

}
