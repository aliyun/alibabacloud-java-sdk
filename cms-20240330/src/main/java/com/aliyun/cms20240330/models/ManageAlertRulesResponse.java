// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ManageAlertRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ServerResponseManageAlertRulesResult body;

    public static ManageAlertRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ManageAlertRulesResponse self = new ManageAlertRulesResponse();
        return TeaModel.build(map, self);
    }

    public ManageAlertRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ManageAlertRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ManageAlertRulesResponse setBody(ServerResponseManageAlertRulesResult body) {
        this.body = body;
        return this;
    }
    public ServerResponseManageAlertRulesResult getBody() {
        return this.body;
    }

}
