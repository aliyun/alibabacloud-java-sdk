// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaLiveInputSecurityGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMediaLiveInputSecurityGroupResponseBody body;

    public static GetMediaLiveInputSecurityGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaLiveInputSecurityGroupResponse self = new GetMediaLiveInputSecurityGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetMediaLiveInputSecurityGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMediaLiveInputSecurityGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMediaLiveInputSecurityGroupResponse setBody(GetMediaLiveInputSecurityGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaLiveInputSecurityGroupResponseBody getBody() {
        return this.body;
    }

}
