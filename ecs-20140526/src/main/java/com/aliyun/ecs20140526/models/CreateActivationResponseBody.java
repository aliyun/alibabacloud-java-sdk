// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateActivationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ActivationId")
    public String activationId;

    @NameInMap("ActivationCode")
    public String activationCode;

    public static CreateActivationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateActivationResponseBody self = new CreateActivationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateActivationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateActivationResponseBody setActivationId(String activationId) {
        this.activationId = activationId;
        return this;
    }
    public String getActivationId() {
        return this.activationId;
    }

    public CreateActivationResponseBody setActivationCode(String activationCode) {
        this.activationCode = activationCode;
        return this;
    }
    public String getActivationCode() {
        return this.activationCode;
    }

}
