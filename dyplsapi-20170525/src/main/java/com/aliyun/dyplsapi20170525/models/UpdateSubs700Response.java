// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateSubs700Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSubs700ResponseBody body;

    public static UpdateSubs700Response build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubs700Response self = new UpdateSubs700Response();
        return TeaModel.build(map, self);
    }

    public UpdateSubs700Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSubs700Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSubs700Response setBody(UpdateSubs700ResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSubs700ResponseBody getBody() {
        return this.body;
    }

}
