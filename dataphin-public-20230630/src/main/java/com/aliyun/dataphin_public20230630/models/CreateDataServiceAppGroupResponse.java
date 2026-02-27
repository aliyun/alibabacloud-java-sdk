// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateDataServiceAppGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataServiceAppGroupResponseBody body;

    public static CreateDataServiceAppGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataServiceAppGroupResponse self = new CreateDataServiceAppGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataServiceAppGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataServiceAppGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataServiceAppGroupResponse setBody(CreateDataServiceAppGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataServiceAppGroupResponseBody getBody() {
        return this.body;
    }

}
