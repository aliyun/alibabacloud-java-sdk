// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListLibrariesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLibrariesResponseBody body;

    public static ListLibrariesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLibrariesResponse self = new ListLibrariesResponse();
        return TeaModel.build(map, self);
    }

    public ListLibrariesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLibrariesResponse setBody(ListLibrariesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLibrariesResponseBody getBody() {
        return this.body;
    }

}
