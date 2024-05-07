// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListVirtualMFADevicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVirtualMFADevicesResponseBody body;

    public static ListVirtualMFADevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVirtualMFADevicesResponse self = new ListVirtualMFADevicesResponse();
        return TeaModel.build(map, self);
    }

    public ListVirtualMFADevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVirtualMFADevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVirtualMFADevicesResponse setBody(ListVirtualMFADevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVirtualMFADevicesResponseBody getBody() {
        return this.body;
    }

}
