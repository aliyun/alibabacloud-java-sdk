// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateTemplateRequest extends TeaModel {
    /**
     * <p>The request body for the template update.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public UpdateTemplateInput body;

    /**
     * <p>A unique client token to ensure request idempotency.</p>
     * 
     * <strong>example:</strong>
     * <p>clientToken</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateRequest self = new UpdateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateRequest setBody(UpdateTemplateInput body) {
        this.body = body;
        return this;
    }
    public UpdateTemplateInput getBody() {
        return this.body;
    }

    public UpdateTemplateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
