// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGrayNineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public HuichengTestGrayNineResponseBody body;

    public static HuichengTestGrayNineResponse build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGrayNineResponse self = new HuichengTestGrayNineResponse();
        return TeaModel.build(map, self);
    }

    public HuichengTestGrayNineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HuichengTestGrayNineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HuichengTestGrayNineResponse setBody(HuichengTestGrayNineResponseBody body) {
        this.body = body;
        return this;
    }
    public HuichengTestGrayNineResponseBody getBody() {
        return this.body;
    }

}
