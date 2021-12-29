// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllPrivacyAlgorithmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAllPrivacyAlgorithmResponseBody body;

    public static ListAllPrivacyAlgorithmResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllPrivacyAlgorithmResponse self = new ListAllPrivacyAlgorithmResponse();
        return TeaModel.build(map, self);
    }

    public ListAllPrivacyAlgorithmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllPrivacyAlgorithmResponse setBody(ListAllPrivacyAlgorithmResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllPrivacyAlgorithmResponseBody getBody() {
        return this.body;
    }

}
