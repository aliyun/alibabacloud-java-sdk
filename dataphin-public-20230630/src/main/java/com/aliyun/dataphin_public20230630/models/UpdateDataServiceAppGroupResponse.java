// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateDataServiceAppGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataServiceAppGroupResponseBody body;

    public static UpdateDataServiceAppGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataServiceAppGroupResponse self = new UpdateDataServiceAppGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataServiceAppGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataServiceAppGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataServiceAppGroupResponse setBody(UpdateDataServiceAppGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataServiceAppGroupResponseBody getBody() {
        return this.body;
    }

}
