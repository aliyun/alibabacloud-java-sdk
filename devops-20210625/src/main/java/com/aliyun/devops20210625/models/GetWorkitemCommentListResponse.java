// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetWorkitemCommentListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkitemCommentListResponseBody body;

    public static GetWorkitemCommentListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkitemCommentListResponse self = new GetWorkitemCommentListResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkitemCommentListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkitemCommentListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkitemCommentListResponse setBody(GetWorkitemCommentListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkitemCommentListResponseBody getBody() {
        return this.body;
    }

}
