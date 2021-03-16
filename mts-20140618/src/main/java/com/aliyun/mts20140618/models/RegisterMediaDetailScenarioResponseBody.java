// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class RegisterMediaDetailScenarioResponseBody extends TeaModel {
    @NameInMap("ScenarioId")
    public String scenarioId;

    @NameInMap("RequestId")
    public String requestId;

    public static RegisterMediaDetailScenarioResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterMediaDetailScenarioResponseBody self = new RegisterMediaDetailScenarioResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterMediaDetailScenarioResponseBody setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public String getScenarioId() {
        return this.scenarioId;
    }

    public RegisterMediaDetailScenarioResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
