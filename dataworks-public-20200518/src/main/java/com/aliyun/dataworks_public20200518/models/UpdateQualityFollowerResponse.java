// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateQualityFollowerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateQualityFollowerResponseBody body;

    public static UpdateQualityFollowerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateQualityFollowerResponse self = new UpdateQualityFollowerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateQualityFollowerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateQualityFollowerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateQualityFollowerResponse setBody(UpdateQualityFollowerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateQualityFollowerResponseBody getBody() {
        return this.body;
    }

}
