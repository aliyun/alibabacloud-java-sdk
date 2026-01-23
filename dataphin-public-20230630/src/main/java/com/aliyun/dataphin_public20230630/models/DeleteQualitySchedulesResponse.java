// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteQualitySchedulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteQualitySchedulesResponseBody body;

    public static DeleteQualitySchedulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteQualitySchedulesResponse self = new DeleteQualitySchedulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteQualitySchedulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteQualitySchedulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteQualitySchedulesResponse setBody(DeleteQualitySchedulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteQualitySchedulesResponseBody getBody() {
        return this.body;
    }

}
