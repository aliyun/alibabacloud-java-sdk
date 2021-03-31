// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetTopicInfluenceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetTopicInfluenceResponse setBody(GetTopicInfluenceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTopicInfluenceResponseBody getBody() {
        return this.body;
    }

}
