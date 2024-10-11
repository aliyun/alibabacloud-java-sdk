// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ResumePhysicalNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResumePhysicalNodeResponseBody body;

    public static ResumePhysicalNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumePhysicalNodeResponse self = new ResumePhysicalNodeResponse();
        return TeaModel.build(map, self);
    }

    public ResumePhysicalNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumePhysicalNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumePhysicalNodeResponse setBody(ResumePhysicalNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumePhysicalNodeResponseBody getBody() {
        return this.body;
    }

}
