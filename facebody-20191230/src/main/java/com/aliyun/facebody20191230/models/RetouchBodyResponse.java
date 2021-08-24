// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RetouchBodyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetouchBodyResponseBody body;

    public static RetouchBodyResponse build(java.util.Map<String, ?> map) throws Exception {
        RetouchBodyResponse self = new RetouchBodyResponse();
        return TeaModel.build(map, self);
    }

    public RetouchBodyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetouchBodyResponse setBody(RetouchBodyResponseBody body) {
        this.body = body;
        return this;
    }
    public RetouchBodyResponseBody getBody() {
        return this.body;
    }

}
