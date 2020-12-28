// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StartGWSInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartGWSInstanceResponseBody body;

    public static StartGWSInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartGWSInstanceResponse self = new StartGWSInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StartGWSInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartGWSInstanceResponse setBody(StartGWSInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartGWSInstanceResponseBody getBody() {
        return this.body;
    }

}
