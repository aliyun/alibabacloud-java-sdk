// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateNormalizationRuleRequest extends TeaModel {
    /**
     * <p>Specifies whether to pack non-standard fields into the extension field extend_content. Valid values:</p>
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
     * <p>The storage mode for extension fields. Valid values: flat, pack, and reject.</p>
     * 
     * <strong>example:</strong>
     * <p>flat</p>
     */
    @NameInMap("ExtendFieldStoreMode")
    public String extendFieldStoreMode;

    /**
     * <p>The language of the response. Valid values:</p>
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
     * <p>The category ID of the normalization rule.</p>
     * 
     * <strong>example:</strong>
     * <p>NETWORK_CATEGORY</p>
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
     * <p>The expression of the normalization rule.</p>
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
     * <p>The list of normalization rule IDs.</p>
     */
    @NameInMap("NormalizationRuleIds")
    public java.util.List<String> normalizationRuleIds;

    /**
     * <p>The mode of the normalization rule. Valid values:</p>
     * <ul>
     * <li>both</li>
     * <li>scan</li>
     * <li>realtime.</li>
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
     * <p>The version of the normalization rule.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NormalizationRuleVersion")
    public Integer normalizationRuleVersion;

    /**
     * <p>The normalization schema ID.</p>
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
     * <p>The field used to sort the rule list. Valid values:</p>
     * <ul>
     * <li>GmtModified: sorted by modification time.</li>
     * <li>Id: sorted by rule ID (default).</li>
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
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the region where your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in the Chinese mainland.</li>
     * <li>ap-southeast-1: Your assets reside outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the member accounts in the resource directory.</p>
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

    public CreateNormalizationRuleRequest setNormalizationSecurityDomainId(String normalizationSecurityDomainId) {
        this.normalizationSecurityDomainId = normalizationSecurityDomainId;
        return this;
    }
    public String getNormalizationSecurityDomainId() {
        return this.normalizationSecurityDomainId;
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
