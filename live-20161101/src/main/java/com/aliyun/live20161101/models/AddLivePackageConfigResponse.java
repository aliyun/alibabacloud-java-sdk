// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLivePackageConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddLivePackageConfigResponseBody body;

    public static AddLivePackageConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLivePackageConfigResponse self = new AddLivePackageConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddLivePackageConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLivePackageConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddLivePackageConfigResponse setBody(AddLivePackageConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLivePackageConfigResponseBody getBody() {
        return this.body;
    }

}
