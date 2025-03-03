// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListDatasetJobConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDatasetJobConfigsResponseBody body;

    public static ListDatasetJobConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetJobConfigsResponse self = new ListDatasetJobConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListDatasetJobConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDatasetJobConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDatasetJobConfigsResponse setBody(ListDatasetJobConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDatasetJobConfigsResponseBody getBody() {
        return this.body;
    }

}
