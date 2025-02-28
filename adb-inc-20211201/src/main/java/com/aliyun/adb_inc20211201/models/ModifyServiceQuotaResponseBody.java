// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class ModifyServiceQuotaResponseBody extends TeaModel {
    @NameInMap("Dimensions")
    public java.util.Map<String, String> dimensions;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("QuotaActionCode")
    public String quotaActionCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalQuota")
    public Long totalQuota;

    @NameInMap("TotalUsage")
    public Long totalUsage;

    public static ModifyServiceQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyServiceQuotaResponseBody self = new ModifyServiceQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyServiceQuotaResponseBody setDimensions(java.util.Map<String, String> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.Map<String, String> getDimensions() {
        return this.dimensions;
    }

    public ModifyServiceQuotaResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public ModifyServiceQuotaResponseBody setQuotaActionCode(String quotaActionCode) {
        this.quotaActionCode = quotaActionCode;
        return this;
    }
    public String getQuotaActionCode() {
        return this.quotaActionCode;
    }

    public ModifyServiceQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyServiceQuotaResponseBody setTotalQuota(Long totalQuota) {
        this.totalQuota = totalQuota;
        return this;
    }
    public Long getTotalQuota() {
        return this.totalQuota;
    }

    public ModifyServiceQuotaResponseBody setTotalUsage(Long totalUsage) {
        this.totalUsage = totalUsage;
        return this;
    }
    public Long getTotalUsage() {
        return this.totalUsage;
    }

}
