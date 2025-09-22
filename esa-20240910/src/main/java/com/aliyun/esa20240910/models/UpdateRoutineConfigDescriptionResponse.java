// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateRoutineConfigDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRoutineConfigDescriptionResponseBody body;

    public static UpdateRoutineConfigDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRoutineConfigDescriptionResponse self = new UpdateRoutineConfigDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRoutineConfigDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRoutineConfigDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRoutineConfigDescriptionResponse setBody(UpdateRoutineConfigDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRoutineConfigDescriptionResponseBody getBody() {
        return this.body;
    }

}
