// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateCloudPhoneNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCloudPhoneNodeResponseBody body;

    public static CreateCloudPhoneNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudPhoneNodeResponse self = new CreateCloudPhoneNodeResponse();
        return TeaModel.build(map, self);
    }

    public CreateCloudPhoneNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCloudPhoneNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCloudPhoneNodeResponse setBody(CreateCloudPhoneNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCloudPhoneNodeResponseBody getBody() {
        return this.body;
    }

}
