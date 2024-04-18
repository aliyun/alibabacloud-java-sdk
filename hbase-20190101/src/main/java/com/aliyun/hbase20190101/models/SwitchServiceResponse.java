// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class SwitchServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SwitchServiceResponseBody body;

    public static SwitchServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchServiceResponse self = new SwitchServiceResponse();
        return TeaModel.build(map, self);
    }

    public SwitchServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchServiceResponse setBody(SwitchServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchServiceResponseBody getBody() {
        return this.body;
    }

}
