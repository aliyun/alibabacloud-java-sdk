// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetResult4QueryInstancePrice4ModifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResult4QueryInstancePrice4ModifyResponseBody body;

    public static GetResult4QueryInstancePrice4ModifyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResult4QueryInstancePrice4ModifyResponse self = new GetResult4QueryInstancePrice4ModifyResponse();
        return TeaModel.build(map, self);
    }

    public GetResult4QueryInstancePrice4ModifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResult4QueryInstancePrice4ModifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResult4QueryInstancePrice4ModifyResponse setBody(GetResult4QueryInstancePrice4ModifyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResult4QueryInstancePrice4ModifyResponseBody getBody() {
        return this.body;
    }

}
