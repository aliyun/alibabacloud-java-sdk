// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListVirusScanAdditionalListsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVirusScanAdditionalListsResponseBody body;

    public static ListVirusScanAdditionalListsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVirusScanAdditionalListsResponse self = new ListVirusScanAdditionalListsResponse();
        return TeaModel.build(map, self);
    }

    public ListVirusScanAdditionalListsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVirusScanAdditionalListsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVirusScanAdditionalListsResponse setBody(ListVirusScanAdditionalListsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVirusScanAdditionalListsResponseBody getBody() {
        return this.body;
    }

}
