// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class UpdateGroupTitleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGroupTitleResponseBody body;

    public static UpdateGroupTitleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupTitleResponse self = new UpdateGroupTitleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGroupTitleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGroupTitleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGroupTitleResponse setBody(UpdateGroupTitleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGroupTitleResponseBody getBody() {
        return this.body;
    }

}
