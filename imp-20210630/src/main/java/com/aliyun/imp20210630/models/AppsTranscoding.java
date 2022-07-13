// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class AppsTranscoding extends TeaModel {
    @NameInMap("FlowId")
    public String flowId;

    @NameInMap("Type")
    public String type;

    public static AppsTranscoding build(java.util.Map<String, ?> map) throws Exception {
        AppsTranscoding self = new AppsTranscoding();
        return TeaModel.build(map, self);
    }

    public AppsTranscoding setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public AppsTranscoding setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
