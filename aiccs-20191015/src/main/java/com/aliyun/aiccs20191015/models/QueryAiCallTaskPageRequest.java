// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryAiCallTaskPageRequest extends TeaModel {
    /**
     * <p>The agent name. The system performs a fuzzy search based on this name.</p>
     * 
     * <strong>example:</strong>
     * <p>测试智能体</p>
     */
    @NameInMap("AgentName")
    public String agentName;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("ApplicationCode")
    public String applicationCode;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. The value must be greater than <strong>0</strong>. The default value is <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>68</p>
     */
    @NameInMap("Source")
    public Long source;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li><p><strong>INIT</strong>: The task is initialized but has not started.</p>
     * </li>
     * <li><p><strong>FAILED</strong>: The task failed to start.</p>
     * </li>
     * <li><p><strong>RUNNING</strong>: The task is running.</p>
     * </li>
     * <li><p><strong>STOPPED</strong>: The task is stopped.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>INIT</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The unique ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>1187**************</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The task name. The system performs a fuzzy search based on this name.</p>
     * 
     * <strong>example:</strong>
     * <p>测试任务</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static QueryAiCallTaskPageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAiCallTaskPageRequest self = new QueryAiCallTaskPageRequest();
        return TeaModel.build(map, self);
    }

    public QueryAiCallTaskPageRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public QueryAiCallTaskPageRequest setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
        return this;
    }
    public String getApplicationCode() {
        return this.applicationCode;
    }

    public QueryAiCallTaskPageRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryAiCallTaskPageRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryAiCallTaskPageRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAiCallTaskPageRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryAiCallTaskPageRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryAiCallTaskPageRequest setSource(Long source) {
        this.source = source;
        return this;
    }
    public Long getSource() {
        return this.source;
    }

    public QueryAiCallTaskPageRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryAiCallTaskPageRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public QueryAiCallTaskPageRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
