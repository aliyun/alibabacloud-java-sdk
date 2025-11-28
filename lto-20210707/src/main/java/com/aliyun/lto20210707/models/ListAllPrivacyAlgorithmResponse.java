// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllPrivacyAlgorithmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListAllPrivacyAlgorithmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAllPrivacyAlgorithmResponse setBody(ListAllPrivacyAlgorithmResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllPrivacyAlgorithmResponseBody getBody() {
        return this.body;
    }

}
