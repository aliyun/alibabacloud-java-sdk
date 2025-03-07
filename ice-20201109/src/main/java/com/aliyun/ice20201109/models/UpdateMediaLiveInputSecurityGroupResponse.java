// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaLiveInputSecurityGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMediaLiveInputSecurityGroupResponseBody body;

    public static UpdateMediaLiveInputSecurityGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaLiveInputSecurityGroupResponse self = new UpdateMediaLiveInputSecurityGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMediaLiveInputSecurityGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMediaLiveInputSecurityGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMediaLiveInputSecurityGroupResponse setBody(UpdateMediaLiveInputSecurityGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMediaLiveInputSecurityGroupResponseBody getBody() {
        return this.body;
    }

}
