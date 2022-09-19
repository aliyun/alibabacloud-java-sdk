// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetIntervalLimitOfSLAResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetIntervalLimitOfSLAResponseBody body;

    public static GetIntervalLimitOfSLAResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIntervalLimitOfSLAResponse self = new GetIntervalLimitOfSLAResponse();
        return TeaModel.build(map, self);
    }

    public GetIntervalLimitOfSLAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIntervalLimitOfSLAResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIntervalLimitOfSLAResponse setBody(GetIntervalLimitOfSLAResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIntervalLimitOfSLAResponseBody getBody() {
        return this.body;
    }

}
