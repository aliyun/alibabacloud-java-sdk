// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListBaaSFabricOrganizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListBaaSFabricOrganizationResponseBody body;

    public static ListBaaSFabricOrganizationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBaaSFabricOrganizationResponse self = new ListBaaSFabricOrganizationResponse();
        return TeaModel.build(map, self);
    }

    public ListBaaSFabricOrganizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBaaSFabricOrganizationResponse setBody(ListBaaSFabricOrganizationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBaaSFabricOrganizationResponseBody getBody() {
        return this.body;
    }

}
