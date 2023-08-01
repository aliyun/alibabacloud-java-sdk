// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class GetAgentInfoRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetAgentInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentInfoRequest self = new GetAgentInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
