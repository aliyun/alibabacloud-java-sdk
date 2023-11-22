// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateFlowJSONAssetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFlowJSONAssetResponseBody body;

    public static UpdateFlowJSONAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowJSONAssetResponse self = new UpdateFlowJSONAssetResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFlowJSONAssetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFlowJSONAssetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFlowJSONAssetResponse setBody(UpdateFlowJSONAssetResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFlowJSONAssetResponseBody getBody() {
        return this.body;
    }

}
