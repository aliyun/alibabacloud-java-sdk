// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeNodeTypeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    public static DescribeNodeTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeTypeRequest self = new DescribeNodeTypeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNodeTypeRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

}
