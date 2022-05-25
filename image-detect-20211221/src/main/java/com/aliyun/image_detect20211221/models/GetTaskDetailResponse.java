// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.image_detect20211221.models;

import com.aliyun.tea.*;

public class GetTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTaskDetailResponseBody body;

    public static GetTaskDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskDetailResponse self = new GetTaskDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTaskDetailResponse setBody(GetTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskDetailResponseBody getBody() {
        return this.body;
    }

}
