// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddTagToFlinkClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddTagToFlinkClusterResponseBody body;

    public static AddTagToFlinkClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTagToFlinkClusterResponse self = new AddTagToFlinkClusterResponse();
        return TeaModel.build(map, self);
    }

    public AddTagToFlinkClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTagToFlinkClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddTagToFlinkClusterResponse setBody(AddTagToFlinkClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTagToFlinkClusterResponseBody getBody() {
        return this.body;
    }

}
