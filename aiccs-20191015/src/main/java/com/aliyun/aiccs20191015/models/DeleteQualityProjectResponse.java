// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class DeleteQualityProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteQualityProjectResponseBody body;

    public static DeleteQualityProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteQualityProjectResponse self = new DeleteQualityProjectResponse();
        return TeaModel.build(map, self);
    }

    public DeleteQualityProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteQualityProjectResponse setBody(DeleteQualityProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteQualityProjectResponseBody getBody() {
        return this.body;
    }

}
