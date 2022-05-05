// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateIMRobotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOrUpdateIMRobotResponseBody body;

    public static CreateOrUpdateIMRobotResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateIMRobotResponse self = new CreateOrUpdateIMRobotResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateIMRobotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrUpdateIMRobotResponse setBody(CreateOrUpdateIMRobotResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrUpdateIMRobotResponseBody getBody() {
        return this.body;
    }

}
