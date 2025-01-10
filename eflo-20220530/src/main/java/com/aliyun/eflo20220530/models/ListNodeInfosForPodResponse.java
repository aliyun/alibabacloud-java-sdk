// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListNodeInfosForPodResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNodeInfosForPodResponseBody body;

    public static ListNodeInfosForPodResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodeInfosForPodResponse self = new ListNodeInfosForPodResponse();
        return TeaModel.build(map, self);
    }

    public ListNodeInfosForPodResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNodeInfosForPodResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNodeInfosForPodResponse setBody(ListNodeInfosForPodResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNodeInfosForPodResponseBody getBody() {
        return this.body;
    }

}
