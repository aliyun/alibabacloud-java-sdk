// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddContainerAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddContainerAppResponseBody body;

    public static AddContainerAppResponse build(java.util.Map<String, ?> map) throws Exception {
        AddContainerAppResponse self = new AddContainerAppResponse();
        return TeaModel.build(map, self);
    }

    public AddContainerAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddContainerAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddContainerAppResponse setBody(AddContainerAppResponseBody body) {
        this.body = body;
        return this;
    }
    public AddContainerAppResponseBody getBody() {
        return this.body;
    }

}
