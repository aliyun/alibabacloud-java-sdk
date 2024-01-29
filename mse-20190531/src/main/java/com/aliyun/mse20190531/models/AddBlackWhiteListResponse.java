// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddBlackWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddBlackWhiteListResponseBody body;

    public static AddBlackWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        AddBlackWhiteListResponse self = new AddBlackWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public AddBlackWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddBlackWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddBlackWhiteListResponse setBody(AddBlackWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public AddBlackWhiteListResponseBody getBody() {
        return this.body;
    }

}
