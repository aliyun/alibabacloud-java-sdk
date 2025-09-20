// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class HighCodeDeployResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HighCodeDeployResponseBody body;

    public static HighCodeDeployResponse build(java.util.Map<String, ?> map) throws Exception {
        HighCodeDeployResponse self = new HighCodeDeployResponse();
        return TeaModel.build(map, self);
    }

    public HighCodeDeployResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HighCodeDeployResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HighCodeDeployResponse setBody(HighCodeDeployResponseBody body) {
        this.body = body;
        return this;
    }
    public HighCodeDeployResponseBody getBody() {
        return this.body;
    }

}
