// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindVersionBlackDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FindVersionBlackDevicesResponseBody body;

    public static FindVersionBlackDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        FindVersionBlackDevicesResponse self = new FindVersionBlackDevicesResponse();
        return TeaModel.build(map, self);
    }

    public FindVersionBlackDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindVersionBlackDevicesResponse setBody(FindVersionBlackDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public FindVersionBlackDevicesResponseBody getBody() {
        return this.body;
    }

}
