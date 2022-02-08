// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class ListEmrHiveDatabasesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEmrHiveDatabasesResponseBody body;

    public static ListEmrHiveDatabasesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEmrHiveDatabasesResponse self = new ListEmrHiveDatabasesResponse();
        return TeaModel.build(map, self);
    }

    public ListEmrHiveDatabasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEmrHiveDatabasesResponse setBody(ListEmrHiveDatabasesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEmrHiveDatabasesResponseBody getBody() {
        return this.body;
    }

}
