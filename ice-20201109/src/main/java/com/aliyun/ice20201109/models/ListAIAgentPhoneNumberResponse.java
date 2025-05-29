// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAIAgentPhoneNumberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAIAgentPhoneNumberResponseBody body;

    public static ListAIAgentPhoneNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAIAgentPhoneNumberResponse self = new ListAIAgentPhoneNumberResponse();
        return TeaModel.build(map, self);
    }

    public ListAIAgentPhoneNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAIAgentPhoneNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAIAgentPhoneNumberResponse setBody(ListAIAgentPhoneNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAIAgentPhoneNumberResponseBody getBody() {
        return this.body;
    }

}
