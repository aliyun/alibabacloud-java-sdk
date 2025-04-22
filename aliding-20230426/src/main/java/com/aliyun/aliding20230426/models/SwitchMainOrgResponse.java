// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SwitchMainOrgResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SwitchMainOrgResponseBody body;

    public static SwitchMainOrgResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchMainOrgResponse self = new SwitchMainOrgResponse();
        return TeaModel.build(map, self);
    }

    public SwitchMainOrgResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchMainOrgResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchMainOrgResponse setBody(SwitchMainOrgResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchMainOrgResponseBody getBody() {
        return this.body;
    }

}
