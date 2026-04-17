// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class CheckCreateLindormV2InstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckCreateLindormV2InstanceResponseBody body;

    public static CheckCreateLindormV2InstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckCreateLindormV2InstanceResponse self = new CheckCreateLindormV2InstanceResponse();
        return TeaModel.build(map, self);
    }

    public CheckCreateLindormV2InstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckCreateLindormV2InstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckCreateLindormV2InstanceResponse setBody(CheckCreateLindormV2InstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckCreateLindormV2InstanceResponseBody getBody() {
        return this.body;
    }

}
