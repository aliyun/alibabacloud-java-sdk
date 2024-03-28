// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBandwidthackagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListBandwidthackagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBandwidthackagesResponse setBody(ListBandwidthackagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBandwidthackagesResponseBody getBody() {
        return this.body;
    }

}
