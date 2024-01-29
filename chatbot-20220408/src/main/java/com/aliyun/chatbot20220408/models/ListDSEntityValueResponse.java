// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListDSEntityValueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDSEntityValueResponseBody body;

    public static ListDSEntityValueResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDSEntityValueResponse self = new ListDSEntityValueResponse();
        return TeaModel.build(map, self);
    }

    public ListDSEntityValueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDSEntityValueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDSEntityValueResponse setBody(ListDSEntityValueResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDSEntityValueResponseBody getBody() {
        return this.body;
    }

}
