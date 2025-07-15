// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveAIStudioResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveAIStudioResponseBody body;

    public static DescribeLiveAIStudioResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveAIStudioResponse self = new DescribeLiveAIStudioResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveAIStudioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveAIStudioResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveAIStudioResponse setBody(DescribeLiveAIStudioResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveAIStudioResponseBody getBody() {
        return this.body;
    }

}
