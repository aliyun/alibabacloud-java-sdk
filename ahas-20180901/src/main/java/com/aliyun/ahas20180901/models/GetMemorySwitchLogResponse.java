// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetMemorySwitchLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMemorySwitchLogResponseBody body;

    public static GetMemorySwitchLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMemorySwitchLogResponse self = new GetMemorySwitchLogResponse();
        return TeaModel.build(map, self);
    }

    public GetMemorySwitchLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMemorySwitchLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMemorySwitchLogResponse setBody(GetMemorySwitchLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMemorySwitchLogResponseBody getBody() {
        return this.body;
    }

}
