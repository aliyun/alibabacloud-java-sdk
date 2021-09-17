// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class PhysicalDeleteInstanceRequest extends TeaModel {
    @NameInMap("AccountId")
    public Long accountId;

    public static PhysicalDeleteInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        PhysicalDeleteInstanceRequest self = new PhysicalDeleteInstanceRequest();
        return TeaModel.build(map, self);
    }

    public PhysicalDeleteInstanceRequest setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

}
