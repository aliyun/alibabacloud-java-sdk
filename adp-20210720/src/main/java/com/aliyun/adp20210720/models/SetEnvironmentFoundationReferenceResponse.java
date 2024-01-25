// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class SetEnvironmentFoundationReferenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetEnvironmentFoundationReferenceResponseBody body;

    public static SetEnvironmentFoundationReferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        SetEnvironmentFoundationReferenceResponse self = new SetEnvironmentFoundationReferenceResponse();
        return TeaModel.build(map, self);
    }

    public SetEnvironmentFoundationReferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetEnvironmentFoundationReferenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetEnvironmentFoundationReferenceResponse setBody(SetEnvironmentFoundationReferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public SetEnvironmentFoundationReferenceResponseBody getBody() {
        return this.body;
    }

}
