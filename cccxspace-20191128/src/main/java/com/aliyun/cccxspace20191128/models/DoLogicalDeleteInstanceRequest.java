// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class DoLogicalDeleteInstanceRequest extends TeaModel {
    @NameInMap("AccountId")
    public Long accountId;

    public static DoLogicalDeleteInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DoLogicalDeleteInstanceRequest self = new DoLogicalDeleteInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DoLogicalDeleteInstanceRequest setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

}
