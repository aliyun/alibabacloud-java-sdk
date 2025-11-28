// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListBaaSFabricOrganizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListBaaSFabricOrganizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBaaSFabricOrganizationResponse setBody(ListBaaSFabricOrganizationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBaaSFabricOrganizationResponseBody getBody() {
        return this.body;
    }

}
