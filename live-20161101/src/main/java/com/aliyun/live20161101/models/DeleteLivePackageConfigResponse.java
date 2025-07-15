// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLivePackageConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLivePackageConfigResponseBody body;

    public static DeleteLivePackageConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLivePackageConfigResponse self = new DeleteLivePackageConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLivePackageConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLivePackageConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLivePackageConfigResponse setBody(DeleteLivePackageConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLivePackageConfigResponseBody getBody() {
        return this.body;
    }

}
