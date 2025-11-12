// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeNodeGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    public static DescribeNodeGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeGroupRequest self = new DescribeNodeGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNodeGroupRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

}
