// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class UpdateResourceInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateResourceInfoResponseBody body;

    public static UpdateResourceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceInfoResponse self = new UpdateResourceInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateResourceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateResourceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateResourceInfoResponse setBody(UpdateResourceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateResourceInfoResponseBody getBody() {
        return this.body;
    }

}
