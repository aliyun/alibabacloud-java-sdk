// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGrayTenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public HuichengTestGrayTenResponseBody body;

    public static HuichengTestGrayTenResponse build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGrayTenResponse self = new HuichengTestGrayTenResponse();
        return TeaModel.build(map, self);
    }

    public HuichengTestGrayTenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HuichengTestGrayTenResponse setBody(HuichengTestGrayTenResponseBody body) {
        this.body = body;
        return this;
    }
    public HuichengTestGrayTenResponseBody getBody() {
        return this.body;
    }

}
