// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class DeleteContactsByIdsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteContactsByIdsResponseBody body;

    public static DeleteContactsByIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactsByIdsResponse self = new DeleteContactsByIdsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteContactsByIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteContactsByIdsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteContactsByIdsResponse setBody(DeleteContactsByIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteContactsByIdsResponseBody getBody() {
        return this.body;
    }

}
