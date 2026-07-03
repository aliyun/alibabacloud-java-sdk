// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetNormalizationRuleResponseBody extends TeaModel {
    /**
     * <p>The normalization rule.</p>
     */
    @NameInMap("NormalizationRule")
    public GetNormalizationRuleResponseBodyNormalizationRule normalizationRule;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetNormalizationRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNormalizationRuleResponseBody self = new GetNormalizationRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNormalizationRuleResponseBody setNormalizationRule(GetNormalizationRuleResponseBodyNormalizationRule normalizationRule) {
        this.normalizationRule = normalizationRule;
        return this;
    }
    public GetNormalizationRuleResponseBodyNormalizationRule getNormalizationRule() {
        return this.normalizationRule;
    }

    public GetNormalizationRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetNormalizationRuleResponseBodyNormalizationRule extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1733269771123</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Specifies whether to pack non-standard fields into the extend_content field. Valid values:</p>
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
         * <p>The storage mode for extended fields. Valid values:</p>
         * <ul>
         * <li>flat: ingested as-is.</li>
         * <li>reject: not ingested.</li>
         * <li>pack: packed into the extend_content field.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>flat</p>
         */
        @NameInMap("ExtendFieldStoreMode")
        public String extendFieldStoreMode;

        /**
         * <p>The category ID of the normalization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>NETWORK_CATEGORY</p>
         */
        @NameInMap("NormalizationCategoryId")
        public String normalizationCategoryId;

        /**
         * <strong>example:</strong>
         * <p>normalized</p>
         */
        @NameInMap("NormalizationFieldSource")
        public String normalizationFieldSource;

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
         * <p>The status of the normalization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>started</p>
         */
        @NameInMap("NormalizationRuleStatus")
        public String normalizationRuleStatus;

        /**
         * <p>The type of the normalization rule. Valid values:</p>
         * <ul>
         * <li>predefined: predefined normalization rule.</li>
         * <li>custom: custom normalization rule.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>predefined</p>
         */
        @NameInMap("NormalizationRuleType")
        public String normalizationRuleType;

        /**
         * <p>The version of the normalization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>V1</p>
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
         * <p>GmtModified</p>
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
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1733269771123</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The vendor ID associated with the normalization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud</p>
         */
        @NameInMap("VendorId")
        public String vendorId;

        public static GetNormalizationRuleResponseBodyNormalizationRule build(java.util.Map<String, ?> map) throws Exception {
            GetNormalizationRuleResponseBodyNormalizationRule self = new GetNormalizationRuleResponseBodyNormalizationRule();
            return TeaModel.build(map, self);
        }

        public GetNormalizationRuleResponseBodyNormalizationRule setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetNormalizationRuleResponseBodyNormalizationRule setExtendContentPacked(String extendContentPacked) {
            this.extendContentPacked = extendContentPacked;
            return this;
        }
        public String getExtendContentPacked() {
            return this.extendContentPacked;
        }

        public GetNormalizationRuleResponseBodyNormalizationRule setExtendFieldStoreMode(String extendFieldStoreMode) {
            this.extendFieldStoreMode = extendFieldStoreMode;
            return this;
        }
        public String getExtendFieldStoreMode() {
            return this.extendFieldStoreMode;
        }

        public GetNormalizationRuleResponseBodyNormalizationRule setNormalizationCategoryId(String normalizationCategoryId) {
            this.normalizationCategoryId = normalizationCategoryId;
            return this;
        }
        public String getNormalizationCategoryId() {
            return this.normalizationCategoryId;
        }

        public GetNormalizationRuleResponseBodyNormalizationRule setNormalizationFieldSource(String normalizationFieldSource) {
            this.normalizationFieldSource = normalizationFieldSource;
            return this;
        }
        public String getNormalizationFieldSource() {
            return this.normalizationFieldSource;
        }

        public GetNormalizationRuleResponseBodyNormalizationRule setNormalizationRuleDescription(String normalizationRuleDescription) {
            this.normalizationRuleDescription = normalizationRuleDescription;
            return this;
        }
        public String getNormalizationRuleDescription() {
            return this.normalizationRuleDescription;
        }

        public GetNormalizationRuleResponseBodyNormalizationRule setNormalizationRuleExpression(String normalizationRuleExpression) {
            this.normalizationRuleExpression = normalizationRuleExpression;
            return this;
        }
        public String getNormalizationRuleExpression() {
            return this.normalizationRuleExpression;
        }

        public GetNormalizationRuleResponseBodyNormalizationRule setNormalizationRuleFormat(String normalizationRuleFormat) {
            this.normalizationRuleFormat = normalizationRuleFormat;
            return this;
        }
        public String getNormalizationRuleFormat() {
            return this.normalizationRuleFormat;
        }

        public GetNormalizationRuleResponseBodyNormalizationRule setNormalizationRuleId(String normalizationRuleId) {
            this.normalizationRuleId = normalizationRuleId;
            return this;
        }
        public String getNormalizationRuleId() {
            return this.normalizationRuleId;
        }

        public GetNormalizationRuleResponseBodyNormalizationRule setNormalizationRuleIds(java.util.List<String> normalizationRuleIds) {
            this.normalizationRuleIds = normalizationRuleIds;
            return this;
        }
        public java.util.List<String> getNormalizationRuleIds() {
            return this.normalizationRuleIds;
        }

        public GetNormalizationRuleResponseBodyNormalizationRule setNormalizationRuleMode(String normalizationRuleMode) {
            this.normalizationRuleMode = normalizationRuleMode;
            return this;
        }
        public String getNormalizationRuleMode() {
            return this.normalizationRuleMode;
        }

        public GetNormalizationRuleResponseBodyNormalizationRule setNormalizationRuleName(String normalizationRuleName) {
            this.normalizationRuleName = normalizationRuleName;
            return this;
        }
        public String getNormalizationRuleName() {
            return this.normalizationRuleName;
        }

        public GetNormalizationRuleResponseBodyNormalizationRule setNormalizationRuleStatus(String normalizationRuleStatus) {
            this.normalizationRuleStatus = normalizationRuleStatus;
            return this;
        }
        public String getNormalizationRuleStatus() {
            return this.normalizationRuleStatus;
        }

        public GetNormalizationRuleResponseBodyNormalizationRule setNormalizationRuleType(String normalizationRuleType) {
            this.normalizationRuleType = normalizationRuleType;
            return this;
        }
        public String getNormalizationRuleType() {
            return this.normalizationRuleType;
        }

        public GetNormalizationRuleResponseBodyNormalizationRule setNormalizationRuleVersion(Integer normalizationRuleVersion) {
            this.normalizationRuleVersion = normalizationRuleVersion;
            return this;
        }
        public Integer getNormalizationRuleVersion() {
            return this.normalizationRuleVersion;
        }

        public GetNormalizationRuleResponseBodyNormalizationRule setNormalizationSchemaId(String normalizationSchemaId) {
            this.normalizationSchemaId = normalizationSchemaId;
            return this;
        }
        public String getNormalizationSchemaId() {
            return this.normalizationSchemaId;
        }

        public GetNormalizationRuleResponseBodyNormalizationRule setNormalizationSecurityDomainId(String normalizationSecurityDomainId) {
            this.normalizationSecurityDomainId = normalizationSecurityDomainId;
            return this;
        }
        public String getNormalizationSecurityDomainId() {
            return this.normalizationSecurityDomainId;
        }

        public GetNormalizationRuleResponseBodyNormalizationRule setOrderField(String orderField) {
            this.orderField = orderField;
            return this;
        }
        public String getOrderField() {
            return this.orderField;
        }

        public GetNormalizationRuleResponseBodyNormalizationRule setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public GetNormalizationRuleResponseBodyNormalizationRule setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetNormalizationRuleResponseBodyNormalizationRule setVendorId(String vendorId) {
            this.vendorId = vendorId;
            return this;
        }
        public String getVendorId() {
            return this.vendorId;
        }

    }

}
