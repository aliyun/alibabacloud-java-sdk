// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateNormalizationRuleRequest extends TeaModel {
    /**
     * <p>Specifies whether to package non-standard fields into the extend_content extension field. Valid values:</p>
     * <ul>
     * <li><p>enabled: The feature is enabled.</p>
     * </li>
     * <li><p>disabled: The feature is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("ExtendContentPacked")
    public String extendContentPacked;

    /**
     * <p>The storage mode for extension fields. Valid values: flat, pack, and reject.</p>
     * 
     * <strong>example:</strong>
     * <p>flat</p>
     */
    @NameInMap("ExtendFieldStoreMode")
    public String extendFieldStoreMode;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
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
     * <p>The normalization category.</p>
     * 
     * <strong>example:</strong>
     * <p>HOST_CATEGORY</p>
     */
    @NameInMap("NormalizationCategoryId")
    public String normalizationCategoryId;

    /**
     * <p>The description of the normalization rule.</p>
     * 
     * <strong>example:</strong>
     * <p>normalization_rule_Z57np</p>
     */
    @NameInMap("NormalizationRuleDescription")
    public String normalizationRuleDescription;

    /**
     * <p>The expression for the normalization rule.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li>| pack-fields -include=\&quot;[\s\S]+\&quot; as extend_content</li>
     * </ul>
     */
    @NameInMap("NormalizationRuleExpression")
    public String normalizationRuleExpression;

    /**
     * <p>The format of the normalization rule.</p>
     * 
     * <strong>example:</strong>
     * <p>SPL</p>
     */
    @NameInMap("NormalizationRuleFormat")
    public String normalizationRuleFormat;

    /**
     * <p>The ID of the normalization rule.</p>
     * 
     * <strong>example:</strong>
     * <p>nr-z0b2ssjteut85uoh9nzp</p>
     */
    @NameInMap("NormalizationRuleId")
    public String normalizationRuleId;

    /**
     * <p>The list of normalization rule IDs.</p>
     */
    @NameInMap("NormalizationRuleIds")
    public java.util.List<String> normalizationRuleIds;

    /**
     * <p>The mode of the normalization rule. Valid values:</p>
     * <ul>
     * <li><p>both</p>
     * </li>
     * <li><p>scan</p>
     * </li>
     * <li><p>realtime</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>both</p>
     */
    @NameInMap("NormalizationRuleMode")
    public String normalizationRuleMode;

    /**
     * <p>The name of the normalization rule.</p>
     * 
     * <strong>example:</strong>
     * <p>normalization_rule_Z57np</p>
     */
    @NameInMap("NormalizationRuleName")
    public String normalizationRuleName;

    /**
     * <p>The type of the normalization rule. Valid values:</p>
     * <ul>
     * <li><p>predefined: predefined normalization rule.</p>
     * </li>
     * <li><p>custom: custom normalization rule.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("NormalizationRuleType")
    public String normalizationRuleType;

    /**
     * <p>The ID of the normalization structure.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP_ACTIVITY</p>
     */
    @NameInMap("NormalizationSchemaId")
    public String normalizationSchemaId;

    /**
     * <strong>example:</strong>
     * <p>NETWORK_AND_WEB_SECURITY</p>
     */
    @NameInMap("NormalizationSecurityDomainId")
    public String normalizationSecurityDomainId;

    /**
     * <p>The field to use for sorting the rule list. Valid values:</p>
     * <ul>
     * <li><p>GmtModified: Sorts by modification time.</p>
     * </li>
     * <li><p>Id: Sorts by rule ID (default).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Id</p>
     */
    @NameInMap("OrderField")
    public String orderField;

    /**
     * <p>The product ID.</p>
     * 
     * <strong>example:</strong>
     * <p>alibaba_cloud_sas</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The region where the Data Management center of threat analysis is located. Select a region based on the region where your assets are located. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: an asset in the Chinese mainland.</p>
     * </li>
     * <li><p>ap-southeast-1: an asset outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of a member. This parameter is used when an administrator switches to the perspective of the member.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The vendor ID that corresponds to the normalization rule.</p>
     * 
     * <strong>example:</strong>
     * <p>alibaba_cloud</p>
     */
    @NameInMap("VendorId")
    public String vendorId;

    public static UpdateNormalizationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNormalizationRuleRequest self = new UpdateNormalizationRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNormalizationRuleRequest setExtendContentPacked(String extendContentPacked) {
        this.extendContentPacked = extendContentPacked;
        return this;
    }
    public String getExtendContentPacked() {
        return this.extendContentPacked;
    }

    public UpdateNormalizationRuleRequest setExtendFieldStoreMode(String extendFieldStoreMode) {
        this.extendFieldStoreMode = extendFieldStoreMode;
        return this;
    }
    public String getExtendFieldStoreMode() {
        return this.extendFieldStoreMode;
    }

    public UpdateNormalizationRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateNormalizationRuleRequest setNormalizationCategoryId(String normalizationCategoryId) {
        this.normalizationCategoryId = normalizationCategoryId;
        return this;
    }
    public String getNormalizationCategoryId() {
        return this.normalizationCategoryId;
    }

    public UpdateNormalizationRuleRequest setNormalizationRuleDescription(String normalizationRuleDescription) {
        this.normalizationRuleDescription = normalizationRuleDescription;
        return this;
    }
    public String getNormalizationRuleDescription() {
        return this.normalizationRuleDescription;
    }

    public UpdateNormalizationRuleRequest setNormalizationRuleExpression(String normalizationRuleExpression) {
        this.normalizationRuleExpression = normalizationRuleExpression;
        return this;
    }
    public String getNormalizationRuleExpression() {
        return this.normalizationRuleExpression;
    }

    public UpdateNormalizationRuleRequest setNormalizationRuleFormat(String normalizationRuleFormat) {
        this.normalizationRuleFormat = normalizationRuleFormat;
        return this;
    }
    public String getNormalizationRuleFormat() {
        return this.normalizationRuleFormat;
    }

    public UpdateNormalizationRuleRequest setNormalizationRuleId(String normalizationRuleId) {
        this.normalizationRuleId = normalizationRuleId;
        return this;
    }
    public String getNormalizationRuleId() {
        return this.normalizationRuleId;
    }

    public UpdateNormalizationRuleRequest setNormalizationRuleIds(java.util.List<String> normalizationRuleIds) {
        this.normalizationRuleIds = normalizationRuleIds;
        return this;
    }
    public java.util.List<String> getNormalizationRuleIds() {
        return this.normalizationRuleIds;
    }

    public UpdateNormalizationRuleRequest setNormalizationRuleMode(String normalizationRuleMode) {
        this.normalizationRuleMode = normalizationRuleMode;
        return this;
    }
    public String getNormalizationRuleMode() {
        return this.normalizationRuleMode;
    }

    public UpdateNormalizationRuleRequest setNormalizationRuleName(String normalizationRuleName) {
        this.normalizationRuleName = normalizationRuleName;
        return this;
    }
    public String getNormalizationRuleName() {
        return this.normalizationRuleName;
    }

    public UpdateNormalizationRuleRequest setNormalizationRuleType(String normalizationRuleType) {
        this.normalizationRuleType = normalizationRuleType;
        return this;
    }
    public String getNormalizationRuleType() {
        return this.normalizationRuleType;
    }

    public UpdateNormalizationRuleRequest setNormalizationSchemaId(String normalizationSchemaId) {
        this.normalizationSchemaId = normalizationSchemaId;
        return this;
    }
    public String getNormalizationSchemaId() {
        return this.normalizationSchemaId;
    }

    public UpdateNormalizationRuleRequest setNormalizationSecurityDomainId(String normalizationSecurityDomainId) {
        this.normalizationSecurityDomainId = normalizationSecurityDomainId;
        return this;
    }
    public String getNormalizationSecurityDomainId() {
        return this.normalizationSecurityDomainId;
    }

    public UpdateNormalizationRuleRequest setOrderField(String orderField) {
        this.orderField = orderField;
        return this;
    }
    public String getOrderField() {
        return this.orderField;
    }

    public UpdateNormalizationRuleRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public UpdateNormalizationRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateNormalizationRuleRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public UpdateNormalizationRuleRequest setVendorId(String vendorId) {
        this.vendorId = vendorId;
        return this;
    }
    public String getVendorId() {
        return this.vendorId;
    }

}
