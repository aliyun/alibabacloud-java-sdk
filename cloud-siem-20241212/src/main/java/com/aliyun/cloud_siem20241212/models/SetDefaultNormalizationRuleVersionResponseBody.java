// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class SetDefaultNormalizationRuleVersionResponseBody extends TeaModel {
    /**
     * <p>The normalization rule version.</p>
     */
    @NameInMap("NormalizationRuleVersion")
    public SetDefaultNormalizationRuleVersionResponseBodyNormalizationRuleVersion normalizationRuleVersion;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetDefaultNormalizationRuleVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultNormalizationRuleVersionResponseBody self = new SetDefaultNormalizationRuleVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDefaultNormalizationRuleVersionResponseBody setNormalizationRuleVersion(SetDefaultNormalizationRuleVersionResponseBodyNormalizationRuleVersion normalizationRuleVersion) {
        this.normalizationRuleVersion = normalizationRuleVersion;
        return this;
    }
    public SetDefaultNormalizationRuleVersionResponseBodyNormalizationRuleVersion getNormalizationRuleVersion() {
        return this.normalizationRuleVersion;
    }

    public SetDefaultNormalizationRuleVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SetDefaultNormalizationRuleVersionResponseBodyNormalizationRuleVersion extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1733269771123</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The normalization rule category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>NETWORK_CATEGORY</p>
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
         * <p>The normalization rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>normalization_rule_Z57np</p>
         */
        @NameInMap("NormalizationRuleName")
        public String normalizationRuleName;

        /**
         * <p>The normalization rule status.</p>
         * 
         * <strong>example:</strong>
         * <p>started</p>
         */
        @NameInMap("NormalizationRuleStatus")
        public String normalizationRuleStatus;

        /**
         * <p>The normalization rule type. Valid values:</p>
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
         * <p>The current version of the normalization rule.</p>
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

        public static SetDefaultNormalizationRuleVersionResponseBodyNormalizationRuleVersion build(java.util.Map<String, ?> map) throws Exception {
            SetDefaultNormalizationRuleVersionResponseBodyNormalizationRuleVersion self = new SetDefaultNormalizationRuleVersionResponseBodyNormalizationRuleVersion();
            return TeaModel.build(map, self);
        }

        public SetDefaultNormalizationRuleVersionResponseBodyNormalizationRuleVersion setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public SetDefaultNormalizationRuleVersionResponseBodyNormalizationRuleVersion setNormalizationCategoryId(String normalizationCategoryId) {
            this.normalizationCategoryId = normalizationCategoryId;
            return this;
        }
        public String getNormalizationCategoryId() {
            return this.normalizationCategoryId;
        }

        public SetDefaultNormalizationRuleVersionResponseBodyNormalizationRuleVersion setNormalizationRuleDescription(String normalizationRuleDescription) {
            this.normalizationRuleDescription = normalizationRuleDescription;
            return this;
        }
        public String getNormalizationRuleDescription() {
            return this.normalizationRuleDescription;
        }

        public SetDefaultNormalizationRuleVersionResponseBodyNormalizationRuleVersion setNormalizationRuleExpression(String normalizationRuleExpression) {
            this.normalizationRuleExpression = normalizationRuleExpression;
            return this;
        }
        public String getNormalizationRuleExpression() {
            return this.normalizationRuleExpression;
        }

        public SetDefaultNormalizationRuleVersionResponseBodyNormalizationRuleVersion setNormalizationRuleFormat(String normalizationRuleFormat) {
            this.normalizationRuleFormat = normalizationRuleFormat;
            return this;
        }
        public String getNormalizationRuleFormat() {
            return this.normalizationRuleFormat;
        }

        public SetDefaultNormalizationRuleVersionResponseBodyNormalizationRuleVersion setNormalizationRuleId(String normalizationRuleId) {
            this.normalizationRuleId = normalizationRuleId;
            return this;
        }
        public String getNormalizationRuleId() {
            return this.normalizationRuleId;
        }

        public SetDefaultNormalizationRuleVersionResponseBodyNormalizationRuleVersion setNormalizationRuleName(String normalizationRuleName) {
            this.normalizationRuleName = normalizationRuleName;
            return this;
        }
        public String getNormalizationRuleName() {
            return this.normalizationRuleName;
        }

        public SetDefaultNormalizationRuleVersionResponseBodyNormalizationRuleVersion setNormalizationRuleStatus(String normalizationRuleStatus) {
            this.normalizationRuleStatus = normalizationRuleStatus;
            return this;
        }
        public String getNormalizationRuleStatus() {
            return this.normalizationRuleStatus;
        }

        public SetDefaultNormalizationRuleVersionResponseBodyNormalizationRuleVersion setNormalizationRuleType(String normalizationRuleType) {
            this.normalizationRuleType = normalizationRuleType;
            return this;
        }
        public String getNormalizationRuleType() {
            return this.normalizationRuleType;
        }

        public SetDefaultNormalizationRuleVersionResponseBodyNormalizationRuleVersion setNormalizationRuleVersion(Integer normalizationRuleVersion) {
            this.normalizationRuleVersion = normalizationRuleVersion;
            return this;
        }
        public Integer getNormalizationRuleVersion() {
            return this.normalizationRuleVersion;
        }

        public SetDefaultNormalizationRuleVersionResponseBodyNormalizationRuleVersion setNormalizationSchemaId(String normalizationSchemaId) {
            this.normalizationSchemaId = normalizationSchemaId;
            return this;
        }
        public String getNormalizationSchemaId() {
            return this.normalizationSchemaId;
        }

        public SetDefaultNormalizationRuleVersionResponseBodyNormalizationRuleVersion setNormalizationSecurityDomainId(String normalizationSecurityDomainId) {
            this.normalizationSecurityDomainId = normalizationSecurityDomainId;
            return this;
        }
        public String getNormalizationSecurityDomainId() {
            return this.normalizationSecurityDomainId;
        }

        public SetDefaultNormalizationRuleVersionResponseBodyNormalizationRuleVersion setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public SetDefaultNormalizationRuleVersionResponseBodyNormalizationRuleVersion setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public SetDefaultNormalizationRuleVersionResponseBodyNormalizationRuleVersion setVendorId(String vendorId) {
            this.vendorId = vendorId;
            return this;
        }
        public String getVendorId() {
            return this.vendorId;
        }

    }

}
