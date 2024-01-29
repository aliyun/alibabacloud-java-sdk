// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateBlackWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBlackWhiteListResponseBody body;

    public static UpdateBlackWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBlackWhiteListResponse self = new UpdateBlackWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBlackWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBlackWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBlackWhiteListResponse setBody(UpdateBlackWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBlackWhiteListResponseBody getBody() {
        return this.body;
    }

}
