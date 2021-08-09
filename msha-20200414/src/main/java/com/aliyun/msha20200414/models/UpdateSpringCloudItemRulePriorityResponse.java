// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class UpdateSpringCloudItemRulePriorityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSpringCloudItemRulePriorityResponseBody body;

    public static UpdateSpringCloudItemRulePriorityResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSpringCloudItemRulePriorityResponse self = new UpdateSpringCloudItemRulePriorityResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSpringCloudItemRulePriorityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSpringCloudItemRulePriorityResponse setBody(UpdateSpringCloudItemRulePriorityResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSpringCloudItemRulePriorityResponseBody getBody() {
        return this.body;
    }

}
