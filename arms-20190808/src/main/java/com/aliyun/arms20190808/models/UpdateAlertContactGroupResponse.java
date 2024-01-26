// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateAlertContactGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAlertContactGroupResponseBody body;

    public static UpdateAlertContactGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertContactGroupResponse self = new UpdateAlertContactGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAlertContactGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAlertContactGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAlertContactGroupResponse setBody(UpdateAlertContactGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAlertContactGroupResponseBody getBody() {
        return this.body;
    }

}
