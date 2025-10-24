// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateTagGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTagGroupResponseBody body;

    public static UpdateTagGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTagGroupResponse self = new UpdateTagGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTagGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTagGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTagGroupResponse setBody(UpdateTagGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTagGroupResponseBody getBody() {
        return this.body;
    }

}
