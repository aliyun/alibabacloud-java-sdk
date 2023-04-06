// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateGroupDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGroupDescriptionResponseBody body;

    public static UpdateGroupDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupDescriptionResponse self = new UpdateGroupDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGroupDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGroupDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGroupDescriptionResponse setBody(UpdateGroupDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGroupDescriptionResponseBody getBody() {
        return this.body;
    }

}
