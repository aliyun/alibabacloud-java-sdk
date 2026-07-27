// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateKgRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateKgRelationResponseBody body;

    public static UpdateKgRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKgRelationResponse self = new UpdateKgRelationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateKgRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateKgRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateKgRelationResponse setBody(UpdateKgRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateKgRelationResponseBody getBody() {
        return this.body;
    }

}
