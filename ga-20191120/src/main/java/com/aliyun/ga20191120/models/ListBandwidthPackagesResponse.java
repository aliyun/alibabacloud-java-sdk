// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBandwidthPackagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListBandwidthPackagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBandwidthPackagesResponse setBody(ListBandwidthPackagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBandwidthPackagesResponseBody getBody() {
        return this.body;
    }

}
