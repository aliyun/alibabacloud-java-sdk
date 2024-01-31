// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteKubernetesTriggerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    public static DeleteKubernetesTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteKubernetesTriggerResponse self = new DeleteKubernetesTriggerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteKubernetesTriggerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteKubernetesTriggerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

}
