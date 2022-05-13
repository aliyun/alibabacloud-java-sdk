// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListClusterDetailFeatureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListClusterDetailFeatureResponseBody body;

    public static ListClusterDetailFeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterDetailFeatureResponse self = new ListClusterDetailFeatureResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterDetailFeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterDetailFeatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClusterDetailFeatureResponse setBody(ListClusterDetailFeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterDetailFeatureResponseBody getBody() {
        return this.body;
    }

}
