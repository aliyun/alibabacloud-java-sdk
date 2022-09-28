// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class ClearOutstandingBalanceRequest extends TeaModel {
    @NameInMap("AliyunPk")
    public Long aliyunPk;

    @NameInMap("DebtQuota")
    public String debtQuota;

    @NameInMap("EndUserPk")
    public Long endUserPk;

    public static ClearOutstandingBalanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ClearOutstandingBalanceRequest self = new ClearOutstandingBalanceRequest();
        return TeaModel.build(map, self);
    }

    public ClearOutstandingBalanceRequest setAliyunPk(Long aliyunPk) {
        this.aliyunPk = aliyunPk;
        return this;
    }
    public Long getAliyunPk() {
        return this.aliyunPk;
    }

    public ClearOutstandingBalanceRequest setDebtQuota(String debtQuota) {
        this.debtQuota = debtQuota;
        return this;
    }
    public String getDebtQuota() {
        return this.debtQuota;
    }

    public ClearOutstandingBalanceRequest setEndUserPk(Long endUserPk) {
        this.endUserPk = endUserPk;
        return this;
    }
    public Long getEndUserPk() {
        return this.endUserPk;
    }

}
