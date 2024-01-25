// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class UpdateCurrentItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCurrentItemResponseBody body;

    public static UpdateCurrentItemResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCurrentItemResponse self = new UpdateCurrentItemResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCurrentItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCurrentItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCurrentItemResponse setBody(UpdateCurrentItemResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCurrentItemResponseBody getBody() {
        return this.body;
    }

}
