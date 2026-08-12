// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListDataPipelinesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataPipelinesResponseBody body;

    public static ListDataPipelinesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataPipelinesResponse self = new ListDataPipelinesResponse();
        return TeaModel.build(map, self);
    }

    public ListDataPipelinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataPipelinesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataPipelinesResponse setBody(ListDataPipelinesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataPipelinesResponseBody getBody() {
        return this.body;
    }

}
