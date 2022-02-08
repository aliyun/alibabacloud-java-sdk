// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class StartDISyncInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartDISyncInstanceResponseBody body;

    public static StartDISyncInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDISyncInstanceResponse self = new StartDISyncInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StartDISyncInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartDISyncInstanceResponse setBody(StartDISyncInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartDISyncInstanceResponseBody getBody() {
        return this.body;
    }

}
