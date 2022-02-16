// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateGroupDNSServiceRuleAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGroupDNSServiceRuleAttributeResponseBody body;

    public static UpdateGroupDNSServiceRuleAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupDNSServiceRuleAttributeResponse self = new UpdateGroupDNSServiceRuleAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGroupDNSServiceRuleAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGroupDNSServiceRuleAttributeResponse setBody(UpdateGroupDNSServiceRuleAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGroupDNSServiceRuleAttributeResponseBody getBody() {
        return this.body;
    }

}
