// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class SchedulePodResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SchedulePodResponseBody body;

    public static SchedulePodResponse build(java.util.Map<String, ?> map) throws Exception {
        SchedulePodResponse self = new SchedulePodResponse();
        return TeaModel.build(map, self);
    }

    public SchedulePodResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SchedulePodResponse setBody(SchedulePodResponseBody body) {
        this.body = body;
        return this;
    }
    public SchedulePodResponseBody getBody() {
        return this.body;
    }

}
