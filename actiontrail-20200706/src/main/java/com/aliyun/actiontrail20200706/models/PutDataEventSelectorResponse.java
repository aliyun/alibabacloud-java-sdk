// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class PutDataEventSelectorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutDataEventSelectorResponseBody body;

    public static PutDataEventSelectorResponse build(java.util.Map<String, ?> map) throws Exception {
        PutDataEventSelectorResponse self = new PutDataEventSelectorResponse();
        return TeaModel.build(map, self);
    }

    public PutDataEventSelectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutDataEventSelectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutDataEventSelectorResponse setBody(PutDataEventSelectorResponseBody body) {
        this.body = body;
        return this;
    }
    public PutDataEventSelectorResponseBody getBody() {
        return this.body;
    }

}
