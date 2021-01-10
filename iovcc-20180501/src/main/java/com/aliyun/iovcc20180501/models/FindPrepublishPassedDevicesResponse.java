// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindPrepublishPassedDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FindPrepublishPassedDevicesResponseBody body;

    public static FindPrepublishPassedDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        FindPrepublishPassedDevicesResponse self = new FindPrepublishPassedDevicesResponse();
        return TeaModel.build(map, self);
    }

    public FindPrepublishPassedDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindPrepublishPassedDevicesResponse setBody(FindPrepublishPassedDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public FindPrepublishPassedDevicesResponseBody getBody() {
        return this.body;
    }

}
