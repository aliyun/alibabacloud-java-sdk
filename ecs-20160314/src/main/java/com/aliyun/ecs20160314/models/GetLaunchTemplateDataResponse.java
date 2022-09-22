// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class GetLaunchTemplateDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLaunchTemplateDataResponseBody body;

    public static GetLaunchTemplateDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLaunchTemplateDataResponse self = new GetLaunchTemplateDataResponse();
        return TeaModel.build(map, self);
    }

    public GetLaunchTemplateDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLaunchTemplateDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLaunchTemplateDataResponse setBody(GetLaunchTemplateDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLaunchTemplateDataResponseBody getBody() {
        return this.body;
    }

}
