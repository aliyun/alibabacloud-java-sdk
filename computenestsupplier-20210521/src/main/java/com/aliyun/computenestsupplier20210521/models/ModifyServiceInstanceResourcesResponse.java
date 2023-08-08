// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ModifyServiceInstanceResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyServiceInstanceResourcesResponseBody body;

    public static ModifyServiceInstanceResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyServiceInstanceResourcesResponse self = new ModifyServiceInstanceResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyServiceInstanceResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyServiceInstanceResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyServiceInstanceResourcesResponse setBody(ModifyServiceInstanceResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyServiceInstanceResourcesResponseBody getBody() {
        return this.body;
    }

}
