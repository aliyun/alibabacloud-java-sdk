// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetDepartmentalLatitudeAgentStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDepartmentalLatitudeAgentStatusResponseBody body;

    public static GetDepartmentalLatitudeAgentStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDepartmentalLatitudeAgentStatusResponse self = new GetDepartmentalLatitudeAgentStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetDepartmentalLatitudeAgentStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDepartmentalLatitudeAgentStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDepartmentalLatitudeAgentStatusResponse setBody(GetDepartmentalLatitudeAgentStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDepartmentalLatitudeAgentStatusResponseBody getBody() {
        return this.body;
    }

}
