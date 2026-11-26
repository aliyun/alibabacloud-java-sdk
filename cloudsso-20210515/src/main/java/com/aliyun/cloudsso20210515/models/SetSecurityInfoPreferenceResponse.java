// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class SetSecurityInfoPreferenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetSecurityInfoPreferenceResponseBody body;

    public static SetSecurityInfoPreferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        SetSecurityInfoPreferenceResponse self = new SetSecurityInfoPreferenceResponse();
        return TeaModel.build(map, self);
    }

    public SetSecurityInfoPreferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetSecurityInfoPreferenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetSecurityInfoPreferenceResponse setBody(SetSecurityInfoPreferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public SetSecurityInfoPreferenceResponseBody getBody() {
        return this.body;
    }

}
