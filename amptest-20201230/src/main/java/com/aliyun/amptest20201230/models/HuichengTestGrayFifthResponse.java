// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGrayFifthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public HuichengTestGrayFifthResponseBody body;

    public static HuichengTestGrayFifthResponse build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGrayFifthResponse self = new HuichengTestGrayFifthResponse();
        return TeaModel.build(map, self);
    }

    public HuichengTestGrayFifthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HuichengTestGrayFifthResponse setBody(HuichengTestGrayFifthResponseBody body) {
        this.body = body;
        return this;
    }
    public HuichengTestGrayFifthResponseBody getBody() {
        return this.body;
    }

}
