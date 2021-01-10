// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class StopIProductionJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopIProductionJobResponseBody body;

    public static StopIProductionJobResponse build(java.util.Map<String, ?> map) throws Exception {
        StopIProductionJobResponse self = new StopIProductionJobResponse();
        return TeaModel.build(map, self);
    }

    public StopIProductionJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopIProductionJobResponse setBody(StopIProductionJobResponseBody body) {
        this.body = body;
        return this;
    }
    public StopIProductionJobResponseBody getBody() {
        return this.body;
    }

}
