// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainOrderChangeConfirmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TrainOrderChangeConfirmResponseBody body;

    public static TrainOrderChangeConfirmResponse build(java.util.Map<String, ?> map) throws Exception {
        TrainOrderChangeConfirmResponse self = new TrainOrderChangeConfirmResponse();
        return TeaModel.build(map, self);
    }

    public TrainOrderChangeConfirmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TrainOrderChangeConfirmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TrainOrderChangeConfirmResponse setBody(TrainOrderChangeConfirmResponseBody body) {
        this.body = body;
        return this;
    }
    public TrainOrderChangeConfirmResponseBody getBody() {
        return this.body;
    }

}
