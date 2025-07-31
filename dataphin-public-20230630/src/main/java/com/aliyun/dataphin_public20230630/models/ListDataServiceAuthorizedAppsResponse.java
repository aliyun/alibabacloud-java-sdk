// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDataServiceAuthorizedAppsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataServiceAuthorizedAppsResponseBody body;

    public static ListDataServiceAuthorizedAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceAuthorizedAppsResponse self = new ListDataServiceAuthorizedAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataServiceAuthorizedAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataServiceAuthorizedAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataServiceAuthorizedAppsResponse setBody(ListDataServiceAuthorizedAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataServiceAuthorizedAppsResponseBody getBody() {
        return this.body;
    }

}
