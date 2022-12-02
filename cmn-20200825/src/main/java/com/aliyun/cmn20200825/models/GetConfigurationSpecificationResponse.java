// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetConfigurationSpecificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetConfigurationSpecificationResponseBody body;

    public static GetConfigurationSpecificationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConfigurationSpecificationResponse self = new GetConfigurationSpecificationResponse();
        return TeaModel.build(map, self);
    }

    public GetConfigurationSpecificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConfigurationSpecificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConfigurationSpecificationResponse setBody(GetConfigurationSpecificationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConfigurationSpecificationResponseBody getBody() {
        return this.body;
    }

}
