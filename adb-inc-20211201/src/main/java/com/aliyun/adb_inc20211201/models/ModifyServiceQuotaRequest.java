// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class ModifyServiceQuotaRequest extends TeaModel {
    @NameInMap("AliyunUid")
    public String aliyunUid;

    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("Dimensions")
    public java.util.Map<String, ?> dimensions;

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

    public static ModifyServiceQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyServiceQuotaRequest self = new ModifyServiceQuotaRequest();
        return TeaModel.build(map, self);
    }

    public ModifyServiceQuotaRequest setAliyunUid(String aliyunUid) {
        this.aliyunUid = aliyunUid;
        return this;
    }
    public String getAliyunUid() {
        return this.aliyunUid;
    }

    public ModifyServiceQuotaRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ModifyServiceQuotaRequest setDimensions(java.util.Map<String, ?> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.Map<String, ?> getDimensions() {
        return this.dimensions;
    }

    public ModifyServiceQuotaRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ModifyServiceQuotaRequest setQuotaActionCode(String quotaActionCode) {
        this.quotaActionCode = quotaActionCode;
        return this;
    }
    public String getQuotaActionCode() {
        return this.quotaActionCode;
    }

    public ModifyServiceQuotaRequest setQuotaCategory(String quotaCategory) {
        this.quotaCategory = quotaCategory;
        return this;
    }
    public String getQuotaCategory() {
        return this.quotaCategory;
    }

    public ModifyServiceQuotaRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public ModifyServiceQuotaRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyServiceQuotaRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
