// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class BatchGetUserIdByOpenDingtalkIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchGetUserIdByOpenDingtalkIdResponseBody body;

    public static BatchGetUserIdByOpenDingtalkIdResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetUserIdByOpenDingtalkIdResponse self = new BatchGetUserIdByOpenDingtalkIdResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetUserIdByOpenDingtalkIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetUserIdByOpenDingtalkIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchGetUserIdByOpenDingtalkIdResponse setBody(BatchGetUserIdByOpenDingtalkIdResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetUserIdByOpenDingtalkIdResponseBody getBody() {
        return this.body;
    }

}
