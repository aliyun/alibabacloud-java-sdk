// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelAppMachineListByUserIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelAppMachineListByUserIdResponseBody body;

    public static SentinelAppMachineListByUserIdResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelAppMachineListByUserIdResponse self = new SentinelAppMachineListByUserIdResponse();
        return TeaModel.build(map, self);
    }

    public SentinelAppMachineListByUserIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelAppMachineListByUserIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelAppMachineListByUserIdResponse setBody(SentinelAppMachineListByUserIdResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelAppMachineListByUserIdResponseBody getBody() {
        return this.body;
    }

}
