// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class DeleteFacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFacesResponseBody body;

    public static DeleteFacesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFacesResponse self = new DeleteFacesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFacesResponse setBody(DeleteFacesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFacesResponseBody getBody() {
        return this.body;
    }

}
