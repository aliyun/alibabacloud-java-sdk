// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetUserDocumentPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserDocumentPermissionResponseBody body;

    public static GetUserDocumentPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserDocumentPermissionResponse self = new GetUserDocumentPermissionResponse();
        return TeaModel.build(map, self);
    }

    public GetUserDocumentPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserDocumentPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserDocumentPermissionResponse setBody(GetUserDocumentPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserDocumentPermissionResponseBody getBody() {
        return this.body;
    }

}
