// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class ModifyUserDefinedSgResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyUserDefinedSgResponseBody body;

    public static ModifyUserDefinedSgResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserDefinedSgResponse self = new ModifyUserDefinedSgResponse();
        return TeaModel.build(map, self);
    }

    public ModifyUserDefinedSgResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyUserDefinedSgResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyUserDefinedSgResponse setBody(ModifyUserDefinedSgResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyUserDefinedSgResponseBody getBody() {
        return this.body;
    }

}
