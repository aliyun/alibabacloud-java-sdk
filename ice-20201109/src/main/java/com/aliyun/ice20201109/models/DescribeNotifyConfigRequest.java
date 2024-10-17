// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeNotifyConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4****</p>
     */
    @NameInMap("AIAgentId")
    public String AIAgentId;

    public static DescribeNotifyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNotifyConfigRequest self = new DescribeNotifyConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNotifyConfigRequest setAIAgentId(String AIAgentId) {
        this.AIAgentId = AIAgentId;
        return this;
    }
    public String getAIAgentId() {
        return this.AIAgentId;
    }

}
