// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class SetCreditLimitRequest extends TeaModel {
    @NameInMap("AliyunPk")
    public Long aliyunPk;

    @NameInMap("EndUserPk")
    public Long endUserPk;

    @NameInMap("Quota")
    public String quota;

    public static SetCreditLimitRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCreditLimitRequest self = new SetCreditLimitRequest();
        return TeaModel.build(map, self);
    }

    public SetCreditLimitRequest setAliyunPk(Long aliyunPk) {
        this.aliyunPk = aliyunPk;
        return this;
    }
    public Long getAliyunPk() {
        return this.aliyunPk;
    }

    public SetCreditLimitRequest setEndUserPk(Long endUserPk) {
        this.endUserPk = endUserPk;
        return this;
    }
    public Long getEndUserPk() {
        return this.endUserPk;
    }

    public SetCreditLimitRequest setQuota(String quota) {
        this.quota = quota;
        return this;
    }
    public String getQuota() {
        return this.quota;
    }

}
