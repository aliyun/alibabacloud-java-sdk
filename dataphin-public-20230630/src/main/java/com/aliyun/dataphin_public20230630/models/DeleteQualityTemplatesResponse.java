// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteQualityTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteQualityTemplatesResponseBody body;

    public static DeleteQualityTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteQualityTemplatesResponse self = new DeleteQualityTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteQualityTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteQualityTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteQualityTemplatesResponse setBody(DeleteQualityTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteQualityTemplatesResponseBody getBody() {
        return this.body;
    }

}
