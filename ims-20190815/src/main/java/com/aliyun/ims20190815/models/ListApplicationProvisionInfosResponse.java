// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListApplicationProvisionInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApplicationProvisionInfosResponseBody body;

    public static ListApplicationProvisionInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationProvisionInfosResponse self = new ListApplicationProvisionInfosResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationProvisionInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationProvisionInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationProvisionInfosResponse setBody(ListApplicationProvisionInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationProvisionInfosResponseBody getBody() {
        return this.body;
    }

}
