// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteDataServiceAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataServiceAppResponseBody body;

    public static DeleteDataServiceAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataServiceAppResponse self = new DeleteDataServiceAppResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataServiceAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataServiceAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataServiceAppResponse setBody(DeleteDataServiceAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataServiceAppResponseBody getBody() {
        return this.body;
    }

}
