// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateApplicationDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApplicationDescriptionResponseBody body;

    public static UpdateApplicationDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationDescriptionResponse self = new UpdateApplicationDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApplicationDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApplicationDescriptionResponse setBody(UpdateApplicationDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApplicationDescriptionResponseBody getBody() {
        return this.body;
    }

}
