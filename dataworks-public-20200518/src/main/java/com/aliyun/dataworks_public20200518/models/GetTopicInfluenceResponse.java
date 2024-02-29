// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetTopicInfluenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTopicInfluenceResponseBody body;

    public static GetTopicInfluenceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTopicInfluenceResponse self = new GetTopicInfluenceResponse();
        return TeaModel.build(map, self);
    }

    public GetTopicInfluenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTopicInfluenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTopicInfluenceResponse setBody(GetTopicInfluenceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTopicInfluenceResponseBody getBody() {
        return this.body;
    }

}
