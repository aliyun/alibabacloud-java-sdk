// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class OfflineHttpApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OfflineHttpApiResponseBody body;

    public static OfflineHttpApiResponse build(java.util.Map<String, ?> map) throws Exception {
        OfflineHttpApiResponse self = new OfflineHttpApiResponse();
        return TeaModel.build(map, self);
    }

    public OfflineHttpApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OfflineHttpApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OfflineHttpApiResponse setBody(OfflineHttpApiResponseBody body) {
        this.body = body;
        return this;
    }
    public OfflineHttpApiResponseBody getBody() {
        return this.body;
    }

}
