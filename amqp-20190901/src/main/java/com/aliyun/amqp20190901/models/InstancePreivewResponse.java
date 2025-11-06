// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class InstancePreivewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstancePreivewResponseBody body;

    public static InstancePreivewResponse build(java.util.Map<String, ?> map) throws Exception {
        InstancePreivewResponse self = new InstancePreivewResponse();
        return TeaModel.build(map, self);
    }

    public InstancePreivewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstancePreivewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstancePreivewResponse setBody(InstancePreivewResponseBody body) {
        this.body = body;
        return this;
    }
    public InstancePreivewResponseBody getBody() {
        return this.body;
    }

}
