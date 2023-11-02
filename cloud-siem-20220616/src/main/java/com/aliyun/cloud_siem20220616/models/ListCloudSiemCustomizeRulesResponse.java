// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListCloudSiemCustomizeRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCloudSiemCustomizeRulesResponseBody body;

    public static ListCloudSiemCustomizeRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCloudSiemCustomizeRulesResponse self = new ListCloudSiemCustomizeRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListCloudSiemCustomizeRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCloudSiemCustomizeRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCloudSiemCustomizeRulesResponse setBody(ListCloudSiemCustomizeRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCloudSiemCustomizeRulesResponseBody getBody() {
        return this.body;
    }

}
