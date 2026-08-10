// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codesec20260401.models;

import com.aliyun.tea.*;

public class DescribeScanResultsByEngineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScanResultsByEngineResponseBody body;

    public static DescribeScanResultsByEngineResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScanResultsByEngineResponse self = new DescribeScanResultsByEngineResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScanResultsByEngineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScanResultsByEngineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScanResultsByEngineResponse setBody(DescribeScanResultsByEngineResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScanResultsByEngineResponseBody getBody() {
        return this.body;
    }

}
