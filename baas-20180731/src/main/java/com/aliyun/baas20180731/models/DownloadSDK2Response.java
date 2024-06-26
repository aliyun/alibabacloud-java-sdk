// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DownloadSDK2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadSDK2ResponseBody body;

    public static DownloadSDK2Response build(java.util.Map<String, ?> map) throws Exception {
        DownloadSDK2Response self = new DownloadSDK2Response();
        return TeaModel.build(map, self);
    }

    public DownloadSDK2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadSDK2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadSDK2Response setBody(DownloadSDK2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadSDK2ResponseBody getBody() {
        return this.body;
    }

}
