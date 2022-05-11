// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGrayFourthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public HuichengTestGrayFourthResponseBody body;

    public static HuichengTestGrayFourthResponse build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGrayFourthResponse self = new HuichengTestGrayFourthResponse();
        return TeaModel.build(map, self);
    }

    public HuichengTestGrayFourthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HuichengTestGrayFourthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HuichengTestGrayFourthResponse setBody(HuichengTestGrayFourthResponseBody body) {
        this.body = body;
        return this;
    }
    public HuichengTestGrayFourthResponseBody getBody() {
        return this.body;
    }

}
