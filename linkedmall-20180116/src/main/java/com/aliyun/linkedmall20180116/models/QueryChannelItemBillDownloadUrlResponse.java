// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryChannelItemBillDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryChannelItemBillDownloadUrlResponseBody body;

    public static QueryChannelItemBillDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryChannelItemBillDownloadUrlResponse self = new QueryChannelItemBillDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public QueryChannelItemBillDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryChannelItemBillDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryChannelItemBillDownloadUrlResponse setBody(QueryChannelItemBillDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryChannelItemBillDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
