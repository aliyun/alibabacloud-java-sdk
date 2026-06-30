// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListModelOperatorApiKeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListModelOperatorApiKeysResponseBody body;

    public static ListModelOperatorApiKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModelOperatorApiKeysResponse self = new ListModelOperatorApiKeysResponse();
        return TeaModel.build(map, self);
    }

    public ListModelOperatorApiKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModelOperatorApiKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListModelOperatorApiKeysResponse setBody(ListModelOperatorApiKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModelOperatorApiKeysResponseBody getBody() {
        return this.body;
    }

}
