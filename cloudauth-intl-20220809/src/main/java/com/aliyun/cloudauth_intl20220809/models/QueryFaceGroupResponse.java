// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class QueryFaceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryFaceGroupResponseBody body;

    public static QueryFaceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceGroupResponse self = new QueryFaceGroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryFaceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFaceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFaceGroupResponse setBody(QueryFaceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFaceGroupResponseBody getBody() {
        return this.body;
    }

}
