// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class AddCustomAudienceUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddCustomAudienceUserResponseBody body;

    public static AddCustomAudienceUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCustomAudienceUserResponse self = new AddCustomAudienceUserResponse();
        return TeaModel.build(map, self);
    }

    public AddCustomAudienceUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCustomAudienceUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddCustomAudienceUserResponse setBody(AddCustomAudienceUserResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCustomAudienceUserResponseBody getBody() {
        return this.body;
    }

}
