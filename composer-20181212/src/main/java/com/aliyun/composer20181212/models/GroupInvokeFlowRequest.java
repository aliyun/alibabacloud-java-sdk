// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class GroupInvokeFlowRequest extends TeaModel {
    // The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length.
    @NameInMap("ClientToken")
    public String clientToken;

    // The information required by the group execution. Set this parameter to a JSON array of strings in the following format:`{"Items": []}`. Each string provides the information required by one time of execution. The string must use the format of the Data parameter in the InvokeFlow operation.
    @NameInMap("Data")
    public String data;

    // The ID of the workflow that you want to execute.
    @NameInMap("FlowId")
    public String flowId;

    // The name of the group. The name must be unique among the groups.
    @NameInMap("GroupKey")
    public String groupKey;

    // The tag that is attached to each time of execution. The value is a JSON array. The number of tags in the array is the same as the value of the TotalCount parameter.
    @NameInMap("Tags")
    public String tags;

    // The number of times of execution. The value must be the same as the number of strings in the value of the Data parameter.
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
