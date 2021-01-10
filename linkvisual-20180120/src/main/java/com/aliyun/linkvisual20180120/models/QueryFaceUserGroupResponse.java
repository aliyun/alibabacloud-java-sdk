// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceUserGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryFaceUserGroupResponse setBody(QueryFaceUserGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFaceUserGroupResponseBody getBody() {
        return this.body;
    }

}
