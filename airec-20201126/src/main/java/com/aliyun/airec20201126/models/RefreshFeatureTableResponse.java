// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class RefreshFeatureTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefreshFeatureTableResponseBody body;

    public static RefreshFeatureTableResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshFeatureTableResponse self = new RefreshFeatureTableResponse();
        return TeaModel.build(map, self);
    }

    public RefreshFeatureTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshFeatureTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshFeatureTableResponse setBody(RefreshFeatureTableResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshFeatureTableResponseBody getBody() {
        return this.body;
    }

}
