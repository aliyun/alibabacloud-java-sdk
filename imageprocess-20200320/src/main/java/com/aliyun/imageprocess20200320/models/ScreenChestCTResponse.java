// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class ScreenChestCTResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ScreenChestCTResponseBody body;

    public static ScreenChestCTResponse build(java.util.Map<String, ?> map) throws Exception {
        ScreenChestCTResponse self = new ScreenChestCTResponse();
        return TeaModel.build(map, self);
    }

    public ScreenChestCTResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScreenChestCTResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ScreenChestCTResponse setBody(ScreenChestCTResponseBody body) {
        this.body = body;
        return this;
    }
    public ScreenChestCTResponseBody getBody() {
        return this.body;
    }

}
