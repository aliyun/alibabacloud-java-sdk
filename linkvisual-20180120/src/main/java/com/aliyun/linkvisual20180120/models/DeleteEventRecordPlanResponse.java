// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteEventRecordPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEventRecordPlanResponseBody body;

    public static DeleteEventRecordPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventRecordPlanResponse self = new DeleteEventRecordPlanResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEventRecordPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEventRecordPlanResponse setBody(DeleteEventRecordPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEventRecordPlanResponseBody getBody() {
        return this.body;
    }

}
