// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class QueryListRobotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryListRobotResponseBody body;

    public static QueryListRobotResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryListRobotResponse self = new QueryListRobotResponse();
        return TeaModel.build(map, self);
    }

    public QueryListRobotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryListRobotResponse setBody(QueryListRobotResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryListRobotResponseBody getBody() {
        return this.body;
    }

}
