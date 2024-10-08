// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafPhasesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWafPhasesResponseBody body;

    public static ListWafPhasesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWafPhasesResponse self = new ListWafPhasesResponse();
        return TeaModel.build(map, self);
    }

    public ListWafPhasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWafPhasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWafPhasesResponse setBody(ListWafPhasesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWafPhasesResponseBody getBody() {
        return this.body;
    }

}
