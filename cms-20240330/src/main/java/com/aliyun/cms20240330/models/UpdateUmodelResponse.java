// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateUmodelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateUmodelResponseBody body;

    public static UpdateUmodelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUmodelResponse self = new UpdateUmodelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUmodelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUmodelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUmodelResponse setBody(UpdateUmodelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUmodelResponseBody getBody() {
        return this.body;
    }

}
