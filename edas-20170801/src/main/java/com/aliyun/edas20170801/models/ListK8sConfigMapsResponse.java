// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListK8sConfigMapsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListK8sConfigMapsResponseBody body;

    public static ListK8sConfigMapsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListK8sConfigMapsResponse self = new ListK8sConfigMapsResponse();
        return TeaModel.build(map, self);
    }

    public ListK8sConfigMapsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListK8sConfigMapsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListK8sConfigMapsResponse setBody(ListK8sConfigMapsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListK8sConfigMapsResponseBody getBody() {
        return this.body;
    }

}
