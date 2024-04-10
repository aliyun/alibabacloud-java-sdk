// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class GetSubscriptionAttributesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSubscriptionAttributesResponseBody body;

    public static GetSubscriptionAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionAttributesResponse self = new GetSubscriptionAttributesResponse();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSubscriptionAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSubscriptionAttributesResponse setBody(GetSubscriptionAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSubscriptionAttributesResponseBody getBody() {
        return this.body;
    }

}
