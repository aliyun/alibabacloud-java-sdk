// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDataServiceMyApiPermissionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataServiceMyApiPermissionsResponseBody body;

    public static ListDataServiceMyApiPermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceMyApiPermissionsResponse self = new ListDataServiceMyApiPermissionsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataServiceMyApiPermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataServiceMyApiPermissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataServiceMyApiPermissionsResponse setBody(ListDataServiceMyApiPermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataServiceMyApiPermissionsResponseBody getBody() {
        return this.body;
    }

}
