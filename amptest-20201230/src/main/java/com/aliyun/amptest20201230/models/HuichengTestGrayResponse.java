// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGrayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public HuichengTestGrayResponseBody body;

    public static HuichengTestGrayResponse build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGrayResponse self = new HuichengTestGrayResponse();
        return TeaModel.build(map, self);
    }

    public HuichengTestGrayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HuichengTestGrayResponse setBody(HuichengTestGrayResponseBody body) {
        this.body = body;
        return this;
    }
    public HuichengTestGrayResponseBody getBody() {
        return this.body;
    }

}
