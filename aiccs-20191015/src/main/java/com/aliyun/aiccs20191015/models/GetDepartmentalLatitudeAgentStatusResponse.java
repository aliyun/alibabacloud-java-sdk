// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetDepartmentalLatitudeAgentStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetDepartmentalLatitudeAgentStatusResponse setBody(GetDepartmentalLatitudeAgentStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDepartmentalLatitudeAgentStatusResponseBody getBody() {
        return this.body;
    }

}
