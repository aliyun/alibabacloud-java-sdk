// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class QuerySkillGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySkillGroupsResponseBody body;

    public static QuerySkillGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySkillGroupsResponse self = new QuerySkillGroupsResponse();
        return TeaModel.build(map, self);
    }

    public QuerySkillGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySkillGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySkillGroupsResponse setBody(QuerySkillGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySkillGroupsResponseBody getBody() {
        return this.body;
    }

}
