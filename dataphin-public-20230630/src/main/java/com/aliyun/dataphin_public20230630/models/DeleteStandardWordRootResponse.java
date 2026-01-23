// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteStandardWordRootResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteStandardWordRootResponseBody body;

    public static DeleteStandardWordRootResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStandardWordRootResponse self = new DeleteStandardWordRootResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStandardWordRootResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStandardWordRootResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteStandardWordRootResponse setBody(DeleteStandardWordRootResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStandardWordRootResponseBody getBody() {
        return this.body;
    }

}
