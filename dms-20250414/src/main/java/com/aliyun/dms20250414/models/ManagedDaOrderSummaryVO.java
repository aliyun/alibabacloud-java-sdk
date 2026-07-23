// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ManagedDaOrderSummaryVO extends TeaModel {
    @NameInMap("availableQuota")
    public Integer availableQuota;

    @NameInMap("totalQuota")
    public Integer totalQuota;

    @NameInMap("trialExpireTime")
    public String trialExpireTime;

    @NameInMap("trialUsed")
    public Boolean trialUsed;

    @NameInMap("usedQuota")
    public Integer usedQuota;

    @NameInMap("validOrderCount")
    public Integer validOrderCount;

    public static ManagedDaOrderSummaryVO build(java.util.Map<String, ?> map) throws Exception {
        ManagedDaOrderSummaryVO self = new ManagedDaOrderSummaryVO();
        return TeaModel.build(map, self);
    }

    public ManagedDaOrderSummaryVO setAvailableQuota(Integer availableQuota) {
        this.availableQuota = availableQuota;
        return this;
    }
    public Integer getAvailableQuota() {
        return this.availableQuota;
    }

    public ManagedDaOrderSummaryVO setTotalQuota(Integer totalQuota) {
        this.totalQuota = totalQuota;
        return this;
    }
    public Integer getTotalQuota() {
        return this.totalQuota;
    }

    public ManagedDaOrderSummaryVO setTrialExpireTime(String trialExpireTime) {
        this.trialExpireTime = trialExpireTime;
        return this;
    }
    public String getTrialExpireTime() {
        return this.trialExpireTime;
    }

    public ManagedDaOrderSummaryVO setTrialUsed(Boolean trialUsed) {
        this.trialUsed = trialUsed;
        return this;
    }
    public Boolean getTrialUsed() {
        return this.trialUsed;
    }

    public ManagedDaOrderSummaryVO setUsedQuota(Integer usedQuota) {
        this.usedQuota = usedQuota;
        return this;
    }
    public Integer getUsedQuota() {
        return this.usedQuota;
    }

    public ManagedDaOrderSummaryVO setValidOrderCount(Integer validOrderCount) {
        this.validOrderCount = validOrderCount;
        return this;
    }
    public Integer getValidOrderCount() {
        return this.validOrderCount;
    }

}
