// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CancelOTATaskByJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelOTATaskByJobResponseBody body;

    public static CancelOTATaskByJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelOTATaskByJobResponse self = new CancelOTATaskByJobResponse();
        return TeaModel.build(map, self);
    }

    public CancelOTATaskByJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelOTATaskByJobResponse setBody(CancelOTATaskByJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelOTATaskByJobResponseBody getBody() {
        return this.body;
    }

}
