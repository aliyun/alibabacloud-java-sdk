// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class SetUserPasswordResponseBody extends TeaModel {
    /**
     * <p>The system-generated random password returned when GenerateRandomPassword is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>Xk9mP2vL5nQ8</p>
     */
    @NameInMap("RandomPassword")
    public String randomPassword;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AABD6E03-4B3A-5687-88FF-72232670ED0C</p>
     */
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
