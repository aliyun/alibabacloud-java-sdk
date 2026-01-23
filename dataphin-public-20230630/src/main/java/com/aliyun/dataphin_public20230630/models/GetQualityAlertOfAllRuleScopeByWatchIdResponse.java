// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetQualityAlertOfAllRuleScopeByWatchIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQualityAlertOfAllRuleScopeByWatchIdResponseBody body;

    public static GetQualityAlertOfAllRuleScopeByWatchIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualityAlertOfAllRuleScopeByWatchIdResponse self = new GetQualityAlertOfAllRuleScopeByWatchIdResponse();
        return TeaModel.build(map, self);
    }

    public GetQualityAlertOfAllRuleScopeByWatchIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQualityAlertOfAllRuleScopeByWatchIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQualityAlertOfAllRuleScopeByWatchIdResponse setBody(GetQualityAlertOfAllRuleScopeByWatchIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQualityAlertOfAllRuleScopeByWatchIdResponseBody getBody() {
        return this.body;
    }

}
