// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetSuggestShrinkableNodesRequest extends TeaModel {
    @NameInMap("count")
    public Integer count;

    @NameInMap("ignoreStatus")
    public Boolean ignoreStatus;

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
