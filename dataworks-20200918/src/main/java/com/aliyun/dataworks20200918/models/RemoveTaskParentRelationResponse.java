// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class RemoveTaskParentRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveTaskParentRelationResponseBody body;

    public static RemoveTaskParentRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveTaskParentRelationResponse self = new RemoveTaskParentRelationResponse();
        return TeaModel.build(map, self);
    }

    public RemoveTaskParentRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveTaskParentRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveTaskParentRelationResponse setBody(RemoveTaskParentRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveTaskParentRelationResponseBody getBody() {
        return this.body;
    }

}
