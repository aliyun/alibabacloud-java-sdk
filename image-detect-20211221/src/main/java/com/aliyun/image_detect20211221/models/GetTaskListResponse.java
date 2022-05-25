// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.image_detect20211221.models;

import com.aliyun.tea.*;

public class GetTaskListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTaskListResponseBody body;

    public static GetTaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskListResponse self = new GetTaskListResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTaskListResponse setBody(GetTaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskListResponseBody getBody() {
        return this.body;
    }

}
