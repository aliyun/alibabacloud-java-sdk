// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteQualityFollowerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteQualityFollowerResponse setBody(DeleteQualityFollowerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteQualityFollowerResponseBody getBody() {
        return this.body;
    }

}
