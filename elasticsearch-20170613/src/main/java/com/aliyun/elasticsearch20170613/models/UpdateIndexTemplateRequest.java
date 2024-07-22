// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateIndexTemplateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("body")
    public String body;

    public static UpdateIndexTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIndexTemplateRequest self = new UpdateIndexTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIndexTemplateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateIndexTemplateRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
