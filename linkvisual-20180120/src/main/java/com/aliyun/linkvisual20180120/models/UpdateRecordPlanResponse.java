// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateRecordPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateRecordPlanResponse setBody(UpdateRecordPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRecordPlanResponseBody getBody() {
        return this.body;
    }

}
