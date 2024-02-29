// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteDataServiceApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataServiceApiResponseBody body;

    public static DeleteDataServiceApiResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataServiceApiResponse self = new DeleteDataServiceApiResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataServiceApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataServiceApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataServiceApiResponse setBody(DeleteDataServiceApiResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataServiceApiResponseBody getBody() {
        return this.body;
    }

}
