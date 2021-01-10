// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindVersionWhiteDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FindVersionWhiteDevicesResponseBody body;

    public static FindVersionWhiteDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        FindVersionWhiteDevicesResponse self = new FindVersionWhiteDevicesResponse();
        return TeaModel.build(map, self);
    }

    public FindVersionWhiteDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindVersionWhiteDevicesResponse setBody(FindVersionWhiteDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public FindVersionWhiteDevicesResponseBody getBody() {
        return this.body;
    }

}
