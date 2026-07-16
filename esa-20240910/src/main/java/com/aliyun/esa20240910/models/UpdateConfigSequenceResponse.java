// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateConfigSequenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateConfigSequenceResponseBody body;

    public static UpdateConfigSequenceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigSequenceResponse self = new UpdateConfigSequenceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateConfigSequenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateConfigSequenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateConfigSequenceResponse setBody(UpdateConfigSequenceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateConfigSequenceResponseBody getBody() {
        return this.body;
    }

}
