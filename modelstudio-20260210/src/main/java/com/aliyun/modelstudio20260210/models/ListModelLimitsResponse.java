// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class ListModelLimitsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListModelLimitsResponseBody body;

    public static ListModelLimitsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModelLimitsResponse self = new ListModelLimitsResponse();
        return TeaModel.build(map, self);
    }

    public ListModelLimitsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModelLimitsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListModelLimitsResponse setBody(ListModelLimitsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModelLimitsResponseBody getBody() {
        return this.body;
    }

}
