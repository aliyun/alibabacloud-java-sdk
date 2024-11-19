// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormV2InstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLindormV2InstanceResponseBody body;

    public static GetLindormV2InstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLindormV2InstanceResponse self = new GetLindormV2InstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetLindormV2InstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLindormV2InstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLindormV2InstanceResponse setBody(GetLindormV2InstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLindormV2InstanceResponseBody getBody() {
        return this.body;
    }

}
