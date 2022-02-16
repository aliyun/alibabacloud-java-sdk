// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateDNSServiceRuleAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDNSServiceRuleAttributeResponseBody body;

    public static UpdateDNSServiceRuleAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDNSServiceRuleAttributeResponse self = new UpdateDNSServiceRuleAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDNSServiceRuleAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDNSServiceRuleAttributeResponse setBody(UpdateDNSServiceRuleAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDNSServiceRuleAttributeResponseBody getBody() {
        return this.body;
    }

}
