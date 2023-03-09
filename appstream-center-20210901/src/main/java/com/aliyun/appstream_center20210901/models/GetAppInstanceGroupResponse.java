// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetAppInstanceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAppInstanceGroupResponseBody body;

    public static GetAppInstanceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppInstanceGroupResponse self = new GetAppInstanceGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetAppInstanceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppInstanceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppInstanceGroupResponse setBody(GetAppInstanceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppInstanceGroupResponseBody getBody() {
        return this.body;
    }

}
