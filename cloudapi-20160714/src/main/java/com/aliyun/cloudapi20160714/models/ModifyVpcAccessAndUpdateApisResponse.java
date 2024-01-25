// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyVpcAccessAndUpdateApisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVpcAccessAndUpdateApisResponseBody body;

    public static ModifyVpcAccessAndUpdateApisResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcAccessAndUpdateApisResponse self = new ModifyVpcAccessAndUpdateApisResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVpcAccessAndUpdateApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVpcAccessAndUpdateApisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVpcAccessAndUpdateApisResponse setBody(ModifyVpcAccessAndUpdateApisResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVpcAccessAndUpdateApisResponseBody getBody() {
        return this.body;
    }

}
