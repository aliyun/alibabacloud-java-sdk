// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteQualityFollowerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteQualityFollowerResponseBody body;

    public static DeleteQualityFollowerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteQualityFollowerResponse self = new DeleteQualityFollowerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteQualityFollowerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteQualityFollowerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteQualityFollowerResponse setBody(DeleteQualityFollowerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteQualityFollowerResponseBody getBody() {
        return this.body;
    }

}
