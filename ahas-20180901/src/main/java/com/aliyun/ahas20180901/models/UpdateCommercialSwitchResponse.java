// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateCommercialSwitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCommercialSwitchResponseBody body;

    public static UpdateCommercialSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCommercialSwitchResponse self = new UpdateCommercialSwitchResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCommercialSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCommercialSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCommercialSwitchResponse setBody(UpdateCommercialSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCommercialSwitchResponseBody getBody() {
        return this.body;
    }

}
