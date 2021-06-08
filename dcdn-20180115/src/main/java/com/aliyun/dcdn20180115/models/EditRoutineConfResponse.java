// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class EditRoutineConfResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EditRoutineConfResponseBody body;

    public static EditRoutineConfResponse build(java.util.Map<String, ?> map) throws Exception {
        EditRoutineConfResponse self = new EditRoutineConfResponse();
        return TeaModel.build(map, self);
    }

    public EditRoutineConfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EditRoutineConfResponse setBody(EditRoutineConfResponseBody body) {
        this.body = body;
        return this;
    }
    public EditRoutineConfResponseBody getBody() {
        return this.body;
    }

}
