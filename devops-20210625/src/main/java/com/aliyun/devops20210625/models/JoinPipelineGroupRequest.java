// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class JoinPipelineGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("groupId")
    public Long groupId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("pipelineIds")
    public String pipelineIds;

    public static JoinPipelineGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        JoinPipelineGroupRequest self = new JoinPipelineGroupRequest();
        return TeaModel.build(map, self);
    }

    public JoinPipelineGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public JoinPipelineGroupRequest setPipelineIds(String pipelineIds) {
        this.pipelineIds = pipelineIds;
        return this;
    }
    public String getPipelineIds() {
        return this.pipelineIds;
    }

}
