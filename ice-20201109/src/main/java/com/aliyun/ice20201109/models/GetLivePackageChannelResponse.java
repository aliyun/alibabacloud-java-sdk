// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLivePackageChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLivePackageChannelResponseBody body;

    public static GetLivePackageChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLivePackageChannelResponse self = new GetLivePackageChannelResponse();
        return TeaModel.build(map, self);
    }

    public GetLivePackageChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLivePackageChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLivePackageChannelResponse setBody(GetLivePackageChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLivePackageChannelResponseBody getBody() {
        return this.body;
    }

}
