// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class AddTrafficSpecialControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddTrafficSpecialControlResponseBody body;

    public static AddTrafficSpecialControlResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTrafficSpecialControlResponse self = new AddTrafficSpecialControlResponse();
        return TeaModel.build(map, self);
    }

    public AddTrafficSpecialControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTrafficSpecialControlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddTrafficSpecialControlResponse setBody(AddTrafficSpecialControlResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTrafficSpecialControlResponseBody getBody() {
        return this.body;
    }

}
