// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetSuggestShrinkableNodesRequest extends TeaModel {
    /**
     * <p>The number of nodes that you want to remove.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("count")
    public Integer count;

    /**
     * <p>Specifies whether to ignore the instance status. Default value: false.</p>
     */
    @NameInMap("ignoreStatus")
    public Boolean ignoreStatus;

    /**
     * <p>The type of removing nodes. WORKER indicates hot node and WORKER_WARM indicates warm node.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("nodeType")
    public String nodeType;

    public static GetSuggestShrinkableNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSuggestShrinkableNodesRequest self = new GetSuggestShrinkableNodesRequest();
        return TeaModel.build(map, self);
    }

    public GetSuggestShrinkableNodesRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public GetSuggestShrinkableNodesRequest setIgnoreStatus(Boolean ignoreStatus) {
        this.ignoreStatus = ignoreStatus;
        return this;
    }
    public Boolean getIgnoreStatus() {
        return this.ignoreStatus;
    }

    public GetSuggestShrinkableNodesRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

}
