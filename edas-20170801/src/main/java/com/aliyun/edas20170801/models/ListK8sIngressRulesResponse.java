// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListK8sIngressRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListK8sIngressRulesResponseBody body;

    public static ListK8sIngressRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListK8sIngressRulesResponse self = new ListK8sIngressRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListK8sIngressRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListK8sIngressRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListK8sIngressRulesResponse setBody(ListK8sIngressRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListK8sIngressRulesResponseBody getBody() {
        return this.body;
    }

}
