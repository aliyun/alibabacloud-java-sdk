// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateAggTaskGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAggTaskGroupResponseBody body;

    public static UpdateAggTaskGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAggTaskGroupResponse self = new UpdateAggTaskGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAggTaskGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAggTaskGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAggTaskGroupResponse setBody(UpdateAggTaskGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAggTaskGroupResponseBody getBody() {
        return this.body;
    }

}
