// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGrayThirdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public HuichengTestGrayThirdResponseBody body;

    public static HuichengTestGrayThirdResponse build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGrayThirdResponse self = new HuichengTestGrayThirdResponse();
        return TeaModel.build(map, self);
    }

    public HuichengTestGrayThirdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HuichengTestGrayThirdResponse setBody(HuichengTestGrayThirdResponseBody body) {
        this.body = body;
        return this;
    }
    public HuichengTestGrayThirdResponseBody getBody() {
        return this.body;
    }

}
