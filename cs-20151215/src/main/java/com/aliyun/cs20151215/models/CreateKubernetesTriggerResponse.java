// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateKubernetesTriggerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateKubernetesTriggerResponseBody body;

    public static CreateKubernetesTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKubernetesTriggerResponse self = new CreateKubernetesTriggerResponse();
        return TeaModel.build(map, self);
    }

    public CreateKubernetesTriggerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKubernetesTriggerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateKubernetesTriggerResponse setBody(CreateKubernetesTriggerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKubernetesTriggerResponseBody getBody() {
        return this.body;
    }

}
