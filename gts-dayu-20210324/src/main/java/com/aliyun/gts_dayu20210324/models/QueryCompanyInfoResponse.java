// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20210324.models;

import com.aliyun.tea.*;

public class QueryCompanyInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCompanyInfoResponseBody body;

    public static QueryCompanyInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCompanyInfoResponse self = new QueryCompanyInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryCompanyInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCompanyInfoResponse setBody(QueryCompanyInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCompanyInfoResponseBody getBody() {
        return this.body;
    }

}
