// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNodesResponseBody body;

    public static DeleteNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNodesResponse self = new DeleteNodesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNodesResponse setBody(DeleteNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNodesResponseBody getBody() {
        return this.body;
    }

}
