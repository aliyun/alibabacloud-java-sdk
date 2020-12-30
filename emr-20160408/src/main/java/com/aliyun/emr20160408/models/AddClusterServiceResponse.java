// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class AddClusterServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddClusterServiceResponseBody body;

    public static AddClusterServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddClusterServiceResponse self = new AddClusterServiceResponse();
        return TeaModel.build(map, self);
    }

    public AddClusterServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddClusterServiceResponse setBody(AddClusterServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddClusterServiceResponseBody getBody() {
        return this.body;
    }

}
