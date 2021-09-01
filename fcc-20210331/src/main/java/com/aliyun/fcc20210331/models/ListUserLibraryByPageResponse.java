// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class ListUserLibraryByPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserLibraryByPageResponseBody body;

    public static ListUserLibraryByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserLibraryByPageResponse self = new ListUserLibraryByPageResponse();
        return TeaModel.build(map, self);
    }

    public ListUserLibraryByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserLibraryByPageResponse setBody(ListUserLibraryByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserLibraryByPageResponseBody getBody() {
        return this.body;
    }

}
