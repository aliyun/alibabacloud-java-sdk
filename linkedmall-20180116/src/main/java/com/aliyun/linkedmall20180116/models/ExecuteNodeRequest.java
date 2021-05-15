// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ExecuteNodeRequest extends TeaModel {
    @NameInMap("ProcessInstanceId")
    public String processInstanceId;

    @NameInMap("ProcessId")
    @Validation(required = true)
    public String processId;

    @NameInMap("NodeInstanceId")
    public String nodeInstanceId;

    @NameInMap("NodeId")
    @Validation(required = true)
    public String nodeId;

    @NameInMap("RequestData")
    public String requestData;

    public static ExecuteNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteNodeRequest self = new ExecuteNodeRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteNodeRequest setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

    public ExecuteNodeRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public ExecuteNodeRequest setNodeInstanceId(String nodeInstanceId) {
        this.nodeInstanceId = nodeInstanceId;
        return this;
    }
    public String getNodeInstanceId() {
        return this.nodeInstanceId;
    }

    public ExecuteNodeRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ExecuteNodeRequest setRequestData(String requestData) {
        this.requestData = requestData;
        return this;
    }
    public String getRequestData() {
        return this.requestData;
    }

}
