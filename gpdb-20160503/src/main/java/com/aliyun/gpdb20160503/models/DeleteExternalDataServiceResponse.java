// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteExternalDataServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteExternalDataServiceResponseBody body;

    public static DeleteExternalDataServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExternalDataServiceResponse self = new DeleteExternalDataServiceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExternalDataServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExternalDataServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteExternalDataServiceResponse setBody(DeleteExternalDataServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExternalDataServiceResponseBody getBody() {
        return this.body;
    }

}
