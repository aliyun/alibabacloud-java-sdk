// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ListInstanceServiceConfigHistoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceServiceConfigHistoriesResponseBody body;

    public static ListInstanceServiceConfigHistoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceServiceConfigHistoriesResponse self = new ListInstanceServiceConfigHistoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceServiceConfigHistoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceServiceConfigHistoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceServiceConfigHistoriesResponse setBody(ListInstanceServiceConfigHistoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceServiceConfigHistoriesResponseBody getBody() {
        return this.body;
    }

}
