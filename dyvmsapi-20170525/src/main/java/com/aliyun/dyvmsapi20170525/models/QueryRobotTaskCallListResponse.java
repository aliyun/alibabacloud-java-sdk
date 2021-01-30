// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRobotTaskCallListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRobotTaskCallListResponseBody body;

    public static QueryRobotTaskCallListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRobotTaskCallListResponse self = new QueryRobotTaskCallListResponse();
        return TeaModel.build(map, self);
    }

    public QueryRobotTaskCallListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRobotTaskCallListResponse setBody(QueryRobotTaskCallListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRobotTaskCallListResponseBody getBody() {
        return this.body;
    }

}
