// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class UpdateLindormInstanceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLindormInstanceAttributeResponseBody body;

    public static UpdateLindormInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLindormInstanceAttributeResponse self = new UpdateLindormInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLindormInstanceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLindormInstanceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLindormInstanceAttributeResponse setBody(UpdateLindormInstanceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLindormInstanceAttributeResponseBody getBody() {
        return this.body;
    }

}
