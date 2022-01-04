// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CheckBlueprintInstanceNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckBlueprintInstanceNameResponseBody body;

    public static CheckBlueprintInstanceNameResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckBlueprintInstanceNameResponse self = new CheckBlueprintInstanceNameResponse();
        return TeaModel.build(map, self);
    }

    public CheckBlueprintInstanceNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckBlueprintInstanceNameResponse setBody(CheckBlueprintInstanceNameResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckBlueprintInstanceNameResponseBody getBody() {
        return this.body;
    }

}
