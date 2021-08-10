// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class GetUserPatentStatisticsStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserPatentStatisticsStatusResponseBody body;

    public static GetUserPatentStatisticsStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserPatentStatisticsStatusResponse self = new GetUserPatentStatisticsStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetUserPatentStatisticsStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserPatentStatisticsStatusResponse setBody(GetUserPatentStatisticsStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserPatentStatisticsStatusResponseBody getBody() {
        return this.body;
    }

}
