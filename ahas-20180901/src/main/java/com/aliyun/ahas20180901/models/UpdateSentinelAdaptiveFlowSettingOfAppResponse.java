// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateSentinelAdaptiveFlowSettingOfAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSentinelAdaptiveFlowSettingOfAppResponseBody body;

    public static UpdateSentinelAdaptiveFlowSettingOfAppResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSentinelAdaptiveFlowSettingOfAppResponse self = new UpdateSentinelAdaptiveFlowSettingOfAppResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSentinelAdaptiveFlowSettingOfAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSentinelAdaptiveFlowSettingOfAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSentinelAdaptiveFlowSettingOfAppResponse setBody(UpdateSentinelAdaptiveFlowSettingOfAppResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSentinelAdaptiveFlowSettingOfAppResponseBody getBody() {
        return this.body;
    }

}
