// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRobotInfoListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRobotInfoListResponseBody body;

    public static QueryRobotInfoListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRobotInfoListResponse self = new QueryRobotInfoListResponse();
        return TeaModel.build(map, self);
    }

    public QueryRobotInfoListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRobotInfoListResponse setBody(QueryRobotInfoListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRobotInfoListResponseBody getBody() {
        return this.body;
    }

}
