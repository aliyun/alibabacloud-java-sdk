// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20201023.models;

import com.aliyun.tea.*;

public class QueryProjectMembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryProjectMembersResponseBody body;

    public static QueryProjectMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectMembersResponse self = new QueryProjectMembersResponse();
        return TeaModel.build(map, self);
    }

    public QueryProjectMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryProjectMembersResponse setBody(QueryProjectMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryProjectMembersResponseBody getBody() {
        return this.body;
    }

}
