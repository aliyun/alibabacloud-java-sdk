// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetQualityFollowerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQualityFollowerResponseBody body;

    public static GetQualityFollowerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualityFollowerResponse self = new GetQualityFollowerResponse();
        return TeaModel.build(map, self);
    }

    public GetQualityFollowerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQualityFollowerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQualityFollowerResponse setBody(GetQualityFollowerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQualityFollowerResponseBody getBody() {
        return this.body;
    }

}
