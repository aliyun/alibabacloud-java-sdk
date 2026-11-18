// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListCloudAccountResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCloudAccountResourcesResponseBody body;

    public static ListCloudAccountResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAccountResourcesResponse self = new ListCloudAccountResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListCloudAccountResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCloudAccountResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCloudAccountResourcesResponse setBody(ListCloudAccountResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCloudAccountResourcesResponseBody getBody() {
        return this.body;
    }

}
