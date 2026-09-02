// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class SubmitBatchChangeTableOwnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitBatchChangeTableOwnerResponseBody body;

    public static SubmitBatchChangeTableOwnerResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitBatchChangeTableOwnerResponse self = new SubmitBatchChangeTableOwnerResponse();
        return TeaModel.build(map, self);
    }

    public SubmitBatchChangeTableOwnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitBatchChangeTableOwnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitBatchChangeTableOwnerResponse setBody(SubmitBatchChangeTableOwnerResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitBatchChangeTableOwnerResponseBody getBody() {
        return this.body;
    }

}
