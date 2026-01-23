// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class RemoveQualityRuleSchedulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveQualityRuleSchedulesResponseBody body;

    public static RemoveQualityRuleSchedulesResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveQualityRuleSchedulesResponse self = new RemoveQualityRuleSchedulesResponse();
        return TeaModel.build(map, self);
    }

    public RemoveQualityRuleSchedulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveQualityRuleSchedulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveQualityRuleSchedulesResponse setBody(RemoveQualityRuleSchedulesResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveQualityRuleSchedulesResponseBody getBody() {
        return this.body;
    }

}
