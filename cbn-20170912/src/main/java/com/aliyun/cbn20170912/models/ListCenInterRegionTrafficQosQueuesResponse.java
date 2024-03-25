// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListCenInterRegionTrafficQosQueuesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCenInterRegionTrafficQosQueuesResponseBody body;

    public static ListCenInterRegionTrafficQosQueuesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCenInterRegionTrafficQosQueuesResponse self = new ListCenInterRegionTrafficQosQueuesResponse();
        return TeaModel.build(map, self);
    }

    public ListCenInterRegionTrafficQosQueuesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCenInterRegionTrafficQosQueuesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCenInterRegionTrafficQosQueuesResponse setBody(ListCenInterRegionTrafficQosQueuesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCenInterRegionTrafficQosQueuesResponseBody getBody() {
        return this.body;
    }

}
