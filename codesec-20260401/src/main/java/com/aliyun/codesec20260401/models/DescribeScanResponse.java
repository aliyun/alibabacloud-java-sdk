// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class DescribeScanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScanResponseBody body;

    public static DescribeScanResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScanResponse self = new DescribeScanResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScanResponse setBody(DescribeScanResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScanResponseBody getBody() {
        return this.body;
    }

}
