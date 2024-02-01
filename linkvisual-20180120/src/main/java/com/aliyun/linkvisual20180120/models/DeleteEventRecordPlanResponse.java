// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteEventRecordPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteEventRecordPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEventRecordPlanResponse setBody(DeleteEventRecordPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEventRecordPlanResponseBody getBody() {
        return this.body;
    }

}
