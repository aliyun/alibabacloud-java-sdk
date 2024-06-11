// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810.models;

import com.aliyun.tea.*;

public class ListUnbeianIpCheckTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUnbeianIpCheckTypeResponseBody body;

    public static ListUnbeianIpCheckTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUnbeianIpCheckTypeResponse self = new ListUnbeianIpCheckTypeResponse();
        return TeaModel.build(map, self);
    }

    public ListUnbeianIpCheckTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUnbeianIpCheckTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUnbeianIpCheckTypeResponse setBody(ListUnbeianIpCheckTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUnbeianIpCheckTypeResponseBody getBody() {
        return this.body;
    }

}
