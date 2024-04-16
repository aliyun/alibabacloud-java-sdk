// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class UpdateResourceContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateResourceContentResponseBody body;

    public static UpdateResourceContentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceContentResponse self = new UpdateResourceContentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateResourceContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateResourceContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateResourceContentResponse setBody(UpdateResourceContentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateResourceContentResponseBody getBody() {
        return this.body;
    }

}
