// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class ActiveInteractionEuCreateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ActiveInteractionEuCreateResponseBody body;

    public static ActiveInteractionEuCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        ActiveInteractionEuCreateResponse self = new ActiveInteractionEuCreateResponse();
        return TeaModel.build(map, self);
    }

    public ActiveInteractionEuCreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActiveInteractionEuCreateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ActiveInteractionEuCreateResponse setBody(ActiveInteractionEuCreateResponseBody body) {
        this.body = body;
        return this;
    }
    public ActiveInteractionEuCreateResponseBody getBody() {
        return this.body;
    }

}
