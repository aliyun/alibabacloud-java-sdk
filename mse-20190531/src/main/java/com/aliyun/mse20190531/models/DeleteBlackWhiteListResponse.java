// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteBlackWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBlackWhiteListResponseBody body;

    public static DeleteBlackWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBlackWhiteListResponse self = new DeleteBlackWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBlackWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBlackWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBlackWhiteListResponse setBody(DeleteBlackWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBlackWhiteListResponseBody getBody() {
        return this.body;
    }

}
