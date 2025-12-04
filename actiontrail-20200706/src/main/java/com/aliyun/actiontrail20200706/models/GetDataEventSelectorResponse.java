// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetDataEventSelectorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataEventSelectorResponseBody body;

    public static GetDataEventSelectorResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataEventSelectorResponse self = new GetDataEventSelectorResponse();
        return TeaModel.build(map, self);
    }

    public GetDataEventSelectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataEventSelectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataEventSelectorResponse setBody(GetDataEventSelectorResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataEventSelectorResponseBody getBody() {
        return this.body;
    }

}
