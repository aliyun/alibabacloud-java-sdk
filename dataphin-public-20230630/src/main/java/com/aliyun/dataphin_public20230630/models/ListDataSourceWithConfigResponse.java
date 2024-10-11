// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDataSourceWithConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataSourceWithConfigResponseBody body;

    public static ListDataSourceWithConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceWithConfigResponse self = new ListDataSourceWithConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListDataSourceWithConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataSourceWithConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataSourceWithConfigResponse setBody(ListDataSourceWithConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataSourceWithConfigResponseBody getBody() {
        return this.body;
    }

}
