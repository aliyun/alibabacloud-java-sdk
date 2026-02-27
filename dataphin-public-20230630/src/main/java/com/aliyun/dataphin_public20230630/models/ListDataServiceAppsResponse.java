// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDataServiceAppsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataServiceAppsResponseBody body;

    public static ListDataServiceAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceAppsResponse self = new ListDataServiceAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataServiceAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataServiceAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataServiceAppsResponse setBody(ListDataServiceAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataServiceAppsResponseBody getBody() {
        return this.body;
    }

}
