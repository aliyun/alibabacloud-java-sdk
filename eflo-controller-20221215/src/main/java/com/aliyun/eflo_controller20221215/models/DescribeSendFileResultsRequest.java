// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeSendFileResultsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>t-bj038i0d6r8zoqo</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    /**
     * <strong>example:</strong>
     * <p>e01-cn-zvp2tgykr08</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    public static DescribeSendFileResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSendFileResultsRequest self = new DescribeSendFileResultsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSendFileResultsRequest setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

    public DescribeSendFileResultsRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

}
