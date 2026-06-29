// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class ListSubscriptionSharedPackagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSubscriptionSharedPackagesResponseBody body;

    public static ListSubscriptionSharedPackagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionSharedPackagesResponse self = new ListSubscriptionSharedPackagesResponse();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionSharedPackagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSubscriptionSharedPackagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSubscriptionSharedPackagesResponse setBody(ListSubscriptionSharedPackagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSubscriptionSharedPackagesResponseBody getBody() {
        return this.body;
    }

}
