// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class UpdateLindormV2InstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLindormV2InstanceResponseBody body;

    public static UpdateLindormV2InstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLindormV2InstanceResponse self = new UpdateLindormV2InstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLindormV2InstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLindormV2InstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLindormV2InstanceResponse setBody(UpdateLindormV2InstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLindormV2InstanceResponseBody getBody() {
        return this.body;
    }

}
