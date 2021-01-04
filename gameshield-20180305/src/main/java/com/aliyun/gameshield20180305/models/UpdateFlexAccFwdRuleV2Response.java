// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateFlexAccFwdRuleV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFlexAccFwdRuleV2ResponseBody body;

    public static UpdateFlexAccFwdRuleV2Response build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlexAccFwdRuleV2Response self = new UpdateFlexAccFwdRuleV2Response();
        return TeaModel.build(map, self);
    }

    public UpdateFlexAccFwdRuleV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFlexAccFwdRuleV2Response setBody(UpdateFlexAccFwdRuleV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFlexAccFwdRuleV2ResponseBody getBody() {
        return this.body;
    }

}
