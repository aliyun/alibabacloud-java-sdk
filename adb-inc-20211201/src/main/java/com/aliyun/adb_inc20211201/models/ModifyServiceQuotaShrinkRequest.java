// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class ModifyServiceQuotaShrinkRequest extends TeaModel {
    @NameInMap("AliyunUid")
    public String aliyunUid;

    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("Dimensions")
    public String dimensionsShrink;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

    @NameInMap("QuotaCategory")
    public String quotaCategory;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Value")
    public String value;

    public static ModifyServiceQuotaShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyServiceQuotaShrinkRequest self = new ModifyServiceQuotaShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyServiceQuotaShrinkRequest setAliyunUid(String aliyunUid) {
        this.aliyunUid = aliyunUid;
        return this;
    }
    public String getAliyunUid() {
        return this.aliyunUid;
    }

    public ModifyServiceQuotaShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ModifyServiceQuotaShrinkRequest setDimensionsShrink(String dimensionsShrink) {
        this.dimensionsShrink = dimensionsShrink;
        return this;
    }
    public String getDimensionsShrink() {
        return this.dimensionsShrink;
    }

    public ModifyServiceQuotaShrinkRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ModifyServiceQuotaShrinkRequest setQuotaActionCode(String quotaActionCode) {
        this.quotaActionCode = quotaActionCode;
        return this;
    }
    public String getQuotaActionCode() {
        return this.quotaActionCode;
    }

    public ModifyServiceQuotaShrinkRequest setQuotaCategory(String quotaCategory) {
        this.quotaCategory = quotaCategory;
        return this;
    }
    public String getQuotaCategory() {
        return this.quotaCategory;
    }

    public ModifyServiceQuotaShrinkRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public ModifyServiceQuotaShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyServiceQuotaShrinkRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
