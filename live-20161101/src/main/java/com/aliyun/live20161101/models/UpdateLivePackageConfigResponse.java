// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLivePackageConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLivePackageConfigResponseBody body;

    public static UpdateLivePackageConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLivePackageConfigResponse self = new UpdateLivePackageConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLivePackageConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLivePackageConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLivePackageConfigResponse setBody(UpdateLivePackageConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLivePackageConfigResponseBody getBody() {
        return this.body;
    }

}
