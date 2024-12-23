// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class UpdateClusterAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateClusterAttributeResponseBody body;

    public static UpdateClusterAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterAttributeResponse self = new UpdateClusterAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateClusterAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateClusterAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateClusterAttributeResponse setBody(UpdateClusterAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateClusterAttributeResponseBody getBody() {
        return this.body;
    }

}
