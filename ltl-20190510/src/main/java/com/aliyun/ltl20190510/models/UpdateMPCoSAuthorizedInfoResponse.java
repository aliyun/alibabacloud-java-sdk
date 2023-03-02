// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class UpdateMPCoSAuthorizedInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMPCoSAuthorizedInfoResponseBody body;

    public static UpdateMPCoSAuthorizedInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMPCoSAuthorizedInfoResponse self = new UpdateMPCoSAuthorizedInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMPCoSAuthorizedInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMPCoSAuthorizedInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMPCoSAuthorizedInfoResponse setBody(UpdateMPCoSAuthorizedInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMPCoSAuthorizedInfoResponseBody getBody() {
        return this.body;
    }

}
