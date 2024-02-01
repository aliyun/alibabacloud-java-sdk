// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryFaceUserGroupResponseBody body;

    public static QueryFaceUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceUserGroupResponse self = new QueryFaceUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryFaceUserGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFaceUserGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryFaceUserGroupResponse setBody(QueryFaceUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFaceUserGroupResponseBody getBody() {
        return this.body;
    }

}
