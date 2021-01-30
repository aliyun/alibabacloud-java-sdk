// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRobotTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRobotTaskDetailResponseBody body;

    public static QueryRobotTaskDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRobotTaskDetailResponse self = new QueryRobotTaskDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryRobotTaskDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRobotTaskDetailResponse setBody(QueryRobotTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRobotTaskDetailResponseBody getBody() {
        return this.body;
    }

}
