// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class CountNormalCorpIdentifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CountNormalCorpIdentifyResponseBody body;

    public static CountNormalCorpIdentifyResponse build(java.util.Map<String, ?> map) throws Exception {
        CountNormalCorpIdentifyResponse self = new CountNormalCorpIdentifyResponse();
        return TeaModel.build(map, self);
    }

    public CountNormalCorpIdentifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountNormalCorpIdentifyResponse setBody(CountNormalCorpIdentifyResponseBody body) {
        this.body = body;
        return this;
    }
    public CountNormalCorpIdentifyResponseBody getBody() {
        return this.body;
    }

}
