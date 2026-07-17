// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class ListComputeEngineJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListComputeEngineJobResponseBody body;

    public static ListComputeEngineJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListComputeEngineJobResponse self = new ListComputeEngineJobResponse();
        return TeaModel.build(map, self);
    }

    public ListComputeEngineJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListComputeEngineJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListComputeEngineJobResponse setBody(ListComputeEngineJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ListComputeEngineJobResponseBody getBody() {
        return this.body;
    }

}
