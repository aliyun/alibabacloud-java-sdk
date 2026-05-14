// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkAgentStatusDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClinkAgentStatusDetailResponseBody body;

    public static ClinkAgentStatusDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ClinkAgentStatusDetailResponse self = new ClinkAgentStatusDetailResponse();
        return TeaModel.build(map, self);
    }

    public ClinkAgentStatusDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClinkAgentStatusDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClinkAgentStatusDetailResponse setBody(ClinkAgentStatusDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public ClinkAgentStatusDetailResponseBody getBody() {
        return this.body;
    }

}
