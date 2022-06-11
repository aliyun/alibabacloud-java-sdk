// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateIndexTemplateRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("body")
    public String body;

    public static CreateIndexTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIndexTemplateRequest self = new CreateIndexTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateIndexTemplateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateIndexTemplateRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
