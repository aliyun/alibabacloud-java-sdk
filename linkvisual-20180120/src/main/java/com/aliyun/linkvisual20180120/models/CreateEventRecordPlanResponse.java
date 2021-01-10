// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateEventRecordPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEventRecordPlanResponseBody body;

    public static CreateEventRecordPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEventRecordPlanResponse self = new CreateEventRecordPlanResponse();
        return TeaModel.build(map, self);
    }

    public CreateEventRecordPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEventRecordPlanResponse setBody(CreateEventRecordPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEventRecordPlanResponseBody getBody() {
        return this.body;
    }

}
