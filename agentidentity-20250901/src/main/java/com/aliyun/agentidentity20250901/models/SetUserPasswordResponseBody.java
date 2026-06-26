// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class SetUserPasswordResponseBody extends TeaModel {
    @NameInMap("RandomPassword")
    public String randomPassword;

    @NameInMap("RequestId")
    public String requestId;

    public static SetUserPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetUserPasswordResponseBody self = new SetUserPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public SetUserPasswordResponseBody setRandomPassword(String randomPassword) {
        this.randomPassword = randomPassword;
        return this;
    }
    public String getRandomPassword() {
        return this.randomPassword;
    }

    public SetUserPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
