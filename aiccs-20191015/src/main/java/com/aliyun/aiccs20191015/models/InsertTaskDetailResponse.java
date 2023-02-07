// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class InsertTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InsertTaskDetailResponseBody body;

    public static InsertTaskDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertTaskDetailResponse self = new InsertTaskDetailResponse();
        return TeaModel.build(map, self);
    }

    public InsertTaskDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertTaskDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsertTaskDetailResponse setBody(InsertTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertTaskDetailResponseBody getBody() {
        return this.body;
    }

}
