// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateRemindResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRemindResponseBody body;

    public static UpdateRemindResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRemindResponse self = new UpdateRemindResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRemindResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRemindResponse setBody(UpdateRemindResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRemindResponseBody getBody() {
        return this.body;
    }

}
