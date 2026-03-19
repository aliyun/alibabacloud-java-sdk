// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class BrowseFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BrowseFilesResponseBody body;

    public static BrowseFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        BrowseFilesResponse self = new BrowseFilesResponse();
        return TeaModel.build(map, self);
    }

    public BrowseFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BrowseFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BrowseFilesResponse setBody(BrowseFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public BrowseFilesResponseBody getBody() {
        return this.body;
    }

}
