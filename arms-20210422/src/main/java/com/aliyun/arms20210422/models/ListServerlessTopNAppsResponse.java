// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class ListServerlessTopNAppsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServerlessTopNAppsResponseBody body;

    public static ListServerlessTopNAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServerlessTopNAppsResponse self = new ListServerlessTopNAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListServerlessTopNAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServerlessTopNAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServerlessTopNAppsResponse setBody(ListServerlessTopNAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServerlessTopNAppsResponseBody getBody() {
        return this.body;
    }

}
