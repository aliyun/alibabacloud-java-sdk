// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DeleteApplicationAccessPointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteApplicationAccessPointResponseBody body;

    public static DeleteApplicationAccessPointResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationAccessPointResponse self = new DeleteApplicationAccessPointResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationAccessPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApplicationAccessPointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteApplicationAccessPointResponse setBody(DeleteApplicationAccessPointResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApplicationAccessPointResponseBody getBody() {
        return this.body;
    }

}
