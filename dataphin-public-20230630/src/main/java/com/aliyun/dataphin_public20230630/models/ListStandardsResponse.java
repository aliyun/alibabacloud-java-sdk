// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListStandardsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListStandardsResponseBody body;

    public static ListStandardsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStandardsResponse self = new ListStandardsResponse();
        return TeaModel.build(map, self);
    }

    public ListStandardsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStandardsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListStandardsResponse setBody(ListStandardsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStandardsResponseBody getBody() {
        return this.body;
    }

}
