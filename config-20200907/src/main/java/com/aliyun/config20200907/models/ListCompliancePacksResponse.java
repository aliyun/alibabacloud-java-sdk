// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListCompliancePacksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCompliancePacksResponseBody body;

    public static ListCompliancePacksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCompliancePacksResponse self = new ListCompliancePacksResponse();
        return TeaModel.build(map, self);
    }

    public ListCompliancePacksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCompliancePacksResponse setBody(ListCompliancePacksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCompliancePacksResponseBody getBody() {
        return this.body;
    }

}
