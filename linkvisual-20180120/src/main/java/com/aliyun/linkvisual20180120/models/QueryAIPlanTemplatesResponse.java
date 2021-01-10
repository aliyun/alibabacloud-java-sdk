// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryAIPlanTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAIPlanTemplatesResponseBody body;

    public static QueryAIPlanTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAIPlanTemplatesResponse self = new QueryAIPlanTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public QueryAIPlanTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAIPlanTemplatesResponse setBody(QueryAIPlanTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAIPlanTemplatesResponseBody getBody() {
        return this.body;
    }

}
