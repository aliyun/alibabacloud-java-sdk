// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SearchDatasetDocumentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchDatasetDocumentsResponseBody body;

    public static SearchDatasetDocumentsResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchDatasetDocumentsResponse self = new SearchDatasetDocumentsResponse();
        return TeaModel.build(map, self);
    }

    public SearchDatasetDocumentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchDatasetDocumentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchDatasetDocumentsResponse setBody(SearchDatasetDocumentsResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchDatasetDocumentsResponseBody getBody() {
        return this.body;
    }

}
