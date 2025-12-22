// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class MultiModalGuardForBase64Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MultiModalGuardForBase64ResponseBody body;

    public static MultiModalGuardForBase64Response build(java.util.Map<String, ?> map) throws Exception {
        MultiModalGuardForBase64Response self = new MultiModalGuardForBase64Response();
        return TeaModel.build(map, self);
    }

    public MultiModalGuardForBase64Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MultiModalGuardForBase64Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MultiModalGuardForBase64Response setBody(MultiModalGuardForBase64ResponseBody body) {
        this.body = body;
        return this;
    }
    public MultiModalGuardForBase64ResponseBody getBody() {
        return this.body;
    }

}
