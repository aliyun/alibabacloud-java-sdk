// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class ListEmrHiveTablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEmrHiveTablesResponseBody body;

    public static ListEmrHiveTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEmrHiveTablesResponse self = new ListEmrHiveTablesResponse();
        return TeaModel.build(map, self);
    }

    public ListEmrHiveTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEmrHiveTablesResponse setBody(ListEmrHiveTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEmrHiveTablesResponseBody getBody() {
        return this.body;
    }

}
