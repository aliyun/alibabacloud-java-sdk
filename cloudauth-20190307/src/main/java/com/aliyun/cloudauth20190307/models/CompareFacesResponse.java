// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CompareFacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CompareFacesResponseBody body;

    public static CompareFacesResponse build(java.util.Map<String, ?> map) throws Exception {
        CompareFacesResponse self = new CompareFacesResponse();
        return TeaModel.build(map, self);
    }

    public CompareFacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompareFacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CompareFacesResponse setBody(CompareFacesResponseBody body) {
        this.body = body;
        return this;
    }
    public CompareFacesResponseBody getBody() {
        return this.body;
    }

}
