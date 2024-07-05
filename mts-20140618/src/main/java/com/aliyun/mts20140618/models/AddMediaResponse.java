// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddMediaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddMediaResponseBody body;

    public static AddMediaResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMediaResponse self = new AddMediaResponse();
        return TeaModel.build(map, self);
    }

    public AddMediaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMediaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddMediaResponse setBody(AddMediaResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMediaResponseBody getBody() {
        return this.body;
    }

}
