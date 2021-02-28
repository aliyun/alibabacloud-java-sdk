// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class GetBotDsStatDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBotDsStatDataResponseBody body;

    public static GetBotDsStatDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBotDsStatDataResponse self = new GetBotDsStatDataResponse();
        return TeaModel.build(map, self);
    }

    public GetBotDsStatDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBotDsStatDataResponse setBody(GetBotDsStatDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBotDsStatDataResponseBody getBody() {
        return this.body;
    }

}
