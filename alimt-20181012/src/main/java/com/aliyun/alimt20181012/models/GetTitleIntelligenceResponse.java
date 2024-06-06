// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetTitleIntelligenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTitleIntelligenceResponseBody body;

    public static GetTitleIntelligenceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTitleIntelligenceResponse self = new GetTitleIntelligenceResponse();
        return TeaModel.build(map, self);
    }

    public GetTitleIntelligenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTitleIntelligenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTitleIntelligenceResponse setBody(GetTitleIntelligenceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTitleIntelligenceResponseBody getBody() {
        return this.body;
    }

}
