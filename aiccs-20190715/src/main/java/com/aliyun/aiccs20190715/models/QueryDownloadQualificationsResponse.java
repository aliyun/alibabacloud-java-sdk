// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryDownloadQualificationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDownloadQualificationsResponseBody body;

    public static QueryDownloadQualificationsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDownloadQualificationsResponse self = new QueryDownloadQualificationsResponse();
        return TeaModel.build(map, self);
    }

    public QueryDownloadQualificationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDownloadQualificationsResponse setBody(QueryDownloadQualificationsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDownloadQualificationsResponseBody getBody() {
        return this.body;
    }

}
