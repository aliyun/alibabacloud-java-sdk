// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListCloudSiemPredefinedRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCloudSiemPredefinedRulesResponseBody body;

    public static ListCloudSiemPredefinedRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCloudSiemPredefinedRulesResponse self = new ListCloudSiemPredefinedRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListCloudSiemPredefinedRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCloudSiemPredefinedRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCloudSiemPredefinedRulesResponse setBody(ListCloudSiemPredefinedRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCloudSiemPredefinedRulesResponseBody getBody() {
        return this.body;
    }

}
