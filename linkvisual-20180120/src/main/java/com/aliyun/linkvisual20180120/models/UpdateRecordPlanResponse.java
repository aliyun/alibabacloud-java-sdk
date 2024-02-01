// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateRecordPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRecordPlanResponseBody body;

    public static UpdateRecordPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecordPlanResponse self = new UpdateRecordPlanResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRecordPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRecordPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRecordPlanResponse setBody(UpdateRecordPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRecordPlanResponseBody getBody() {
        return this.body;
    }

}
