// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDataServiceMyAppPermissionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataServiceMyAppPermissionsResponseBody body;

    public static ListDataServiceMyAppPermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceMyAppPermissionsResponse self = new ListDataServiceMyAppPermissionsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataServiceMyAppPermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataServiceMyAppPermissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataServiceMyAppPermissionsResponse setBody(ListDataServiceMyAppPermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataServiceMyAppPermissionsResponseBody getBody() {
        return this.body;
    }

}
