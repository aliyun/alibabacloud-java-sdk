// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetNormalizationRuleResponseBody extends TeaModel {
    @NameInMap("NormalizationRule")
    public GetNormalizationRuleResponseBodyNormalizationRule normalizationRule;

    /**
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****。</p>
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
         * <strong>example:</strong>
         * <p>1733269771123。</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

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

        /**
         * <strong>example:</strong>
         * <p>nr-z0b2ssjteut85uoh9nzp。</p>
         */
        @NameInMap("NormalizationRuleId")
        public String normalizationRuleId;

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

        /**
         * <strong>example:</strong>
         * <p>started。</p>
         */
        @NameInMap("NormalizationRuleStatus")
        public String normalizationRuleStatus;

        /**
         * <strong>example:</strong>
         * <p>predefined。</p>
         */
        @NameInMap("NormalizationRuleType")
        public String normalizationRuleType;

        /**
         * <strong>example:</strong>
         * <p>V1。</p>
         */
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
         * <p>1733269771123。</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <strong>example:</strong>
         * <p>alibaba_cloud。</p>
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
