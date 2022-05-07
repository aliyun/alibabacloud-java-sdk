// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class AssociateIpWithConnectionPoolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AssociateIpWithConnectionPoolResponseBody body;

    public static AssociateIpWithConnectionPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateIpWithConnectionPoolResponse self = new AssociateIpWithConnectionPoolResponse();
        return TeaModel.build(map, self);
    }

    public AssociateIpWithConnectionPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateIpWithConnectionPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateIpWithConnectionPoolResponse setBody(AssociateIpWithConnectionPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateIpWithConnectionPoolResponseBody getBody() {
        return this.body;
    }

}
