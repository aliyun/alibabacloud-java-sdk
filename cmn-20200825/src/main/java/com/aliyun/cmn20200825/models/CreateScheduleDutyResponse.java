// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateScheduleDutyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateScheduleDutyResponseBody body;

    public static CreateScheduleDutyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduleDutyResponse self = new CreateScheduleDutyResponse();
        return TeaModel.build(map, self);
    }

    public CreateScheduleDutyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScheduleDutyResponse setBody(CreateScheduleDutyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScheduleDutyResponseBody getBody() {
        return this.body;
    }

}
