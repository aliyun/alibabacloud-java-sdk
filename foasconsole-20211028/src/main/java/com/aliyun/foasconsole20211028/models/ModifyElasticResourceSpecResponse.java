// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ModifyElasticResourceSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyElasticResourceSpecResponseBody body;

    public static ModifyElasticResourceSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticResourceSpecResponse self = new ModifyElasticResourceSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyElasticResourceSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyElasticResourceSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyElasticResourceSpecResponse setBody(ModifyElasticResourceSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyElasticResourceSpecResponseBody getBody() {
        return this.body;
    }

}
