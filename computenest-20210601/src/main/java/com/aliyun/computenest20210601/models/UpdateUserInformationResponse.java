// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class UpdateUserInformationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateUserInformationResponseBody body;

    public static UpdateUserInformationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserInformationResponse self = new UpdateUserInformationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserInformationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserInformationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUserInformationResponse setBody(UpdateUserInformationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserInformationResponseBody getBody() {
        return this.body;
    }

}
