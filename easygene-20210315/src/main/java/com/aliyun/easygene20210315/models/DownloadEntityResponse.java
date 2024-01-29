// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class DownloadEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadEntityResponseBody body;

    public static DownloadEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadEntityResponse self = new DownloadEntityResponse();
        return TeaModel.build(map, self);
    }

    public DownloadEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadEntityResponse setBody(DownloadEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadEntityResponseBody getBody() {
        return this.body;
    }

}
