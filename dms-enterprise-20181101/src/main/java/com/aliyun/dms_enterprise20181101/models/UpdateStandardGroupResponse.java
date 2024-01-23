// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateStandardGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateStandardGroupResponseBody body;

    public static UpdateStandardGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStandardGroupResponse self = new UpdateStandardGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateStandardGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateStandardGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateStandardGroupResponse setBody(UpdateStandardGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStandardGroupResponseBody getBody() {
        return this.body;
    }

}
