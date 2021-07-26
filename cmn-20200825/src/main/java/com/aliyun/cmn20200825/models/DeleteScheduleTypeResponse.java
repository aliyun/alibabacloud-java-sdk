// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteScheduleTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteScheduleTypeResponseBody body;

    public static DeleteScheduleTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteScheduleTypeResponse self = new DeleteScheduleTypeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteScheduleTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteScheduleTypeResponse setBody(DeleteScheduleTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteScheduleTypeResponseBody getBody() {
        return this.body;
    }

}
