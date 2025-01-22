// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLivePackageOriginEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLivePackageOriginEndpointsResponseBody body;

    public static ListLivePackageOriginEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLivePackageOriginEndpointsResponse self = new ListLivePackageOriginEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public ListLivePackageOriginEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLivePackageOriginEndpointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLivePackageOriginEndpointsResponse setBody(ListLivePackageOriginEndpointsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLivePackageOriginEndpointsResponseBody getBody() {
        return this.body;
    }

}
