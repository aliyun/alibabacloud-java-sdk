// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetTagsBySwimmingLaneGroupIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTagsBySwimmingLaneGroupIdResponseBody body;

    public static GetTagsBySwimmingLaneGroupIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTagsBySwimmingLaneGroupIdResponse self = new GetTagsBySwimmingLaneGroupIdResponse();
        return TeaModel.build(map, self);
    }

    public GetTagsBySwimmingLaneGroupIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTagsBySwimmingLaneGroupIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTagsBySwimmingLaneGroupIdResponse setBody(GetTagsBySwimmingLaneGroupIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTagsBySwimmingLaneGroupIdResponseBody getBody() {
        return this.body;
    }

}
