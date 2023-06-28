// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ConcurrencyConfig extends TeaModel {
    @NameInMap("functionArn")
    public String functionArn;

    @NameInMap("reservedConcurrency")
    public Long reservedConcurrency;

    public static ConcurrencyConfig build(java.util.Map<String, ?> map) throws Exception {
        ConcurrencyConfig self = new ConcurrencyConfig();
        return TeaModel.build(map, self);
    }

    public ConcurrencyConfig setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
        return this;
    }
    public String getFunctionArn() {
        return this.functionArn;
    }

    public ConcurrencyConfig setReservedConcurrency(Long reservedConcurrency) {
        this.reservedConcurrency = reservedConcurrency;
        return this;
    }
    public Long getReservedConcurrency() {
        return this.reservedConcurrency;
    }

}
