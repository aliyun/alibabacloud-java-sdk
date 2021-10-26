// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateGroupConfigSynFlowResponseBody extends TeaModel {
    @NameInMap("FlowId")
    public String flowId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateGroupConfigSynFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupConfigSynFlowResponseBody self = new CreateGroupConfigSynFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGroupConfigSynFlowResponseBody setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public CreateGroupConfigSynFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
