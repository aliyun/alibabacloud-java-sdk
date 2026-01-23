// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateQualityRuleSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateQualityRuleSwitchResponseBody body;

    public static UpdateQualityRuleSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateQualityRuleSwitchResponse self = new UpdateQualityRuleSwitchResponse();
        return TeaModel.build(map, self);
    }

    public UpdateQualityRuleSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateQualityRuleSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateQualityRuleSwitchResponse setBody(UpdateQualityRuleSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateQualityRuleSwitchResponseBody getBody() {
        return this.body;
    }

}
