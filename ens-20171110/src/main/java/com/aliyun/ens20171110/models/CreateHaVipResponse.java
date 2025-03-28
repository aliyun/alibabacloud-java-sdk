// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateHaVipResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHaVipResponseBody body;

    public static CreateHaVipResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHaVipResponse self = new CreateHaVipResponse();
        return TeaModel.build(map, self);
    }

    public CreateHaVipResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHaVipResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHaVipResponse setBody(CreateHaVipResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHaVipResponseBody getBody() {
        return this.body;
    }

}
