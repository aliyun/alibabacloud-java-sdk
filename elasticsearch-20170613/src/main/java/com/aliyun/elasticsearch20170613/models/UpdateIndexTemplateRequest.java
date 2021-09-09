// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateIndexTemplateRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

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

}
