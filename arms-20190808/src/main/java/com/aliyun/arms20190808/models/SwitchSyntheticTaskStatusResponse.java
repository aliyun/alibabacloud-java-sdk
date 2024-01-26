// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SwitchSyntheticTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SwitchSyntheticTaskStatusResponseBody body;

    public static SwitchSyntheticTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchSyntheticTaskStatusResponse self = new SwitchSyntheticTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public SwitchSyntheticTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchSyntheticTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchSyntheticTaskStatusResponse setBody(SwitchSyntheticTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchSyntheticTaskStatusResponseBody getBody() {
        return this.body;
    }

}
