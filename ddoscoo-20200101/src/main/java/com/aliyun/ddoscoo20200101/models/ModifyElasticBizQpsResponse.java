// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyElasticBizQpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyElasticBizQpsResponseBody body;

    public static ModifyElasticBizQpsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticBizQpsResponse self = new ModifyElasticBizQpsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyElasticBizQpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyElasticBizQpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyElasticBizQpsResponse setBody(ModifyElasticBizQpsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyElasticBizQpsResponseBody getBody() {
        return this.body;
    }

}
