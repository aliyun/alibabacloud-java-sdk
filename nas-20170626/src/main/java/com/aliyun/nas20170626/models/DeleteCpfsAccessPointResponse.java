// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteCpfsAccessPointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCpfsAccessPointResponseBody body;

    public static DeleteCpfsAccessPointResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCpfsAccessPointResponse self = new DeleteCpfsAccessPointResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCpfsAccessPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCpfsAccessPointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCpfsAccessPointResponse setBody(DeleteCpfsAccessPointResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCpfsAccessPointResponseBody getBody() {
        return this.body;
    }

}
