// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLivePackageChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLivePackageChannelResponseBody body;

    public static CreateLivePackageChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLivePackageChannelResponse self = new CreateLivePackageChannelResponse();
        return TeaModel.build(map, self);
    }

    public CreateLivePackageChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLivePackageChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLivePackageChannelResponse setBody(CreateLivePackageChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLivePackageChannelResponseBody getBody() {
        return this.body;
    }

}
