// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class CreateLindormV2InstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLindormV2InstanceResponseBody body;

    public static CreateLindormV2InstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLindormV2InstanceResponse self = new CreateLindormV2InstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateLindormV2InstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLindormV2InstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLindormV2InstanceResponse setBody(CreateLindormV2InstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLindormV2InstanceResponseBody getBody() {
        return this.body;
    }

}
