// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateScheduleDutyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateScheduleDutyResponseBody body;

    public static UpdateScheduleDutyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduleDutyResponse self = new UpdateScheduleDutyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateScheduleDutyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateScheduleDutyResponse setBody(UpdateScheduleDutyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateScheduleDutyResponseBody getBody() {
        return this.body;
    }

}
