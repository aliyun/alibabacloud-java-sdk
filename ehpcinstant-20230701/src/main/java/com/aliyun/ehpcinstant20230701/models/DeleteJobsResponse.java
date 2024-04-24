// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class DeleteJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteJobsResponseBody body;

    public static DeleteJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobsResponse self = new DeleteJobsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteJobsResponse setBody(DeleteJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteJobsResponseBody getBody() {
        return this.body;
    }

}
