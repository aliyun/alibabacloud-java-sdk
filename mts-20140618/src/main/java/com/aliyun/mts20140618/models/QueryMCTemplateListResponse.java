// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMCTemplateListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryMCTemplateListResponseBody body;

    public static QueryMCTemplateListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMCTemplateListResponse self = new QueryMCTemplateListResponse();
        return TeaModel.build(map, self);
    }

    public QueryMCTemplateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMCTemplateListResponse setBody(QueryMCTemplateListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMCTemplateListResponseBody getBody() {
        return this.body;
    }

}
