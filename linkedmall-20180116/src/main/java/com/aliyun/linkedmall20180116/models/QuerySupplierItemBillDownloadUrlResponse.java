// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QuerySupplierItemBillDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySupplierItemBillDownloadUrlResponseBody body;

    public static QuerySupplierItemBillDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySupplierItemBillDownloadUrlResponse self = new QuerySupplierItemBillDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public QuerySupplierItemBillDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySupplierItemBillDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySupplierItemBillDownloadUrlResponse setBody(QuerySupplierItemBillDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySupplierItemBillDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
