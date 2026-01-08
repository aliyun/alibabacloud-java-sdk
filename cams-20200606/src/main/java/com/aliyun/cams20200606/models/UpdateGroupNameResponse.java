// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateGroupNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGroupNameResponseBody body;

    public static UpdateGroupNameResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupNameResponse self = new UpdateGroupNameResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGroupNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGroupNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGroupNameResponse setBody(UpdateGroupNameResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGroupNameResponseBody getBody() {
        return this.body;
    }

}
