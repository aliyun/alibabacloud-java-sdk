// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class QueryCommonStatisticPreviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCommonStatisticPreviewResponseBody body;

    public static QueryCommonStatisticPreviewResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCommonStatisticPreviewResponse self = new QueryCommonStatisticPreviewResponse();
        return TeaModel.build(map, self);
    }

    public QueryCommonStatisticPreviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCommonStatisticPreviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCommonStatisticPreviewResponse setBody(QueryCommonStatisticPreviewResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCommonStatisticPreviewResponseBody getBody() {
        return this.body;
    }

}
