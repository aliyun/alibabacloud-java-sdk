// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteQualityEntityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteQualityEntityResponseBody body;

    public static DeleteQualityEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteQualityEntityResponse self = new DeleteQualityEntityResponse();
        return TeaModel.build(map, self);
    }

    public DeleteQualityEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteQualityEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteQualityEntityResponse setBody(DeleteQualityEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteQualityEntityResponseBody getBody() {
        return this.body;
    }

}
