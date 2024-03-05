// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteGWSInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGWSInstanceResponseBody body;

    public static DeleteGWSInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGWSInstanceResponse self = new DeleteGWSInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGWSInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGWSInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGWSInstanceResponse setBody(DeleteGWSInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGWSInstanceResponseBody getBody() {
        return this.body;
    }

}
