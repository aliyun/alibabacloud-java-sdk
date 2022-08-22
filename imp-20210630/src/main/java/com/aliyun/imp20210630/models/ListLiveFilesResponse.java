// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListLiveFilesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListLiveFilesResponseBody body;

    public static ListLiveFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLiveFilesResponse self = new ListLiveFilesResponse();
        return TeaModel.build(map, self);
    }

    public ListLiveFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLiveFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLiveFilesResponse setBody(ListLiveFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLiveFilesResponseBody getBody() {
        return this.body;
    }

}
