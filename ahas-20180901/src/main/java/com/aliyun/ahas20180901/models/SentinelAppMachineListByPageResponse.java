// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelAppMachineListByPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelAppMachineListByPageResponseBody body;

    public static SentinelAppMachineListByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelAppMachineListByPageResponse self = new SentinelAppMachineListByPageResponse();
        return TeaModel.build(map, self);
    }

    public SentinelAppMachineListByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelAppMachineListByPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelAppMachineListByPageResponse setBody(SentinelAppMachineListByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelAppMachineListByPageResponseBody getBody() {
        return this.body;
    }

}
