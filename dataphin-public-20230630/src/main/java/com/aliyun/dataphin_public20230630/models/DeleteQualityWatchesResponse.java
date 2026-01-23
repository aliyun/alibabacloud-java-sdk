// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteQualityWatchesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteQualityWatchesResponseBody body;

    public static DeleteQualityWatchesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteQualityWatchesResponse self = new DeleteQualityWatchesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteQualityWatchesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteQualityWatchesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteQualityWatchesResponse setBody(DeleteQualityWatchesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteQualityWatchesResponseBody getBody() {
        return this.body;
    }

}
