// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateMediaLiveInputSecurityGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMediaLiveInputSecurityGroupResponseBody body;

    public static CreateMediaLiveInputSecurityGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMediaLiveInputSecurityGroupResponse self = new CreateMediaLiveInputSecurityGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateMediaLiveInputSecurityGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMediaLiveInputSecurityGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMediaLiveInputSecurityGroupResponse setBody(CreateMediaLiveInputSecurityGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMediaLiveInputSecurityGroupResponseBody getBody() {
        return this.body;
    }

}
