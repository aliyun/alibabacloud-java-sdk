// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class CreateApiKeyRequest extends TeaModel {
    @NameInMap("body")
    public CreateApiKeyInput body;

    public static CreateApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApiKeyRequest self = new CreateApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateApiKeyRequest setBody(CreateApiKeyInput body) {
        this.body = body;
        return this;
    }
    public CreateApiKeyInput getBody() {
        return this.body;
    }

}
