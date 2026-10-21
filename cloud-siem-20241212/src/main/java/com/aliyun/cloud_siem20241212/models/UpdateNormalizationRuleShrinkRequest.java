// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateNormalizationRuleShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to pack non-standard fields into the extended field extend_content. Valid values:</p>
     * <ul>
     * <li>enabled: Enabled.</li>
     * <li>disabled: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("ExtendContentPacked")
    public String extendContentPacked;

    /**
     * <p>The extended field storage mode. Valid values: flat, pack, reject.</p>
     * 
     * <strong>example:</strong>
     * <p>flat</p>
     */
    @NameInMap("ExtendFieldStoreMode")
    public String extendFieldStoreMode;

    /**
     * <p>The language of the response messages. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The normalization category to which the rule belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>HOST_CATEGORY</p>
     */
    @NameInMap("NormalizationCategoryId")
    public String normalizationCategoryId;

    /**
     * <p>The normalization rule description.</p>
     * 
     * <strong>example:</strong>
     * <p>normalization_rule_Z57np</p>
     */
    @NameInMap("NormalizationRuleDescription")
    public String normalizationRuleDescription;

    /**
     * <p>The normalization rule expression.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li>| pack-fields -include=\&quot;[\s\S]+\&quot; as extend_content</li>
     * </ul>
     */
    @NameInMap("NormalizationRuleExpression")
    public String normalizationRuleExpression;

    /**
     * <p>The normalization rule format.</p>
     * 
     * <strong>example:</strong>
     * <p>SPL</p>
     */
    @NameInMap("NormalizationRuleFormat")
    public String normalizationRuleFormat;

    /**
     * <p>The normalization rule ID.</p>
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
    public String normalizationRuleIdsShrink;

    /**
     * <p>The normalization rule mode. Valid values:</p>
     * <ul>
     * <li>both</li>
     * <li>scan</li>
     * <li>realtime</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>both</p>
     */
    @NameInMap("NormalizationRuleMode")
    public String normalizationRuleMode;

    /**
     * <p>The normalization rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>normalization_rule_Z57np</p>
     */
    @NameInMap("NormalizationRuleName")
    public String normalizationRuleName;

    /**
     * <p>The normalization rule type. Valid values:</p>
     * <ul>
     * <li>predefined: predefined normalization rule.</li>
     * <li>custom: custom normalization rule.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("NormalizationRuleType")
    public String normalizationRuleType;

    /**
     * <p>The normalization schema ID.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP_ACTIVITY</p>
     */
    @NameInMap("NormalizationSchemaId")
    public String normalizationSchemaId;

    /**
     * <p>The normalization security domain ID.</p>
     * 
     * <strong>example:</strong>
     * <p>NETWORK_AND_WEB_SECURITY</p>
     */
    @NameInMap("NormalizationSecurityDomainId")
    public String normalizationSecurityDomainId;

    /**
     * <p>The field used to sort the rule list. Valid values:</p>
     * <ul>
     * <li>GmtModified: Sort by modification time.</li>
     * <li>Id: Sort by rule ID (default).</li>
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
     * <p>The region where the data management center of the threat detection service is located. Select the management center region based on the region where your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets are located in the Chinese mainland.</li>
     * <li>ap-southeast-1: Your assets are located outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of the member account that the administrator switches to.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The vendor ID associated with the normalization rule.</p>
     * 
     * <strong>example:</strong>
     * <p>alibaba_cloud</p>
     */
    @NameInMap("VendorId")
    public String vendorId;

    public static UpdateNormalizationRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNormalizationRuleShrinkRequest self = new UpdateNormalizationRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNormalizationRuleShrinkRequest setExtendContentPacked(String extendContentPacked) {
        this.extendContentPacked = extendContentPacked;
        return this;
    }
    public String getExtendContentPacked() {
        return this.extendContentPacked;
    }

    public UpdateNormalizationRuleShrinkRequest setExtendFieldStoreMode(String extendFieldStoreMode) {
        this.extendFieldStoreMode = extendFieldStoreMode;
        return this;
    }
    public String getExtendFieldStoreMode() {
        return this.extendFieldStoreMode;
    }

    public UpdateNormalizationRuleShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateNormalizationRuleShrinkRequest setNormalizationCategoryId(String normalizationCategoryId) {
        this.normalizationCategoryId = normalizationCategoryId;
        return this;
    }
    public String getNormalizationCategoryId() {
        return this.normalizationCategoryId;
    }

    public UpdateNormalizationRuleShrinkRequest setNormalizationRuleDescription(String normalizationRuleDescription) {
        this.normalizationRuleDescription = normalizationRuleDescription;
        return this;
    }
    public String getNormalizationRuleDescription() {
        return this.normalizationRuleDescription;
    }

    public UpdateNormalizationRuleShrinkRequest setNormalizationRuleExpression(String normalizationRuleExpression) {
        this.normalizationRuleExpression = normalizationRuleExpression;
        return this;
    }
    public String getNormalizationRuleExpression() {
        return this.normalizationRuleExpression;
    }

    public UpdateNormalizationRuleShrinkRequest setNormalizationRuleFormat(String normalizationRuleFormat) {
        this.normalizationRuleFormat = normalizationRuleFormat;
        return this;
    }
    public String getNormalizationRuleFormat() {
        return this.normalizationRuleFormat;
    }

    public UpdateNormalizationRuleShrinkRequest setNormalizationRuleId(String normalizationRuleId) {
        this.normalizationRuleId = normalizationRuleId;
        return this;
    }
    public String getNormalizationRuleId() {
        return this.normalizationRuleId;
    }

    public UpdateNormalizationRuleShrinkRequest setNormalizationRuleIdsShrink(String normalizationRuleIdsShrink) {
        this.normalizationRuleIdsShrink = normalizationRuleIdsShrink;
        return this;
    }
    public String getNormalizationRuleIdsShrink() {
        return this.normalizationRuleIdsShrink;
    }

    public UpdateNormalizationRuleShrinkRequest setNormalizationRuleMode(String normalizationRuleMode) {
        this.normalizationRuleMode = normalizationRuleMode;
        return this;
    }
    public String getNormalizationRuleMode() {
        return this.normalizationRuleMode;
    }

    public UpdateNormalizationRuleShrinkRequest setNormalizationRuleName(String normalizationRuleName) {
        this.normalizationRuleName = normalizationRuleName;
        return this;
    }
    public String getNormalizationRuleName() {
        return this.normalizationRuleName;
    }

    public UpdateNormalizationRuleShrinkRequest setNormalizationRuleType(String normalizationRuleType) {
        this.normalizationRuleType = normalizationRuleType;
        return this;
    }
    public String getNormalizationRuleType() {
        return this.normalizationRuleType;
    }

    public UpdateNormalizationRuleShrinkRequest setNormalizationSchemaId(String normalizationSchemaId) {
        this.normalizationSchemaId = normalizationSchemaId;
        return this;
    }
    public String getNormalizationSchemaId() {
        return this.normalizationSchemaId;
    }

    public UpdateNormalizationRuleShrinkRequest setNormalizationSecurityDomainId(String normalizationSecurityDomainId) {
        this.normalizationSecurityDomainId = normalizationSecurityDomainId;
        return this;
    }
    public String getNormalizationSecurityDomainId() {
        return this.normalizationSecurityDomainId;
    }

    public UpdateNormalizationRuleShrinkRequest setOrderField(String orderField) {
        this.orderField = orderField;
        return this;
    }
    public String getOrderField() {
        return this.orderField;
    }

    public UpdateNormalizationRuleShrinkRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public UpdateNormalizationRuleShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateNormalizationRuleShrinkRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public UpdateNormalizationRuleShrinkRequest setVendorId(String vendorId) {
        this.vendorId = vendorId;
        return this;
    }
    public String getVendorId() {
        return this.vendorId;
    }

}
