// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkListCdrIbAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClinkListCdrIbAgentResponseBody body;

    public static ClinkListCdrIbAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        ClinkListCdrIbAgentResponse self = new ClinkListCdrIbAgentResponse();
        return TeaModel.build(map, self);
    }

    public ClinkListCdrIbAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClinkListCdrIbAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClinkListCdrIbAgentResponse setBody(ClinkListCdrIbAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public ClinkListCdrIbAgentResponseBody getBody() {
        return this.body;
    }

}
