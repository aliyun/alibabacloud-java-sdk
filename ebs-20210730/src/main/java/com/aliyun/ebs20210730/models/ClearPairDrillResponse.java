// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class ClearPairDrillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClearPairDrillResponseBody body;

    public static ClearPairDrillResponse build(java.util.Map<String, ?> map) throws Exception {
        ClearPairDrillResponse self = new ClearPairDrillResponse();
        return TeaModel.build(map, self);
    }

    public ClearPairDrillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClearPairDrillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClearPairDrillResponse setBody(ClearPairDrillResponseBody body) {
        this.body = body;
        return this;
    }
    public ClearPairDrillResponseBody getBody() {
        return this.body;
    }

}
