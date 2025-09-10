// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteAggTaskGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAggTaskGroupResponseBody body;

    public static DeleteAggTaskGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAggTaskGroupResponse self = new DeleteAggTaskGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAggTaskGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAggTaskGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAggTaskGroupResponse setBody(DeleteAggTaskGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAggTaskGroupResponseBody getBody() {
        return this.body;
    }

}
