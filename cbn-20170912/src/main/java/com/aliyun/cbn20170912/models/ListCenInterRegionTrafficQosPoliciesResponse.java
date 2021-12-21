// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListCenInterRegionTrafficQosPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCenInterRegionTrafficQosPoliciesResponseBody body;

    public static ListCenInterRegionTrafficQosPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCenInterRegionTrafficQosPoliciesResponse self = new ListCenInterRegionTrafficQosPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public ListCenInterRegionTrafficQosPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCenInterRegionTrafficQosPoliciesResponse setBody(ListCenInterRegionTrafficQosPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCenInterRegionTrafficQosPoliciesResponseBody getBody() {
        return this.body;
    }

}
