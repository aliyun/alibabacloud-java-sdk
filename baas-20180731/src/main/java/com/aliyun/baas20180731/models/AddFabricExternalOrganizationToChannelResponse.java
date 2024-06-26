// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class AddFabricExternalOrganizationToChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddFabricExternalOrganizationToChannelResponseBody body;

    public static AddFabricExternalOrganizationToChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFabricExternalOrganizationToChannelResponse self = new AddFabricExternalOrganizationToChannelResponse();
        return TeaModel.build(map, self);
    }

    public AddFabricExternalOrganizationToChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddFabricExternalOrganizationToChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddFabricExternalOrganizationToChannelResponse setBody(AddFabricExternalOrganizationToChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFabricExternalOrganizationToChannelResponseBody getBody() {
        return this.body;
    }

}
