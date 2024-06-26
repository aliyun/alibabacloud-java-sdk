// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DownloadAllResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadAllResponseBody body;

    public static DownloadAllResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadAllResponse self = new DownloadAllResponse();
        return TeaModel.build(map, self);
    }

    public DownloadAllResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadAllResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadAllResponse setBody(DownloadAllResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadAllResponseBody getBody() {
        return this.body;
    }

}
