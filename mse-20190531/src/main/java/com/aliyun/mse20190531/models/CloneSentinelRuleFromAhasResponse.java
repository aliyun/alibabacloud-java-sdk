// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CloneSentinelRuleFromAhasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloneSentinelRuleFromAhasResponseBody body;

    public static CloneSentinelRuleFromAhasResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneSentinelRuleFromAhasResponse self = new CloneSentinelRuleFromAhasResponse();
        return TeaModel.build(map, self);
    }

    public CloneSentinelRuleFromAhasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloneSentinelRuleFromAhasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloneSentinelRuleFromAhasResponse setBody(CloneSentinelRuleFromAhasResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneSentinelRuleFromAhasResponseBody getBody() {
        return this.body;
    }

}
