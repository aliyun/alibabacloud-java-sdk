// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class UpdateLindormV2InstanceParameterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLindormV2InstanceParameterResponseBody body;

    public static UpdateLindormV2InstanceParameterResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLindormV2InstanceParameterResponse self = new UpdateLindormV2InstanceParameterResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLindormV2InstanceParameterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLindormV2InstanceParameterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLindormV2InstanceParameterResponse setBody(UpdateLindormV2InstanceParameterResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLindormV2InstanceParameterResponseBody getBody() {
        return this.body;
    }

}
