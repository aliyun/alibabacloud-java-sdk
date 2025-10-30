// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UnbindSubs700Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindSubs700ResponseBody body;

    public static UnbindSubs700Response build(java.util.Map<String, ?> map) throws Exception {
        UnbindSubs700Response self = new UnbindSubs700Response();
        return TeaModel.build(map, self);
    }

    public UnbindSubs700Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindSubs700Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindSubs700Response setBody(UnbindSubs700ResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindSubs700ResponseBody getBody() {
        return this.body;
    }

}
