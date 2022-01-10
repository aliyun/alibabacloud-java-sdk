// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmdb20190515.models;

import com.aliyun.tea.*;

public class AppGroupAddToCMDBResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AppGroupAddToCMDBResponseBody body;

    public static AppGroupAddToCMDBResponse build(java.util.Map<String, ?> map) throws Exception {
        AppGroupAddToCMDBResponse self = new AppGroupAddToCMDBResponse();
        return TeaModel.build(map, self);
    }

    public AppGroupAddToCMDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AppGroupAddToCMDBResponse setBody(AppGroupAddToCMDBResponseBody body) {
        this.body = body;
        return this;
    }
    public AppGroupAddToCMDBResponseBody getBody() {
        return this.body;
    }

}
