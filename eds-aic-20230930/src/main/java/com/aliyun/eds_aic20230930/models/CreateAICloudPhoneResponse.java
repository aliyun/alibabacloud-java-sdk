// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateAICloudPhoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAICloudPhoneResponseBody body;

    public static CreateAICloudPhoneResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAICloudPhoneResponse self = new CreateAICloudPhoneResponse();
        return TeaModel.build(map, self);
    }

    public CreateAICloudPhoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAICloudPhoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAICloudPhoneResponse setBody(CreateAICloudPhoneResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAICloudPhoneResponseBody getBody() {
        return this.body;
    }

}
