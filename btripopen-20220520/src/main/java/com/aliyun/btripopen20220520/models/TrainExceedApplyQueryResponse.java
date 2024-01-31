// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainExceedApplyQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TrainExceedApplyQueryResponseBody body;

    public static TrainExceedApplyQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        TrainExceedApplyQueryResponse self = new TrainExceedApplyQueryResponse();
        return TeaModel.build(map, self);
    }

    public TrainExceedApplyQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TrainExceedApplyQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TrainExceedApplyQueryResponse setBody(TrainExceedApplyQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public TrainExceedApplyQueryResponseBody getBody() {
        return this.body;
    }

}
