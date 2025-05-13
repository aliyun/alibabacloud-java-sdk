// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteUmodelDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUmodelDataResponseBody body;

    public static DeleteUmodelDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUmodelDataResponse self = new DeleteUmodelDataResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUmodelDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUmodelDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUmodelDataResponse setBody(DeleteUmodelDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUmodelDataResponseBody getBody() {
        return this.body;
    }

}
