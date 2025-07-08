// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class OpencPrevFlagNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpencPrevFlagNewResponseBody body;

    public static OpencPrevFlagNewResponse build(java.util.Map<String, ?> map) throws Exception {
        OpencPrevFlagNewResponse self = new OpencPrevFlagNewResponse();
        return TeaModel.build(map, self);
    }

    public OpencPrevFlagNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpencPrevFlagNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpencPrevFlagNewResponse setBody(OpencPrevFlagNewResponseBody body) {
        this.body = body;
        return this;
    }
    public OpencPrevFlagNewResponseBody getBody() {
        return this.body;
    }

}
