// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListTransferFileDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTransferFileDownloadUrlResponseBody body;

    public static ListTransferFileDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTransferFileDownloadUrlResponse self = new ListTransferFileDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public ListTransferFileDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTransferFileDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTransferFileDownloadUrlResponse setBody(ListTransferFileDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTransferFileDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
