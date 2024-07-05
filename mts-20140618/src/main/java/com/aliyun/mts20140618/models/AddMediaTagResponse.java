// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddMediaTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddMediaTagResponseBody body;

    public static AddMediaTagResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMediaTagResponse self = new AddMediaTagResponse();
        return TeaModel.build(map, self);
    }

    public AddMediaTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMediaTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddMediaTagResponse setBody(AddMediaTagResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMediaTagResponseBody getBody() {
        return this.body;
    }

}
