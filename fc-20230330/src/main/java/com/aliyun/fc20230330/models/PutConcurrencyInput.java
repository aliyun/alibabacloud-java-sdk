// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PutConcurrencyInput extends TeaModel {
    @NameInMap("reservedConcurrency")
    public Long reservedConcurrency;

    public static PutConcurrencyInput build(java.util.Map<String, ?> map) throws Exception {
        PutConcurrencyInput self = new PutConcurrencyInput();
        return TeaModel.build(map, self);
    }

    public PutConcurrencyInput setReservedConcurrency(Long reservedConcurrency) {
        this.reservedConcurrency = reservedConcurrency;
        return this;
    }
    public Long getReservedConcurrency() {
        return this.reservedConcurrency;
    }

}
