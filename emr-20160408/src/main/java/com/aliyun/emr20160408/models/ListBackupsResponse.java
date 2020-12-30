// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListBackupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListBackupsResponseBody body;

    public static ListBackupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBackupsResponse self = new ListBackupsResponse();
        return TeaModel.build(map, self);
    }

    public ListBackupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBackupsResponse setBody(ListBackupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBackupsResponseBody getBody() {
        return this.body;
    }

}
