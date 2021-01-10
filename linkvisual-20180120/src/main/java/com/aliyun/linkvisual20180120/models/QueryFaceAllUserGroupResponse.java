// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceAllUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryFaceAllUserGroupResponseBody body;

    public static QueryFaceAllUserGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceAllUserGroupResponse self = new QueryFaceAllUserGroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryFaceAllUserGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFaceAllUserGroupResponse setBody(QueryFaceAllUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFaceAllUserGroupResponseBody getBody() {
        return this.body;
    }

}
