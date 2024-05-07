// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateLoginProfileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLoginProfileResponseBody body;

    public static UpdateLoginProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoginProfileResponse self = new UpdateLoginProfileResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLoginProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLoginProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLoginProfileResponse setBody(UpdateLoginProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLoginProfileResponseBody getBody() {
        return this.body;
    }

}
