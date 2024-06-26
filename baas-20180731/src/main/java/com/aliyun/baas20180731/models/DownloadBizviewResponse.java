// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DownloadBizviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadBizviewResponseBody body;

    public static DownloadBizviewResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadBizviewResponse self = new DownloadBizviewResponse();
        return TeaModel.build(map, self);
    }

    public DownloadBizviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadBizviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadBizviewResponse setBody(DownloadBizviewResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadBizviewResponseBody getBody() {
        return this.body;
    }

}
