// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtFlowSpecialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FtFlowSpecialResponseBody body;

    public static FtFlowSpecialResponse build(java.util.Map<String, ?> map) throws Exception {
        FtFlowSpecialResponse self = new FtFlowSpecialResponse();
        return TeaModel.build(map, self);
    }

    public FtFlowSpecialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FtFlowSpecialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FtFlowSpecialResponse setBody(FtFlowSpecialResponseBody body) {
        this.body = body;
        return this;
    }
    public FtFlowSpecialResponseBody getBody() {
        return this.body;
    }

}
