// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGraySecondResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public HuichengTestGraySecondResponseBody body;

    public static HuichengTestGraySecondResponse build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGraySecondResponse self = new HuichengTestGraySecondResponse();
        return TeaModel.build(map, self);
    }

    public HuichengTestGraySecondResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HuichengTestGraySecondResponse setBody(HuichengTestGraySecondResponseBody body) {
        this.body = body;
        return this;
    }
    public HuichengTestGraySecondResponseBody getBody() {
        return this.body;
    }

}
