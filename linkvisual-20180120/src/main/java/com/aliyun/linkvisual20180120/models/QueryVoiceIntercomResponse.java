// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryVoiceIntercomResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryVoiceIntercomResponseBody body;

    public static QueryVoiceIntercomResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryVoiceIntercomResponse self = new QueryVoiceIntercomResponse();
        return TeaModel.build(map, self);
    }

    public QueryVoiceIntercomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryVoiceIntercomResponse setBody(QueryVoiceIntercomResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryVoiceIntercomResponseBody getBody() {
        return this.body;
    }

}
