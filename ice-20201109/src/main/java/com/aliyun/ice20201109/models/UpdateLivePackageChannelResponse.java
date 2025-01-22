// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLivePackageChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLivePackageChannelResponseBody body;

    public static UpdateLivePackageChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLivePackageChannelResponse self = new UpdateLivePackageChannelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLivePackageChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLivePackageChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLivePackageChannelResponse setBody(UpdateLivePackageChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLivePackageChannelResponseBody getBody() {
        return this.body;
    }

}
