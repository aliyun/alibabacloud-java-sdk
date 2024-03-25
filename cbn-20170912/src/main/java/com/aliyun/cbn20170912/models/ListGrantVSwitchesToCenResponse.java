// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListGrantVSwitchesToCenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGrantVSwitchesToCenResponseBody body;

    public static ListGrantVSwitchesToCenResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGrantVSwitchesToCenResponse self = new ListGrantVSwitchesToCenResponse();
        return TeaModel.build(map, self);
    }

    public ListGrantVSwitchesToCenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGrantVSwitchesToCenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGrantVSwitchesToCenResponse setBody(ListGrantVSwitchesToCenResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGrantVSwitchesToCenResponseBody getBody() {
        return this.body;
    }

}
