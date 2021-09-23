// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ListRecycledDirectoriesAndFilesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRecycledDirectoriesAndFilesResponseBody body;

    public static ListRecycledDirectoriesAndFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRecycledDirectoriesAndFilesResponse self = new ListRecycledDirectoriesAndFilesResponse();
        return TeaModel.build(map, self);
    }

    public ListRecycledDirectoriesAndFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRecycledDirectoriesAndFilesResponse setBody(ListRecycledDirectoriesAndFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRecycledDirectoriesAndFilesResponseBody getBody() {
        return this.body;
    }

}
