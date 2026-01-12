// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class MultiModalAgentRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>txt_check_agent_01</p>
     */
    @NameInMap("AppID")
    public String appID;

    @NameInMap("ServiceParameters")
    public String serviceParameters;

    public static MultiModalAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        MultiModalAgentRequest self = new MultiModalAgentRequest();
        return TeaModel.build(map, self);
    }

    public MultiModalAgentRequest setAppID(String appID) {
        this.appID = appID;
        return this;
    }
    public String getAppID() {
        return this.appID;
    }

    public MultiModalAgentRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
