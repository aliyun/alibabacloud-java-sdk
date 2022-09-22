// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteDNAFilesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDNAFilesResponseBody body;

    public static DeleteDNAFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDNAFilesResponse self = new DeleteDNAFilesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDNAFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDNAFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDNAFilesResponse setBody(DeleteDNAFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDNAFilesResponseBody getBody() {
        return this.body;
    }

}
