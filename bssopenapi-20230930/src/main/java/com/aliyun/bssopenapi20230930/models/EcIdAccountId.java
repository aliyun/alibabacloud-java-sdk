// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class EcIdAccountId extends TeaModel {
    @NameInMap("AccountIds")
    public java.util.List<Long> accountIds;

    @NameInMap("EcId")
    public String ecId;

    public static EcIdAccountId build(java.util.Map<String, ?> map) throws Exception {
        EcIdAccountId self = new EcIdAccountId();
        return TeaModel.build(map, self);
    }

    public EcIdAccountId setAccountIds(java.util.List<Long> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.List<Long> getAccountIds() {
        return this.accountIds;
    }

    public EcIdAccountId setEcId(String ecId) {
        this.ecId = ecId;
        return this;
    }
    public String getEcId() {
        return this.ecId;
    }

}
