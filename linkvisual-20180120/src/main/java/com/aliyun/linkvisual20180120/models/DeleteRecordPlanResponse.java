// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteRecordPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRecordPlanResponseBody body;

    public static DeleteRecordPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecordPlanResponse self = new DeleteRecordPlanResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRecordPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRecordPlanResponse setBody(DeleteRecordPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRecordPlanResponseBody getBody() {
        return this.body;
    }

}
