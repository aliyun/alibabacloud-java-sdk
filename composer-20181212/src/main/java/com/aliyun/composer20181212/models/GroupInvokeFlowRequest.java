// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class GroupInvokeFlowRequest extends TeaModel {
    @NameInMap("FlowId")
    @Validation(required = true)
    public String flowId;

    @NameInMap("GroupKey")
    @Validation(required = true)
    public String groupKey;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    @NameInMap("ClientToken")
    @Validation(required = true)
    public String clientToken;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

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

}
