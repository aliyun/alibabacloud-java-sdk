// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateEventRecordPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateEventRecordPlanResponseBody body;

    public static UpdateEventRecordPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventRecordPlanResponse self = new UpdateEventRecordPlanResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEventRecordPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEventRecordPlanResponse setBody(UpdateEventRecordPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEventRecordPlanResponseBody getBody() {
        return this.body;
    }

}
