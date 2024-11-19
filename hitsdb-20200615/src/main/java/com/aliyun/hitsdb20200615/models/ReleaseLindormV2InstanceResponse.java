// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class ReleaseLindormV2InstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseLindormV2InstanceResponseBody body;

    public static ReleaseLindormV2InstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseLindormV2InstanceResponse self = new ReleaseLindormV2InstanceResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseLindormV2InstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseLindormV2InstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseLindormV2InstanceResponse setBody(ReleaseLindormV2InstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseLindormV2InstanceResponseBody getBody() {
        return this.body;
    }

}
