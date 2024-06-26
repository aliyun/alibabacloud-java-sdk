// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class AddFabricOrganizationToExternalChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddFabricOrganizationToExternalChannelResponseBody body;

    public static AddFabricOrganizationToExternalChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFabricOrganizationToExternalChannelResponse self = new AddFabricOrganizationToExternalChannelResponse();
        return TeaModel.build(map, self);
    }

    public AddFabricOrganizationToExternalChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddFabricOrganizationToExternalChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddFabricOrganizationToExternalChannelResponse setBody(AddFabricOrganizationToExternalChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFabricOrganizationToExternalChannelResponseBody getBody() {
        return this.body;
    }

}
