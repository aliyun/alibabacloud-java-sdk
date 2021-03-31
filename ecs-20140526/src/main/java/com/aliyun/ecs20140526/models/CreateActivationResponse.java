// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateActivationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ActivationId")
    @Validation(required = true)
    public String activationId;

    @NameInMap("ActivationCode")
    @Validation(required = true)
    public String activationCode;

    public static CreateActivationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateActivationResponse self = new CreateActivationResponse();
        return TeaModel.build(map, self);
    }

    public CreateActivationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateActivationResponse setActivationId(String activationId) {
        this.activationId = activationId;
        return this;
    }
    public String getActivationId() {
        return this.activationId;
    }

    public CreateActivationResponse setActivationCode(String activationCode) {
        this.activationCode = activationCode;
        return this;
    }
    public String getActivationCode() {
        return this.activationCode;
    }

}
