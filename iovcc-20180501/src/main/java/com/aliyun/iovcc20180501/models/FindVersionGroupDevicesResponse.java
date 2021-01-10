// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindVersionGroupDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FindVersionGroupDevicesResponseBody body;

    public static FindVersionGroupDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        FindVersionGroupDevicesResponse self = new FindVersionGroupDevicesResponse();
        return TeaModel.build(map, self);
    }

    public FindVersionGroupDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindVersionGroupDevicesResponse setBody(FindVersionGroupDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public FindVersionGroupDevicesResponseBody getBody() {
        return this.body;
    }

}
