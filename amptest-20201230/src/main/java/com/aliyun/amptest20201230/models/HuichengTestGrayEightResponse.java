// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGrayEightResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public HuichengTestGrayEightResponseBody body;

    public static HuichengTestGrayEightResponse build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGrayEightResponse self = new HuichengTestGrayEightResponse();
        return TeaModel.build(map, self);
    }

    public HuichengTestGrayEightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HuichengTestGrayEightResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HuichengTestGrayEightResponse setBody(HuichengTestGrayEightResponseBody body) {
        this.body = body;
        return this;
    }
    public HuichengTestGrayEightResponseBody getBody() {
        return this.body;
    }

}
