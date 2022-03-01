// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class TestAnonymousRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AgentInfoJson")
    public String agentInfoJson;

    public static TestAnonymousRequest build(java.util.Map<String, ?> map) throws Exception {
        TestAnonymousRequest self = new TestAnonymousRequest();
        return TeaModel.build(map, self);
    }

    public TestAnonymousRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public TestAnonymousRequest setAgentInfoJson(String agentInfoJson) {
        this.agentInfoJson = agentInfoJson;
        return this;
    }
    public String getAgentInfoJson() {
        return this.agentInfoJson;
    }

}
