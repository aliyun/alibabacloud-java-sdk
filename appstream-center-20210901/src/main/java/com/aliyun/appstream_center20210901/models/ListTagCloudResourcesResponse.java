// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListTagCloudResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTagCloudResourcesResponseBody body;

    public static ListTagCloudResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTagCloudResourcesResponse self = new ListTagCloudResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListTagCloudResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTagCloudResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTagCloudResourcesResponse setBody(ListTagCloudResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTagCloudResourcesResponseBody getBody() {
        return this.body;
    }

}
