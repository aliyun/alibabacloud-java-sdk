// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListDeviceGroupAuthorizedBizChainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListDeviceGroupAuthorizedBizChainResponse setBody(ListDeviceGroupAuthorizedBizChainResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeviceGroupAuthorizedBizChainResponseBody getBody() {
        return this.body;
    }

}
