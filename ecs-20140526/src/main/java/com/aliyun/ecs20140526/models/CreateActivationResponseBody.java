// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateActivationResponseBody extends TeaModel {
    @NameInMap("ActivationCode")
    public String activationCode;

    @NameInMap("ActivationId")
    public String activationId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateActivationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateActivationResponseBody self = new CreateActivationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateActivationResponseBody setActivationCode(String activationCode) {
        this.activationCode = activationCode;
        return this;
    }
    public String getActivationCode() {
        return this.activationCode;
    }

    public CreateActivationResponseBody setActivationId(String activationId) {
        this.activationId = activationId;
        return this;
    }
    public String getActivationId() {
        return this.activationId;
    }

    public CreateActivationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
