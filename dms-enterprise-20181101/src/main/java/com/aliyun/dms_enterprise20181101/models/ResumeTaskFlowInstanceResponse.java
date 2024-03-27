// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ResumeTaskFlowInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResumeTaskFlowInstanceResponseBody body;

    public static ResumeTaskFlowInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeTaskFlowInstanceResponse self = new ResumeTaskFlowInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ResumeTaskFlowInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeTaskFlowInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumeTaskFlowInstanceResponse setBody(ResumeTaskFlowInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeTaskFlowInstanceResponseBody getBody() {
        return this.body;
    }

}
