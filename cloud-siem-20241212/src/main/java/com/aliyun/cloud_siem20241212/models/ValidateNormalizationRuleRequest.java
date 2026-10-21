// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ValidateNormalizationRuleRequest extends TeaModel {
    /**
     * <p>The ID of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The storage mode of extended fields. Valid values: flat, pack, and reject.</p>
     * 
     * <strong>example:</strong>
     * <p>flat</p>
     */
    @NameInMap("ExtendFieldStoreMode")
    public String extendFieldStoreMode;

    /**
     * <p>The language of the response message. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Note: This parameter is required in actual API calls. If this parameter is not provided, the service returns a 400 error with the message \&quot;The specified Lang can not be empty.\&quot; Explicitly specify the language code.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The log sample in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;aaa&quot;:&quot;bbb&quot;,&quot;xxx&quot;:&quot;yyy&quot;}</p>
     */
    @NameInMap("LogSample")
    public String logSample;

    /**
     * <p>The normalization category to which the rule belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>NETWORK_CATEGORY</p>
     */
    @NameInMap("NormalizationCategoryId")
    public String normalizationCategoryId;

    /**
     * <p>The expression of the normalization rule.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("NormalizationRuleExpression")
    public String normalizationRuleExpression;

    /**
     * <p>The mode of the normalization rule. Valid values: both and realtime.</p>
     * 
     * <strong>example:</strong>
     * <p>realtime</p>
     */
    @NameInMap("NormalizationRuleMode")
    public String normalizationRuleMode;

    /**
     * <p>The ID of the normalization schema to which the rule belongs. This parameter is required in actual API calls. If this parameter is not provided, the service returns a 400 error.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP_ACTIVITY</p>
     */
    @NameInMap("NormalizationSchemaId")
    public String normalizationSchemaId;

    /**
     * <p>The ID of the product.</p>
     * 
     * <strong>example:</strong>
     * <p>alibaba_cloud_sas</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The region where the data management center of Threat Analysis is located. Select the region of the management center based on the region where your assets are located. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: The assets are located in the Chinese mainland.</li>
     * <li>ap-southeast-1: The assets are located outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the user whose perspective the administrator switches to.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The ID of the vendor.</p>
     * 
     * <strong>example:</strong>
     * <p>alibaba_cloud</p>
     */
    @NameInMap("VendorId")
    public String vendorId;

    public static ValidateNormalizationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateNormalizationRuleRequest self = new ValidateNormalizationRuleRequest();
        return TeaModel.build(map, self);
    }

    public ValidateNormalizationRuleRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ValidateNormalizationRuleRequest setExtendFieldStoreMode(String extendFieldStoreMode) {
        this.extendFieldStoreMode = extendFieldStoreMode;
        return this;
    }
    public String getExtendFieldStoreMode() {
        return this.extendFieldStoreMode;
    }

    public ValidateNormalizationRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ValidateNormalizationRuleRequest setLogSample(String logSample) {
        this.logSample = logSample;
        return this;
    }
    public String getLogSample() {
        return this.logSample;
    }

    public ValidateNormalizationRuleRequest setNormalizationCategoryId(String normalizationCategoryId) {
        this.normalizationCategoryId = normalizationCategoryId;
        return this;
    }
    public String getNormalizationCategoryId() {
        return this.normalizationCategoryId;
    }

    public ValidateNormalizationRuleRequest setNormalizationRuleExpression(String normalizationRuleExpression) {
        this.normalizationRuleExpression = normalizationRuleExpression;
        return this;
    }
    public String getNormalizationRuleExpression() {
        return this.normalizationRuleExpression;
    }

    public ValidateNormalizationRuleRequest setNormalizationRuleMode(String normalizationRuleMode) {
        this.normalizationRuleMode = normalizationRuleMode;
        return this;
    }
    public String getNormalizationRuleMode() {
        return this.normalizationRuleMode;
    }

    public ValidateNormalizationRuleRequest setNormalizationSchemaId(String normalizationSchemaId) {
        this.normalizationSchemaId = normalizationSchemaId;
        return this;
    }
    public String getNormalizationSchemaId() {
        return this.normalizationSchemaId;
    }

    public ValidateNormalizationRuleRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public ValidateNormalizationRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ValidateNormalizationRuleRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public ValidateNormalizationRuleRequest setVendorId(String vendorId) {
        this.vendorId = vendorId;
        return this;
    }
    public String getVendorId() {
        return this.vendorId;
    }

}
