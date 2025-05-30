// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListDatasetDocumentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDatasetDocumentsResponseBody body;

    public static ListDatasetDocumentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetDocumentsResponse self = new ListDatasetDocumentsResponse();
        return TeaModel.build(map, self);
    }

    public ListDatasetDocumentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDatasetDocumentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDatasetDocumentsResponse setBody(ListDatasetDocumentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDatasetDocumentsResponseBody getBody() {
        return this.body;
    }

}
