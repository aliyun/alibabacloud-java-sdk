// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20160607.models;

import com.aliyun.tea.*;

public class UpdateRepoWebhookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static UpdateRepoWebhookResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRepoWebhookResponse self = new UpdateRepoWebhookResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRepoWebhookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
