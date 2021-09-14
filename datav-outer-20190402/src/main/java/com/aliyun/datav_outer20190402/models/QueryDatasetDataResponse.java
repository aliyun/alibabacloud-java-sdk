// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class QueryDatasetDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDatasetDataResponseBody body;

    public static QueryDatasetDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDatasetDataResponse self = new QueryDatasetDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryDatasetDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDatasetDataResponse setBody(QueryDatasetDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDatasetDataResponseBody getBody() {
        return this.body;
    }

}
