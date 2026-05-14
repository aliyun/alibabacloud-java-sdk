// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkListIvrsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClinkListIvrsResponseBody body;

    public static ClinkListIvrsResponse build(java.util.Map<String, ?> map) throws Exception {
        ClinkListIvrsResponse self = new ClinkListIvrsResponse();
        return TeaModel.build(map, self);
    }

    public ClinkListIvrsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClinkListIvrsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClinkListIvrsResponse setBody(ClinkListIvrsResponseBody body) {
        this.body = body;
        return this;
    }
    public ClinkListIvrsResponseBody getBody() {
        return this.body;
    }

}
