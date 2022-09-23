// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class UpdateHubClusterFeatureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateHubClusterFeatureResponseBody body;

    public static UpdateHubClusterFeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHubClusterFeatureResponse self = new UpdateHubClusterFeatureResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHubClusterFeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHubClusterFeatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHubClusterFeatureResponse setBody(UpdateHubClusterFeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHubClusterFeatureResponseBody getBody() {
        return this.body;
    }

}
