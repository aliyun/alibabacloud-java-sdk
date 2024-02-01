// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteRecordPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteRecordPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRecordPlanResponse setBody(DeleteRecordPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRecordPlanResponseBody getBody() {
        return this.body;
    }

}
