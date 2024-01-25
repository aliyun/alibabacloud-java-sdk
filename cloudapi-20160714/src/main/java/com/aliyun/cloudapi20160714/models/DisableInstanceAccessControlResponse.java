// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DisableInstanceAccessControlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableInstanceAccessControlResponseBody body;

    public static DisableInstanceAccessControlResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableInstanceAccessControlResponse self = new DisableInstanceAccessControlResponse();
        return TeaModel.build(map, self);
    }

    public DisableInstanceAccessControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableInstanceAccessControlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableInstanceAccessControlResponse setBody(DisableInstanceAccessControlResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableInstanceAccessControlResponseBody getBody() {
        return this.body;
    }

}
