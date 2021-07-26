// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteScheduleDutyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteScheduleDutyResponseBody body;

    public static DeleteScheduleDutyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteScheduleDutyResponse self = new DeleteScheduleDutyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteScheduleDutyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteScheduleDutyResponse setBody(DeleteScheduleDutyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteScheduleDutyResponseBody getBody() {
        return this.body;
    }

}
