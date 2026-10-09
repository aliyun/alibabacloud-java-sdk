// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListSupabaseDataBackupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSupabaseDataBackupsResponseBody body;

    public static ListSupabaseDataBackupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSupabaseDataBackupsResponse self = new ListSupabaseDataBackupsResponse();
        return TeaModel.build(map, self);
    }

    public ListSupabaseDataBackupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSupabaseDataBackupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSupabaseDataBackupsResponse setBody(ListSupabaseDataBackupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSupabaseDataBackupsResponseBody getBody() {
        return this.body;
    }

}
