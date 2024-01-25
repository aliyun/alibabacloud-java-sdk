// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteResourceDLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteResourceDLinkResponseBody body;

    public static DeleteResourceDLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceDLinkResponse self = new DeleteResourceDLinkResponse();
        return TeaModel.build(map, self);
    }

    public DeleteResourceDLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteResourceDLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteResourceDLinkResponse setBody(DeleteResourceDLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteResourceDLinkResponseBody getBody() {
        return this.body;
    }

}
