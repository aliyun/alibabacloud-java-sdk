// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DownloadVerifyRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadVerifyRecordsResponseBody body;

    public static DownloadVerifyRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadVerifyRecordsResponse self = new DownloadVerifyRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DownloadVerifyRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadVerifyRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadVerifyRecordsResponse setBody(DownloadVerifyRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadVerifyRecordsResponseBody getBody() {
        return this.body;
    }

}
