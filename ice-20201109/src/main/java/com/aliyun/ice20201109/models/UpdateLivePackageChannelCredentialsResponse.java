// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLivePackageChannelCredentialsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLivePackageChannelCredentialsResponseBody body;

    public static UpdateLivePackageChannelCredentialsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLivePackageChannelCredentialsResponse self = new UpdateLivePackageChannelCredentialsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLivePackageChannelCredentialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLivePackageChannelCredentialsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLivePackageChannelCredentialsResponse setBody(UpdateLivePackageChannelCredentialsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLivePackageChannelCredentialsResponseBody getBody() {
        return this.body;
    }

}
