// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class DeleteFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFilesResponseBody body;

    public static DeleteFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFilesResponse self = new DeleteFilesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFilesResponse setBody(DeleteFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFilesResponseBody getBody() {
        return this.body;
    }

}
