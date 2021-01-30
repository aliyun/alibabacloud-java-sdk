// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRobotTaskCallDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRobotTaskCallDetailResponseBody body;

    public static QueryRobotTaskCallDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRobotTaskCallDetailResponse self = new QueryRobotTaskCallDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryRobotTaskCallDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRobotTaskCallDetailResponse setBody(QueryRobotTaskCallDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRobotTaskCallDetailResponseBody getBody() {
        return this.body;
    }

}
