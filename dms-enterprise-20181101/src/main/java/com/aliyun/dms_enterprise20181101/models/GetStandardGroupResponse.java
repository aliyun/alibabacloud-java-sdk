// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetStandardGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetStandardGroupResponseBody body;

    public static GetStandardGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStandardGroupResponse self = new GetStandardGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetStandardGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStandardGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStandardGroupResponse setBody(GetStandardGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStandardGroupResponseBody getBody() {
        return this.body;
    }

}
