// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class RemoveVirusScanAdditionalListsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveVirusScanAdditionalListsResponseBody body;

    public static RemoveVirusScanAdditionalListsResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveVirusScanAdditionalListsResponse self = new RemoveVirusScanAdditionalListsResponse();
        return TeaModel.build(map, self);
    }

    public RemoveVirusScanAdditionalListsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveVirusScanAdditionalListsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveVirusScanAdditionalListsResponse setBody(RemoveVirusScanAdditionalListsResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveVirusScanAdditionalListsResponseBody getBody() {
        return this.body;
    }

}
