// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmdb20190515.models;

import com.aliyun.tea.*;

public class AppGroupUpdateFromCMDBResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AppGroupUpdateFromCMDBResponseBody body;

    public static AppGroupUpdateFromCMDBResponse build(java.util.Map<String, ?> map) throws Exception {
        AppGroupUpdateFromCMDBResponse self = new AppGroupUpdateFromCMDBResponse();
        return TeaModel.build(map, self);
    }

    public AppGroupUpdateFromCMDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AppGroupUpdateFromCMDBResponse setBody(AppGroupUpdateFromCMDBResponseBody body) {
        this.body = body;
        return this;
    }
    public AppGroupUpdateFromCMDBResponseBody getBody() {
        return this.body;
    }

}
