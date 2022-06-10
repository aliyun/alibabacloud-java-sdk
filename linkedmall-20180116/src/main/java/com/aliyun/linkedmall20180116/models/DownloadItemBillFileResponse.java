// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class DownloadItemBillFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadItemBillFileResponseBody body;

    public static DownloadItemBillFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadItemBillFileResponse self = new DownloadItemBillFileResponse();
        return TeaModel.build(map, self);
    }

    public DownloadItemBillFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadItemBillFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadItemBillFileResponse setBody(DownloadItemBillFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadItemBillFileResponseBody getBody() {
        return this.body;
    }

}
