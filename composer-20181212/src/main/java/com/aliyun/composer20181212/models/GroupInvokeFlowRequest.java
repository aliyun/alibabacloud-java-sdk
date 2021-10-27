// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class GroupInvokeFlowRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Data")
    public String data;

    @NameInMap("FlowId")
    public String flowId;

    @NameInMap("GroupKey")
    public String groupKey;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GroupInvokeFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        GroupInvokeFlowRequest self = new GroupInvokeFlowRequest();
        return TeaModel.build(map, self);
    }

    public GroupInvokeFlowRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GroupInvokeFlowRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
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

    public GroupInvokeFlowRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public GroupInvokeFlowRequest setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
