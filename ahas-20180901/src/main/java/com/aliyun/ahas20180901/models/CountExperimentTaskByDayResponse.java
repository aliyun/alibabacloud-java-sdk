// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class CountExperimentTaskByDayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CountExperimentTaskByDayResponseBody body;

    public static CountExperimentTaskByDayResponse build(java.util.Map<String, ?> map) throws Exception {
        CountExperimentTaskByDayResponse self = new CountExperimentTaskByDayResponse();
        return TeaModel.build(map, self);
    }

    public CountExperimentTaskByDayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountExperimentTaskByDayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CountExperimentTaskByDayResponse setBody(CountExperimentTaskByDayResponseBody body) {
        this.body = body;
        return this;
    }
    public CountExperimentTaskByDayResponseBody getBody() {
        return this.body;
    }

}
