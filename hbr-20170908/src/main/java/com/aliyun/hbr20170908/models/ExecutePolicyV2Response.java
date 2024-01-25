// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class ExecutePolicyV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecutePolicyV2ResponseBody body;

    public static ExecutePolicyV2Response build(java.util.Map<String, ?> map) throws Exception {
        ExecutePolicyV2Response self = new ExecutePolicyV2Response();
        return TeaModel.build(map, self);
    }

    public ExecutePolicyV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecutePolicyV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecutePolicyV2Response setBody(ExecutePolicyV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecutePolicyV2ResponseBody getBody() {
        return this.body;
    }

}
