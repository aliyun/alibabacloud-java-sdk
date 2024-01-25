// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class EnableInstanceAccessControlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableInstanceAccessControlResponseBody body;

    public static EnableInstanceAccessControlResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableInstanceAccessControlResponse self = new EnableInstanceAccessControlResponse();
        return TeaModel.build(map, self);
    }

    public EnableInstanceAccessControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableInstanceAccessControlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableInstanceAccessControlResponse setBody(EnableInstanceAccessControlResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableInstanceAccessControlResponseBody getBody() {
        return this.body;
    }

}
