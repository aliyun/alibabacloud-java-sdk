// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationSupportedProvisionProtocolTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApplicationSupportedProvisionProtocolTypesResponseBody body;

    public static ListApplicationSupportedProvisionProtocolTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationSupportedProvisionProtocolTypesResponse self = new ListApplicationSupportedProvisionProtocolTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationSupportedProvisionProtocolTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationSupportedProvisionProtocolTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationSupportedProvisionProtocolTypesResponse setBody(ListApplicationSupportedProvisionProtocolTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationSupportedProvisionProtocolTypesResponseBody getBody() {
        return this.body;
    }

}
