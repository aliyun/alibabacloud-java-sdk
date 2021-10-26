// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class DeleteTriggerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static DeleteTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTriggerResponse self = new DeleteTriggerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTriggerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
