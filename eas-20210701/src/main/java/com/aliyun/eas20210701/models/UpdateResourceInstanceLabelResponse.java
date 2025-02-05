// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateResourceInstanceLabelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateResourceInstanceLabelResponseBody body;

    public static UpdateResourceInstanceLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceInstanceLabelResponse self = new UpdateResourceInstanceLabelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateResourceInstanceLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateResourceInstanceLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateResourceInstanceLabelResponse setBody(UpdateResourceInstanceLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateResourceInstanceLabelResponseBody getBody() {
        return this.body;
    }

}
