// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class UpdateNodeGroupAttributesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateNodeGroupAttributesResponseBody body;

    public static UpdateNodeGroupAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeGroupAttributesResponse self = new UpdateNodeGroupAttributesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNodeGroupAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNodeGroupAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNodeGroupAttributesResponse setBody(UpdateNodeGroupAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNodeGroupAttributesResponseBody getBody() {
        return this.body;
    }

}
