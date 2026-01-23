// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteStandardRelationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteStandardRelationsResponseBody body;

    public static DeleteStandardRelationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStandardRelationsResponse self = new DeleteStandardRelationsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStandardRelationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStandardRelationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteStandardRelationsResponse setBody(DeleteStandardRelationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStandardRelationsResponseBody getBody() {
        return this.body;
    }

}
