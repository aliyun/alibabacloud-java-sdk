// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribleLayer7InstanceRelationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribleLayer7InstanceRelationsResponseBody body;

    public static DescribleLayer7InstanceRelationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribleLayer7InstanceRelationsResponse self = new DescribleLayer7InstanceRelationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribleLayer7InstanceRelationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribleLayer7InstanceRelationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribleLayer7InstanceRelationsResponse setBody(DescribleLayer7InstanceRelationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribleLayer7InstanceRelationsResponseBody getBody() {
        return this.body;
    }

}
