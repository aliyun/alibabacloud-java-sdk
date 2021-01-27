// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBandwidthackagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListBandwidthackagesResponseBody body;

    public static ListBandwidthackagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBandwidthackagesResponse self = new ListBandwidthackagesResponse();
        return TeaModel.build(map, self);
    }

    public ListBandwidthackagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBandwidthackagesResponse setBody(ListBandwidthackagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBandwidthackagesResponseBody getBody() {
        return this.body;
    }

}
