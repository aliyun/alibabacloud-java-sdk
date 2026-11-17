// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class PreviewLogicalModelUpdateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PreviewLogicalModelUpdateResponseBody body;

    public static PreviewLogicalModelUpdateResponse build(java.util.Map<String, ?> map) throws Exception {
        PreviewLogicalModelUpdateResponse self = new PreviewLogicalModelUpdateResponse();
        return TeaModel.build(map, self);
    }

    public PreviewLogicalModelUpdateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreviewLogicalModelUpdateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PreviewLogicalModelUpdateResponse setBody(PreviewLogicalModelUpdateResponseBody body) {
        this.body = body;
        return this;
    }
    public PreviewLogicalModelUpdateResponseBody getBody() {
        return this.body;
    }

}
