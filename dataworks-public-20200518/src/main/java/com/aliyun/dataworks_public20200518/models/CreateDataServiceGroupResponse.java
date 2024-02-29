// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDataServiceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataServiceGroupResponseBody body;

    public static CreateDataServiceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataServiceGroupResponse self = new CreateDataServiceGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataServiceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataServiceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataServiceGroupResponse setBody(CreateDataServiceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataServiceGroupResponseBody getBody() {
        return this.body;
    }

}
