// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CheckSiteFeaturesMatchPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckSiteFeaturesMatchPlanResponseBody body;

    public static CheckSiteFeaturesMatchPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckSiteFeaturesMatchPlanResponse self = new CheckSiteFeaturesMatchPlanResponse();
        return TeaModel.build(map, self);
    }

    public CheckSiteFeaturesMatchPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckSiteFeaturesMatchPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckSiteFeaturesMatchPlanResponse setBody(CheckSiteFeaturesMatchPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckSiteFeaturesMatchPlanResponseBody getBody() {
        return this.body;
    }

}
