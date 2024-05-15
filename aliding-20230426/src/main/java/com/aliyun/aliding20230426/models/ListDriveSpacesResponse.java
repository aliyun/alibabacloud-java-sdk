// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListDriveSpacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDriveSpacesResponseBody body;

    public static ListDriveSpacesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDriveSpacesResponse self = new ListDriveSpacesResponse();
        return TeaModel.build(map, self);
    }

    public ListDriveSpacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDriveSpacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDriveSpacesResponse setBody(ListDriveSpacesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDriveSpacesResponseBody getBody() {
        return this.body;
    }

}
