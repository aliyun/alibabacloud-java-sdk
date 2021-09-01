// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class ListNvrChannelDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListNvrChannelDevicesResponseBody body;

    public static ListNvrChannelDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNvrChannelDevicesResponse self = new ListNvrChannelDevicesResponse();
        return TeaModel.build(map, self);
    }

    public ListNvrChannelDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNvrChannelDevicesResponse setBody(ListNvrChannelDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNvrChannelDevicesResponseBody getBody() {
        return this.body;
    }

}
