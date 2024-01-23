// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteStandardGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteStandardGroupResponseBody body;

    public static DeleteStandardGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStandardGroupResponse self = new DeleteStandardGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteStandardGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteStandardGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteStandardGroupResponse setBody(DeleteStandardGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteStandardGroupResponseBody getBody() {
        return this.body;
    }

}
