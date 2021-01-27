// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBandwidthPackagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListBandwidthPackagesResponseBody body;

    public static ListBandwidthPackagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBandwidthPackagesResponse self = new ListBandwidthPackagesResponse();
        return TeaModel.build(map, self);
    }

    public ListBandwidthPackagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBandwidthPackagesResponse setBody(ListBandwidthPackagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBandwidthPackagesResponseBody getBody() {
        return this.body;
    }

}
