// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DownloadVerifyRecordIntlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadVerifyRecordIntlResponseBody body;

    public static DownloadVerifyRecordIntlResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadVerifyRecordIntlResponse self = new DownloadVerifyRecordIntlResponse();
        return TeaModel.build(map, self);
    }

    public DownloadVerifyRecordIntlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadVerifyRecordIntlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadVerifyRecordIntlResponse setBody(DownloadVerifyRecordIntlResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadVerifyRecordIntlResponseBody getBody() {
        return this.body;
    }

}
