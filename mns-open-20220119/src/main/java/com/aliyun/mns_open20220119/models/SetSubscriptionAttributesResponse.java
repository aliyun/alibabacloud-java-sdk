// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class SetSubscriptionAttributesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetSubscriptionAttributesResponseBody body;

    public static SetSubscriptionAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        SetSubscriptionAttributesResponse self = new SetSubscriptionAttributesResponse();
        return TeaModel.build(map, self);
    }

    public SetSubscriptionAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetSubscriptionAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetSubscriptionAttributesResponse setBody(SetSubscriptionAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public SetSubscriptionAttributesResponseBody getBody() {
        return this.body;
    }

}
