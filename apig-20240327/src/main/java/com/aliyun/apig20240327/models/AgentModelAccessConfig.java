// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AgentModelAccessConfig extends TeaModel {
    /**
     * <p>The list of API consumer IDs that represent the Agent to access the Model API. The Model API ID and API consumer ID together identify the Agent identity, and the configuration takes effect on all current and future routes of the Model API. Specify at least one API consumer. The API consumer must be enabled and must have direct Consumer authorization for the Model API in the default environment of the target gateway, with the authorization publish status being Success. Different Agents cannot bind the same API consumer to the same Model API. ConsumerGroup is not supported.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("consumerIds")
    public java.util.List<String> consumerIds;

    /**
     * <p>The ID of the Model API to associate. The Model API must belong to the specified gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>model-api-1</p>
     */
    @NameInMap("modelApiId")
    public String modelApiId;

    public static AgentModelAccessConfig build(java.util.Map<String, ?> map) throws Exception {
        AgentModelAccessConfig self = new AgentModelAccessConfig();
        return TeaModel.build(map, self);
    }

    public AgentModelAccessConfig setConsumerIds(java.util.List<String> consumerIds) {
        this.consumerIds = consumerIds;
        return this;
    }
    public java.util.List<String> getConsumerIds() {
        return this.consumerIds;
    }

    public AgentModelAccessConfig setModelApiId(String modelApiId) {
        this.modelApiId = modelApiId;
        return this;
    }
    public String getModelApiId() {
        return this.modelApiId;
    }

}
