// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetAntiVirusRealTimeDefenceStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAntiVirusRealTimeDefenceStrategyResponseBody body;

    public static GetAntiVirusRealTimeDefenceStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAntiVirusRealTimeDefenceStrategyResponse self = new GetAntiVirusRealTimeDefenceStrategyResponse();
        return TeaModel.build(map, self);
    }

    public GetAntiVirusRealTimeDefenceStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAntiVirusRealTimeDefenceStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAntiVirusRealTimeDefenceStrategyResponse setBody(GetAntiVirusRealTimeDefenceStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAntiVirusRealTimeDefenceStrategyResponseBody getBody() {
        return this.body;
    }

}
