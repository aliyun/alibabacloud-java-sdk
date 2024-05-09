// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainOrderCreateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TrainOrderCreateResponseBody body;

    public static TrainOrderCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        TrainOrderCreateResponse self = new TrainOrderCreateResponse();
        return TeaModel.build(map, self);
    }

    public TrainOrderCreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TrainOrderCreateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TrainOrderCreateResponse setBody(TrainOrderCreateResponseBody body) {
        this.body = body;
        return this;
    }
    public TrainOrderCreateResponseBody getBody() {
        return this.body;
    }

}
