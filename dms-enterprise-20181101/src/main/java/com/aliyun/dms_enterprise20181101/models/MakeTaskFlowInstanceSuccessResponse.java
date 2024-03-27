// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class MakeTaskFlowInstanceSuccessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MakeTaskFlowInstanceSuccessResponseBody body;

    public static MakeTaskFlowInstanceSuccessResponse build(java.util.Map<String, ?> map) throws Exception {
        MakeTaskFlowInstanceSuccessResponse self = new MakeTaskFlowInstanceSuccessResponse();
        return TeaModel.build(map, self);
    }

    public MakeTaskFlowInstanceSuccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MakeTaskFlowInstanceSuccessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MakeTaskFlowInstanceSuccessResponse setBody(MakeTaskFlowInstanceSuccessResponseBody body) {
        this.body = body;
        return this;
    }
    public MakeTaskFlowInstanceSuccessResponseBody getBody() {
        return this.body;
    }

}
