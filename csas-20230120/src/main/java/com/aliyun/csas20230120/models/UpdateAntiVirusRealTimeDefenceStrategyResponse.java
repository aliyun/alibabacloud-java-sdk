// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateAntiVirusRealTimeDefenceStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAntiVirusRealTimeDefenceStrategyResponseBody body;

    public static UpdateAntiVirusRealTimeDefenceStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntiVirusRealTimeDefenceStrategyResponse self = new UpdateAntiVirusRealTimeDefenceStrategyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAntiVirusRealTimeDefenceStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAntiVirusRealTimeDefenceStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAntiVirusRealTimeDefenceStrategyResponse setBody(UpdateAntiVirusRealTimeDefenceStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAntiVirusRealTimeDefenceStrategyResponseBody getBody() {
        return this.body;
    }

}
