// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteDataServiceAppGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataServiceAppGroupResponseBody body;

    public static DeleteDataServiceAppGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataServiceAppGroupResponse self = new DeleteDataServiceAppGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataServiceAppGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataServiceAppGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataServiceAppGroupResponse setBody(DeleteDataServiceAppGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataServiceAppGroupResponseBody getBody() {
        return this.body;
    }

}
