// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormV2InstanceForTerraformResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLindormV2InstanceForTerraformResponseBody body;

    public static GetLindormV2InstanceForTerraformResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLindormV2InstanceForTerraformResponse self = new GetLindormV2InstanceForTerraformResponse();
        return TeaModel.build(map, self);
    }

    public GetLindormV2InstanceForTerraformResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLindormV2InstanceForTerraformResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLindormV2InstanceForTerraformResponse setBody(GetLindormV2InstanceForTerraformResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLindormV2InstanceForTerraformResponseBody getBody() {
        return this.body;
    }

}
