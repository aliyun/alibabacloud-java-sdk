// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class CreateAlarmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAlarmResponseBody body;

    public static CreateAlarmResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAlarmResponse self = new CreateAlarmResponse();
        return TeaModel.build(map, self);
    }

    public CreateAlarmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAlarmResponse setBody(CreateAlarmResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAlarmResponseBody getBody() {
        return this.body;
    }

}
