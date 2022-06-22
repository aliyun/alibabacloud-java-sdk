// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetNamespaceListByUserIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetNamespaceListByUserIdResponseBody body;

    public static GetNamespaceListByUserIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNamespaceListByUserIdResponse self = new GetNamespaceListByUserIdResponse();
        return TeaModel.build(map, self);
    }

    public GetNamespaceListByUserIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNamespaceListByUserIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNamespaceListByUserIdResponse setBody(GetNamespaceListByUserIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNamespaceListByUserIdResponseBody getBody() {
        return this.body;
    }

}
