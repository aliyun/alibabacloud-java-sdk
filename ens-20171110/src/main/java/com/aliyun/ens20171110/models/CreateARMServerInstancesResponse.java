// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateARMServerInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateARMServerInstancesResponseBody body;

    public static CreateARMServerInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateARMServerInstancesResponse self = new CreateARMServerInstancesResponse();
        return TeaModel.build(map, self);
    }

    public CreateARMServerInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateARMServerInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateARMServerInstancesResponse setBody(CreateARMServerInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateARMServerInstancesResponseBody getBody() {
        return this.body;
    }

}
