// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateServiceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateServiceGroupResponseBody body;

    public static UpdateServiceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceGroupResponse self = new UpdateServiceGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateServiceGroupResponse setBody(UpdateServiceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceGroupResponseBody getBody() {
        return this.body;
    }

}
