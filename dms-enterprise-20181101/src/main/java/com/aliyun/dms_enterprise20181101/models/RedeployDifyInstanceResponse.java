// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RedeployDifyInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RedeployDifyInstanceResponseBody body;

    public static RedeployDifyInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RedeployDifyInstanceResponse self = new RedeployDifyInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RedeployDifyInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RedeployDifyInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RedeployDifyInstanceResponse setBody(RedeployDifyInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RedeployDifyInstanceResponseBody getBody() {
        return this.body;
    }

}
