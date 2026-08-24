// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class AddVirusScanAdditionalListsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddVirusScanAdditionalListsResponseBody body;

    public static AddVirusScanAdditionalListsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddVirusScanAdditionalListsResponse self = new AddVirusScanAdditionalListsResponse();
        return TeaModel.build(map, self);
    }

    public AddVirusScanAdditionalListsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddVirusScanAdditionalListsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddVirusScanAdditionalListsResponse setBody(AddVirusScanAdditionalListsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddVirusScanAdditionalListsResponseBody getBody() {
        return this.body;
    }

}
