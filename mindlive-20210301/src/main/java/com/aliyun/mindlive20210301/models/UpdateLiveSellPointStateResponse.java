// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class UpdateLiveSellPointStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLiveSellPointStateResponseBody body;

    public static UpdateLiveSellPointStateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveSellPointStateResponse self = new UpdateLiveSellPointStateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveSellPointStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLiveSellPointStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLiveSellPointStateResponse setBody(UpdateLiveSellPointStateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLiveSellPointStateResponseBody getBody() {
        return this.body;
    }

}
