// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ConvertFlowDSLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConvertFlowDSLResult body;

    public static ConvertFlowDSLResponse build(java.util.Map<String, ?> map) throws Exception {
        ConvertFlowDSLResponse self = new ConvertFlowDSLResponse();
        return TeaModel.build(map, self);
    }

    public ConvertFlowDSLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConvertFlowDSLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConvertFlowDSLResponse setBody(ConvertFlowDSLResult body) {
        this.body = body;
        return this;
    }
    public ConvertFlowDSLResult getBody() {
        return this.body;
    }

}
