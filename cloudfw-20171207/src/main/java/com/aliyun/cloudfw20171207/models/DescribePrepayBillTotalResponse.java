// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePrepayBillTotalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePrepayBillTotalResponseBody body;

    public static DescribePrepayBillTotalResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePrepayBillTotalResponse self = new DescribePrepayBillTotalResponse();
        return TeaModel.build(map, self);
    }

    public DescribePrepayBillTotalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePrepayBillTotalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePrepayBillTotalResponse setBody(DescribePrepayBillTotalResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePrepayBillTotalResponseBody getBody() {
        return this.body;
    }

}
