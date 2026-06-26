// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ResumeSaasServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResumeSaasServiceResponseBody body;

    public static ResumeSaasServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeSaasServiceResponse self = new ResumeSaasServiceResponse();
        return TeaModel.build(map, self);
    }

    public ResumeSaasServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeSaasServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumeSaasServiceResponse setBody(ResumeSaasServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeSaasServiceResponseBody getBody() {
        return this.body;
    }

}
