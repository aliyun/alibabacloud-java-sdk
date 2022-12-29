// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class AddOrUpdateDisPlayModesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddOrUpdateDisPlayModesResponseBody body;

    public static AddOrUpdateDisPlayModesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddOrUpdateDisPlayModesResponse self = new AddOrUpdateDisPlayModesResponse();
        return TeaModel.build(map, self);
    }

    public AddOrUpdateDisPlayModesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddOrUpdateDisPlayModesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddOrUpdateDisPlayModesResponse setBody(AddOrUpdateDisPlayModesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddOrUpdateDisPlayModesResponseBody getBody() {
        return this.body;
    }

}
