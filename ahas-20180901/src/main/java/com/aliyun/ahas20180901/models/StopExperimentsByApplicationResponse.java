// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class StopExperimentsByApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopExperimentsByApplicationResponseBody body;

    public static StopExperimentsByApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        StopExperimentsByApplicationResponse self = new StopExperimentsByApplicationResponse();
        return TeaModel.build(map, self);
    }

    public StopExperimentsByApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopExperimentsByApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopExperimentsByApplicationResponse setBody(StopExperimentsByApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public StopExperimentsByApplicationResponseBody getBody() {
        return this.body;
    }

}
