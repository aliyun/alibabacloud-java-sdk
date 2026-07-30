// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateDictRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    /**
     * <p>A unique token used to ensure the idempotence of the request. The client generates this value. It must be unique across different requests and cannot exceed 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateDictRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDictRequest self = new UpdateDictRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDictRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public UpdateDictRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
