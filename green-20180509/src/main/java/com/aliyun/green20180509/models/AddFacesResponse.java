// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class AddFacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddFacesResponseBody body;

    public static AddFacesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFacesResponse self = new AddFacesResponse();
        return TeaModel.build(map, self);
    }

    public AddFacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddFacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddFacesResponse setBody(AddFacesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFacesResponseBody getBody() {
        return this.body;
    }

}
