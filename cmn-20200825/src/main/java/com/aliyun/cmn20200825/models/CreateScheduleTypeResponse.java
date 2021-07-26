// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateScheduleTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateScheduleTypeResponseBody body;

    public static CreateScheduleTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduleTypeResponse self = new CreateScheduleTypeResponse();
        return TeaModel.build(map, self);
    }

    public CreateScheduleTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScheduleTypeResponse setBody(CreateScheduleTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScheduleTypeResponseBody getBody() {
        return this.body;
    }

}
