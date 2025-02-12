// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateSlrRoleForRealtimeLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSlrRoleForRealtimeLogResponseBody body;

    public static CreateSlrRoleForRealtimeLogResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSlrRoleForRealtimeLogResponse self = new CreateSlrRoleForRealtimeLogResponse();
        return TeaModel.build(map, self);
    }

    public CreateSlrRoleForRealtimeLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSlrRoleForRealtimeLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSlrRoleForRealtimeLogResponse setBody(CreateSlrRoleForRealtimeLogResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSlrRoleForRealtimeLogResponseBody getBody() {
        return this.body;
    }

}
