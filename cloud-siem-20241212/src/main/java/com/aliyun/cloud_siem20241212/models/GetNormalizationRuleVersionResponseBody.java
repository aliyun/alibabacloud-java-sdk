// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetNormalizationRuleVersionResponseBody extends TeaModel {
    /**
     * <p>The version of the normalization rule.</p>
     */
    @NameInMap("NormalizationRuleVersion")
    public GetNormalizationRuleVersionResponseBodyNormalizationRuleVersion normalizationRuleVersion;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetNormalizationRuleVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNormalizationRuleVersionResponseBody self = new GetNormalizationRuleVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNormalizationRuleVersionResponseBody setNormalizationRuleVersion(GetNormalizationRuleVersionResponseBodyNormalizationRuleVersion normalizationRuleVersion) {
        this.normalizationRuleVersion = normalizationRuleVersion;
        return this;
    }
    public GetNormalizationRuleVersionResponseBodyNormalizationRuleVersion getNormalizationRuleVersion() {
        return this.normalizationRuleVersion;
    }

    public GetNormalizationRuleVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetNormalizationRuleVersionResponseBodyNormalizationRuleVersion extends TeaModel {
        /**
         * <p>The time when the rule version was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1733269771123</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the normalization rule category.</p>
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
         * <li><p>predefined: a predefined rule.</p>
         * </li>
         * <li><p>custom: a custom rule.</p>
         * </li>
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
         * <p>The name of the normalization rule version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("NormalizationRuleVersionName")
        public String normalizationRuleVersionName;

        /**
         * <p>The ID of the normalization schema.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP_ACTIVITY</p>
         */
        @NameInMap("NormalizationSchemaId")
        public String normalizationSchemaId;

        /**
         * <p>The product ID.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud_sas</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>The region where the Data Management center for Threat Analysis is located. Select a region for the management center based on the region where your assets are located. Valid values:</p>
         * <ul>
         * <li><p>cn-hangzhou: Your assets are in the Chinese mainland.</p>
         * </li>
         * <li><p>ap-southeast-1: Your assets are in a region outside China.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The time when the rule version was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1733269771123</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The ID of the vendor for the normalization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud</p>
         */
        @NameInMap("VendorId")
        public String vendorId;

        public static GetNormalizationRuleVersionResponseBodyNormalizationRuleVersion build(java.util.Map<String, ?> map) throws Exception {
            GetNormalizationRuleVersionResponseBodyNormalizationRuleVersion self = new GetNormalizationRuleVersionResponseBodyNormalizationRuleVersion();
            return TeaModel.build(map, self);
        }

        public GetNormalizationRuleVersionResponseBodyNormalizationRuleVersion setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetNormalizationRuleVersionResponseBodyNormalizationRuleVersion setNormalizationCategoryId(String normalizationCategoryId) {
            this.normalizationCategoryId = normalizationCategoryId;
            return this;
        }
        public String getNormalizationCategoryId() {
            return this.normalizationCategoryId;
        }

        public GetNormalizationRuleVersionResponseBodyNormalizationRuleVersion setNormalizationRuleDescription(String normalizationRuleDescription) {
            this.normalizationRuleDescription = normalizationRuleDescription;
            return this;
        }
        public String getNormalizationRuleDescription() {
            return this.normalizationRuleDescription;
        }

        public GetNormalizationRuleVersionResponseBodyNormalizationRuleVersion setNormalizationRuleExpression(String normalizationRuleExpression) {
            this.normalizationRuleExpression = normalizationRuleExpression;
            return this;
        }
        public String getNormalizationRuleExpression() {
            return this.normalizationRuleExpression;
        }

        public GetNormalizationRuleVersionResponseBodyNormalizationRuleVersion setNormalizationRuleFormat(String normalizationRuleFormat) {
            this.normalizationRuleFormat = normalizationRuleFormat;
            return this;
        }
        public String getNormalizationRuleFormat() {
            return this.normalizationRuleFormat;
        }

        public GetNormalizationRuleVersionResponseBodyNormalizationRuleVersion setNormalizationRuleId(String normalizationRuleId) {
            this.normalizationRuleId = normalizationRuleId;
            return this;
        }
        public String getNormalizationRuleId() {
            return this.normalizationRuleId;
        }

        public GetNormalizationRuleVersionResponseBodyNormalizationRuleVersion setNormalizationRuleName(String normalizationRuleName) {
            this.normalizationRuleName = normalizationRuleName;
            return this;
        }
        public String getNormalizationRuleName() {
            return this.normalizationRuleName;
        }

        public GetNormalizationRuleVersionResponseBodyNormalizationRuleVersion setNormalizationRuleStatus(String normalizationRuleStatus) {
            this.normalizationRuleStatus = normalizationRuleStatus;
            return this;
        }
        public String getNormalizationRuleStatus() {
            return this.normalizationRuleStatus;
        }

        public GetNormalizationRuleVersionResponseBodyNormalizationRuleVersion setNormalizationRuleType(String normalizationRuleType) {
            this.normalizationRuleType = normalizationRuleType;
            return this;
        }
        public String getNormalizationRuleType() {
            return this.normalizationRuleType;
        }

        public GetNormalizationRuleVersionResponseBodyNormalizationRuleVersion setNormalizationRuleVersion(Integer normalizationRuleVersion) {
            this.normalizationRuleVersion = normalizationRuleVersion;
            return this;
        }
        public Integer getNormalizationRuleVersion() {
            return this.normalizationRuleVersion;
        }

        public GetNormalizationRuleVersionResponseBodyNormalizationRuleVersion setNormalizationRuleVersionName(String normalizationRuleVersionName) {
            this.normalizationRuleVersionName = normalizationRuleVersionName;
            return this;
        }
        public String getNormalizationRuleVersionName() {
            return this.normalizationRuleVersionName;
        }

        public GetNormalizationRuleVersionResponseBodyNormalizationRuleVersion setNormalizationSchemaId(String normalizationSchemaId) {
            this.normalizationSchemaId = normalizationSchemaId;
            return this;
        }
        public String getNormalizationSchemaId() {
            return this.normalizationSchemaId;
        }

        public GetNormalizationRuleVersionResponseBodyNormalizationRuleVersion setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public GetNormalizationRuleVersionResponseBodyNormalizationRuleVersion setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetNormalizationRuleVersionResponseBodyNormalizationRuleVersion setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetNormalizationRuleVersionResponseBodyNormalizationRuleVersion setVendorId(String vendorId) {
            this.vendorId = vendorId;
            return this;
        }
        public String getVendorId() {
            return this.vendorId;
        }

    }

}
