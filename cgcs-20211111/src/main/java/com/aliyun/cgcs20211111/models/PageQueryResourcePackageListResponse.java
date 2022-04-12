// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class PageQueryResourcePackageListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PageQueryResourcePackageListResponseBody body;

    public static PageQueryResourcePackageListResponse build(java.util.Map<String, ?> map) throws Exception {
        PageQueryResourcePackageListResponse self = new PageQueryResourcePackageListResponse();
        return TeaModel.build(map, self);
    }

    public PageQueryResourcePackageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PageQueryResourcePackageListResponse setBody(PageQueryResourcePackageListResponseBody body) {
        this.body = body;
        return this;
    }
    public PageQueryResourcePackageListResponseBody getBody() {
        return this.body;
    }

}
