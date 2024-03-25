// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListGrantVSwitchEnisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGrantVSwitchEnisResponseBody body;

    public static ListGrantVSwitchEnisResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGrantVSwitchEnisResponse self = new ListGrantVSwitchEnisResponse();
        return TeaModel.build(map, self);
    }

    public ListGrantVSwitchEnisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGrantVSwitchEnisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGrantVSwitchEnisResponse setBody(ListGrantVSwitchEnisResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGrantVSwitchEnisResponseBody getBody() {
        return this.body;
    }

}
