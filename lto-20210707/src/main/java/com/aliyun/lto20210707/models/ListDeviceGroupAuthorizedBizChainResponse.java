// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListDeviceGroupAuthorizedBizChainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDeviceGroupAuthorizedBizChainResponseBody body;

    public static ListDeviceGroupAuthorizedBizChainResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceGroupAuthorizedBizChainResponse self = new ListDeviceGroupAuthorizedBizChainResponse();
        return TeaModel.build(map, self);
    }

    public ListDeviceGroupAuthorizedBizChainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeviceGroupAuthorizedBizChainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDeviceGroupAuthorizedBizChainResponse setBody(ListDeviceGroupAuthorizedBizChainResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeviceGroupAuthorizedBizChainResponseBody getBody() {
        return this.body;
    }

}
