// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteUmodelCommonSchemaRefResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUmodelCommonSchemaRefResponseBody body;

    public static DeleteUmodelCommonSchemaRefResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUmodelCommonSchemaRefResponse self = new DeleteUmodelCommonSchemaRefResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUmodelCommonSchemaRefResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUmodelCommonSchemaRefResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUmodelCommonSchemaRefResponse setBody(DeleteUmodelCommonSchemaRefResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUmodelCommonSchemaRefResponseBody getBody() {
        return this.body;
    }

}
