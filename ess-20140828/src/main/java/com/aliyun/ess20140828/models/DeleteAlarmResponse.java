// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DeleteAlarmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAlarmResponseBody body;

    public static DeleteAlarmResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlarmResponse self = new DeleteAlarmResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAlarmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAlarmResponse setBody(DeleteAlarmResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAlarmResponseBody getBody() {
        return this.body;
    }

}
