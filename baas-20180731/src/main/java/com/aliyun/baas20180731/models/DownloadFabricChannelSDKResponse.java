// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DownloadFabricChannelSDKResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadFabricChannelSDKResponseBody body;

    public static DownloadFabricChannelSDKResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadFabricChannelSDKResponse self = new DownloadFabricChannelSDKResponse();
        return TeaModel.build(map, self);
    }

    public DownloadFabricChannelSDKResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadFabricChannelSDKResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadFabricChannelSDKResponse setBody(DownloadFabricChannelSDKResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadFabricChannelSDKResponseBody getBody() {
        return this.body;
    }

}
