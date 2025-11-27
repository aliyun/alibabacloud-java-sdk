// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListIntegrationPolicyCollectorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIntegrationPolicyCollectorsResponseBody body;

    public static ListIntegrationPolicyCollectorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationPolicyCollectorsResponse self = new ListIntegrationPolicyCollectorsResponse();
        return TeaModel.build(map, self);
    }

    public ListIntegrationPolicyCollectorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIntegrationPolicyCollectorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIntegrationPolicyCollectorsResponse setBody(ListIntegrationPolicyCollectorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIntegrationPolicyCollectorsResponseBody getBody() {
        return this.body;
    }

}
