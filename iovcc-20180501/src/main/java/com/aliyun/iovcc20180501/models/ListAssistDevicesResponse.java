// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListAssistDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAssistDevicesResponseBody body;

    public static ListAssistDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAssistDevicesResponse self = new ListAssistDevicesResponse();
        return TeaModel.build(map, self);
    }

    public ListAssistDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAssistDevicesResponse setBody(ListAssistDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAssistDevicesResponseBody getBody() {
        return this.body;
    }

}
