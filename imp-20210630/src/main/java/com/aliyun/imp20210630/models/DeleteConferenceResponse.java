// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteConferenceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteConferenceResponseBody body;

    public static DeleteConferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConferenceResponse self = new DeleteConferenceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteConferenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteConferenceResponse setBody(DeleteConferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConferenceResponseBody getBody() {
        return this.body;
    }

}
