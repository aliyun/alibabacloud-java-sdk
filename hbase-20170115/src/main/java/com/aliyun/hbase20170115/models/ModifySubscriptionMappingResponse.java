// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ModifySubscriptionMappingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySubscriptionMappingResponseBody body;

    public static ModifySubscriptionMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySubscriptionMappingResponse self = new ModifySubscriptionMappingResponse();
        return TeaModel.build(map, self);
    }

    public ModifySubscriptionMappingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySubscriptionMappingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySubscriptionMappingResponse setBody(ModifySubscriptionMappingResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySubscriptionMappingResponseBody getBody() {
        return this.body;
    }

}
