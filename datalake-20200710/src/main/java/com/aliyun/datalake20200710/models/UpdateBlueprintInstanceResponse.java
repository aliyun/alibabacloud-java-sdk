// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateBlueprintInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateBlueprintInstanceResponseBody body;

    public static UpdateBlueprintInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBlueprintInstanceResponse self = new UpdateBlueprintInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBlueprintInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBlueprintInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBlueprintInstanceResponse setBody(UpdateBlueprintInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBlueprintInstanceResponseBody getBody() {
        return this.body;
    }

}
