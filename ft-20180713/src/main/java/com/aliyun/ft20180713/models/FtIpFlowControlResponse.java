// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtIpFlowControlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FtIpFlowControlResponseBody body;

    public static FtIpFlowControlResponse build(java.util.Map<String, ?> map) throws Exception {
        FtIpFlowControlResponse self = new FtIpFlowControlResponse();
        return TeaModel.build(map, self);
    }

    public FtIpFlowControlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FtIpFlowControlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FtIpFlowControlResponse setBody(FtIpFlowControlResponseBody body) {
        this.body = body;
        return this;
    }
    public FtIpFlowControlResponseBody getBody() {
        return this.body;
    }

}
