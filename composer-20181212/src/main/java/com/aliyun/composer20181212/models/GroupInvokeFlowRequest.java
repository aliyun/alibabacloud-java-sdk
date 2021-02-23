// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class GroupInvokeFlowRequest extends TeaModel {
    // FlowId
    @NameInMap("FlowId")
    public String flowId;

    // GroupKey
    @NameInMap("GroupKey")
    public String groupKey;

    // Data
    @NameInMap("Data")
    public String data;

    // ClientToken
    @NameInMap("ClientToken")
    public String clientToken;

    // TotalCount
    @NameInMap("TotalCount")
    public Integer totalCount;

    // Tags
    @NameInMap("Tags")
    public String tags;

    public static GroupInvokeFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        GroupInvokeFlowRequest self = new GroupInvokeFlowRequest();
        return TeaModel.build(map, self);
    }

    public GroupInvokeFlowRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public GroupInvokeFlowRequest setGroupKey(String groupKey) {
        this.groupKey = groupKey;
        return this;
    }
    public String getGroupKey() {
        return this.groupKey;
    }

    public GroupInvokeFlowRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GroupInvokeFlowRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GroupInvokeFlowRequest setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public GroupInvokeFlowRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
