// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetNormalizationRuleVersionResponseBody extends TeaModel {
    @NameInMap("NormalizationRuleVersion")
    public GetNormalizationRuleVersionResponseBodyNormalizationRuleVersion normalizationRuleVersion;

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
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("NormalizationCategoryId")
        public String normalizationCategoryId;

        @NameInMap("NormalizationRuleDescription")
        public String normalizationRuleDescription;

        @NameInMap("NormalizationRuleExpression")
        public String normalizationRuleExpression;

        @NameInMap("NormalizationRuleFormat")
        public String normalizationRuleFormat;

        @NameInMap("NormalizationRuleId")
        public String normalizationRuleId;

        @NameInMap("NormalizationRuleName")
        public String normalizationRuleName;

        @NameInMap("NormalizationRuleStatus")
        public String normalizationRuleStatus;

        @NameInMap("NormalizationRuleType")
        public String normalizationRuleType;

        @NameInMap("NormalizationRuleVersion")
        public Integer normalizationRuleVersion;

        @NameInMap("NormalizationRuleVersionName")
        public String normalizationRuleVersionName;

        @NameInMap("NormalizationSchemaId")
        public String normalizationSchemaId;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("UpdateTime")
        public Long updateTime;

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
