// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListTransferFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTransferFilesResponseBody body;

    public static ListTransferFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTransferFilesResponse self = new ListTransferFilesResponse();
        return TeaModel.build(map, self);
    }

    public ListTransferFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTransferFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTransferFilesResponse setBody(ListTransferFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTransferFilesResponseBody getBody() {
        return this.body;
    }

}
