// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListDatasetVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDatasetVersionsResponseBody body;

    public static ListDatasetVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetVersionsResponse self = new ListDatasetVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListDatasetVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDatasetVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDatasetVersionsResponse setBody(ListDatasetVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDatasetVersionsResponseBody getBody() {
        return this.body;
    }

}
