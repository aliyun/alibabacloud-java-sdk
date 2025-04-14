// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateColumnBusinessMetadataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateColumnBusinessMetadataResponseBody body;

    public static UpdateColumnBusinessMetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateColumnBusinessMetadataResponse self = new UpdateColumnBusinessMetadataResponse();
        return TeaModel.build(map, self);
    }

    public UpdateColumnBusinessMetadataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateColumnBusinessMetadataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateColumnBusinessMetadataResponse setBody(UpdateColumnBusinessMetadataResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateColumnBusinessMetadataResponseBody getBody() {
        return this.body;
    }

}
