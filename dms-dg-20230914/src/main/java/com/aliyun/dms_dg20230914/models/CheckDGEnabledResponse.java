// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_dg20230914.models;

import com.aliyun.tea.*;

public class CheckDGEnabledResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckDGEnabledResponseBody body;

    public static CheckDGEnabledResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDGEnabledResponse self = new CheckDGEnabledResponse();
        return TeaModel.build(map, self);
    }

    public CheckDGEnabledResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDGEnabledResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckDGEnabledResponse setBody(CheckDGEnabledResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDGEnabledResponseBody getBody() {
        return this.body;
    }

}
