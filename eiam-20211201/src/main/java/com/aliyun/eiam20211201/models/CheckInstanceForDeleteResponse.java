// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CheckInstanceForDeleteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckInstanceForDeleteResponseBody body;

    public static CheckInstanceForDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckInstanceForDeleteResponse self = new CheckInstanceForDeleteResponse();
        return TeaModel.build(map, self);
    }

    public CheckInstanceForDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckInstanceForDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckInstanceForDeleteResponse setBody(CheckInstanceForDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckInstanceForDeleteResponseBody getBody() {
        return this.body;
    }

}
