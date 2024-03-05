// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteGWSClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGWSClusterResponseBody body;

    public static DeleteGWSClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGWSClusterResponse self = new DeleteGWSClusterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGWSClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGWSClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGWSClusterResponse setBody(DeleteGWSClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGWSClusterResponseBody getBody() {
        return this.body;
    }

}
