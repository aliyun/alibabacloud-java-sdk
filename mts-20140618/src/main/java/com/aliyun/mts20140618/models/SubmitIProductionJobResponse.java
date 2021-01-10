// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitIProductionJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitIProductionJobResponseBody body;

    public static SubmitIProductionJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitIProductionJobResponse self = new SubmitIProductionJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitIProductionJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitIProductionJobResponse setBody(SubmitIProductionJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitIProductionJobResponseBody getBody() {
        return this.body;
    }

}
