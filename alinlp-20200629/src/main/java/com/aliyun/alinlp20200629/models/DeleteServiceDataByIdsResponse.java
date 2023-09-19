// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class DeleteServiceDataByIdsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteServiceDataByIdsResponseBody body;

    public static DeleteServiceDataByIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceDataByIdsResponse self = new DeleteServiceDataByIdsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServiceDataByIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServiceDataByIdsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteServiceDataByIdsResponse setBody(DeleteServiceDataByIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServiceDataByIdsResponseBody getBody() {
        return this.body;
    }

}
