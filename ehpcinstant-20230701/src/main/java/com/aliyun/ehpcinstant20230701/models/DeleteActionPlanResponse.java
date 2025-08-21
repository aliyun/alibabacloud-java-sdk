// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class DeleteActionPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteActionPlanResponseBody body;

    public static DeleteActionPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteActionPlanResponse self = new DeleteActionPlanResponse();
        return TeaModel.build(map, self);
    }

    public DeleteActionPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteActionPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteActionPlanResponse setBody(DeleteActionPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteActionPlanResponseBody getBody() {
        return this.body;
    }

}
