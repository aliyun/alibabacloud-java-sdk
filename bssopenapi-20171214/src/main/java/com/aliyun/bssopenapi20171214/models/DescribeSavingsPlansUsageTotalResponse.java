// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeSavingsPlansUsageTotalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSavingsPlansUsageTotalResponseBody body;

    public static DescribeSavingsPlansUsageTotalResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSavingsPlansUsageTotalResponse self = new DescribeSavingsPlansUsageTotalResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSavingsPlansUsageTotalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSavingsPlansUsageTotalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSavingsPlansUsageTotalResponse setBody(DescribeSavingsPlansUsageTotalResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSavingsPlansUsageTotalResponseBody getBody() {
        return this.body;
    }

}
