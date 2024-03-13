// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCloudResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCloudResourcesResponseBody body;

    public static ListCloudResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCloudResourcesResponse self = new ListCloudResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListCloudResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCloudResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCloudResourcesResponse setBody(ListCloudResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCloudResourcesResponseBody getBody() {
        return this.body;
    }

}
