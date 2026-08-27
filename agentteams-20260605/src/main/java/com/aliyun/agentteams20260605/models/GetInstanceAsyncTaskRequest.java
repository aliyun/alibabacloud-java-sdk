// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetInstanceAsyncTaskRequest extends TeaModel {
    /**
     * <p>The ID of the AgentTeams instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>at-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page size. Default value: <code>100</code>. Valid values: <code>1</code> to <code>100</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page. Do not specify this parameter for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The task status filter.</p>
     * 
     * <strong>example:</strong>
     * <p>PAUSED</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The task code. If not specified, all asynchronous tasks are queried. You can pass in a <code>TaskCode</code> to filter results. To query multiple task types, submit separate requests.</p>
     * <p>Currently supported <code>taskCode</code> values include: <code>CreateInstance</code>, <code>RenewInstance</code>, <code>UpdateInstance</code>, <code>ReleaseInstance</code>, <code>ConfigureNatGateway</code>, <code>UpgradeInstance</code>, <code>CreateWorkerEndpoint</code>, and <code>DeleteWorkerEndpoint</code>.</p>
     * <p>Legacy task codes such as <code>LIFECYCLE_MAGIC_PAY_ORDER_CALLBACK_CREATE</code> are supported for backward compatibility, but <code>CreateInstance</code> is recommended.</p>
     * 
     * <strong>example:</strong>
     * <p>LIFECYCLE_MAGIC_PAY_ORDER_CALLBACK_CREATE</p>
     */
    @NameInMap("TaskCode")
    public String taskCode;

    public static GetInstanceAsyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceAsyncTaskRequest self = new GetInstanceAsyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceAsyncTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceAsyncTaskRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetInstanceAsyncTaskRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetInstanceAsyncTaskRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetInstanceAsyncTaskRequest setTaskCode(String taskCode) {
        this.taskCode = taskCode;
        return this;
    }
    public String getTaskCode() {
        return this.taskCode;
    }

}
