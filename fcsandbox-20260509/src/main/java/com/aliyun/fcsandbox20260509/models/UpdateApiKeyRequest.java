// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class UpdateApiKeyRequest extends TeaModel {
    @NameInMap("body")
    public UpdateApiKeyInput body;

    public static UpdateApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiKeyRequest self = new UpdateApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApiKeyRequest setBody(UpdateApiKeyInput body) {
        this.body = body;
        return this;
    }
    public UpdateApiKeyInput getBody() {
        return this.body;
    }

}
