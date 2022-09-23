// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryPoolMonthlyBillInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryPoolMonthlyBillInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPoolMonthlyBillInfoResponseBody self = new QueryPoolMonthlyBillInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPoolMonthlyBillInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPoolMonthlyBillInfoResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryPoolMonthlyBillInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
