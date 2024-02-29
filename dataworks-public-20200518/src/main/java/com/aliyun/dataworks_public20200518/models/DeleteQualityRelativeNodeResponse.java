// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteQualityRelativeNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteQualityRelativeNodeResponseBody body;

    public static DeleteQualityRelativeNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteQualityRelativeNodeResponse self = new DeleteQualityRelativeNodeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteQualityRelativeNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteQualityRelativeNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteQualityRelativeNodeResponse setBody(DeleteQualityRelativeNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteQualityRelativeNodeResponseBody getBody() {
        return this.body;
    }

}
