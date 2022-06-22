// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelAppMachineListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelAppMachineListResponseBody body;

    public static SentinelAppMachineListResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelAppMachineListResponse self = new SentinelAppMachineListResponse();
        return TeaModel.build(map, self);
    }

    public SentinelAppMachineListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelAppMachineListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelAppMachineListResponse setBody(SentinelAppMachineListResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelAppMachineListResponseBody getBody() {
        return this.body;
    }

}
