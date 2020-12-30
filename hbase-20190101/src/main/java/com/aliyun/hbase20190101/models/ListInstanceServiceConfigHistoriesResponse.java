// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ListInstanceServiceConfigHistoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListInstanceServiceConfigHistoriesResponse setBody(ListInstanceServiceConfigHistoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceServiceConfigHistoriesResponseBody getBody() {
        return this.body;
    }

}
