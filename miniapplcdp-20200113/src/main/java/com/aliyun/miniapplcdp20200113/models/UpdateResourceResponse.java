// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class UpdateResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateResourceResponseBody body;

    public static UpdateResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceResponse self = new UpdateResourceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateResourceResponse setBody(UpdateResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateResourceResponseBody getBody() {
        return this.body;
    }

}
