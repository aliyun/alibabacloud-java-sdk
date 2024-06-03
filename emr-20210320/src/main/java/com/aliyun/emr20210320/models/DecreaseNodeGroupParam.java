// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class DecreaseNodeGroupParam extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReleaseInstanceIds")
    public java.util.List<String> releaseInstanceIds;

    public static DecreaseNodeGroupParam build(java.util.Map<String, ?> map) throws Exception {
        DecreaseNodeGroupParam self = new DecreaseNodeGroupParam();
        return TeaModel.build(map, self);
    }

    public DecreaseNodeGroupParam setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public DecreaseNodeGroupParam setReleaseInstanceIds(java.util.List<String> releaseInstanceIds) {
        this.releaseInstanceIds = releaseInstanceIds;
        return this;
    }
    public java.util.List<String> getReleaseInstanceIds() {
        return this.releaseInstanceIds;
    }

}
