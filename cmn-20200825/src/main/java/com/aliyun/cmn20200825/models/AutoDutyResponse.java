// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class AutoDutyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AutoDutyResponseBody body;

    public static AutoDutyResponse build(java.util.Map<String, ?> map) throws Exception {
        AutoDutyResponse self = new AutoDutyResponse();
        return TeaModel.build(map, self);
    }

    public AutoDutyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AutoDutyResponse setBody(AutoDutyResponseBody body) {
        this.body = body;
        return this;
    }
    public AutoDutyResponseBody getBody() {
        return this.body;
    }

}
