// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class DeleteServiceDataByConditionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteServiceDataByConditionsResponseBody body;

    public static DeleteServiceDataByConditionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceDataByConditionsResponse self = new DeleteServiceDataByConditionsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServiceDataByConditionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServiceDataByConditionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteServiceDataByConditionsResponse setBody(DeleteServiceDataByConditionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServiceDataByConditionsResponseBody getBody() {
        return this.body;
    }

}
