// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class UpdateAnycastEipAddressAssociationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAnycastEipAddressAssociationsResponseBody body;

    public static UpdateAnycastEipAddressAssociationsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAnycastEipAddressAssociationsResponse self = new UpdateAnycastEipAddressAssociationsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAnycastEipAddressAssociationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAnycastEipAddressAssociationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAnycastEipAddressAssociationsResponse setBody(UpdateAnycastEipAddressAssociationsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAnycastEipAddressAssociationsResponseBody getBody() {
        return this.body;
    }

}
