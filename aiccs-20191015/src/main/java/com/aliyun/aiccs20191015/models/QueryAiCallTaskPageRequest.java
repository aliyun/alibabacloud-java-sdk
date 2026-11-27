// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryAiCallTaskPageRequest extends TeaModel {
    /**
     * <p>The agent name. The system performs a fuzzy search based on the agent name.</p>
     * 
     * <strong>example:</strong>
     * <p>Test agent</p>
     */
    @NameInMap("AgentName")
    public String agentName;

    /**
     * <p>The application code.</p>
     * 
     * <strong>example:</strong>
     * <p>025****C98</p>
     */
    @NameInMap("ApplicationCode")
    public String applicationCode;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The current page number. The value must be greater than <strong>0</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The paging Settings for the number of entries per page in a paged query.</p>
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
     * <p>The creation source. Valid values:</p>
     * <ul>
     * <li>0: Created by an agent.</li>
     * <li>1: Created by the engine.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Source")
    public Long source;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li>INIT: Initialized (not started).</li>
     * <li>FAILED: Failed to start.</li>
     * <li>RUNNING: Running.</li>
     * <li>STOPPED: Stopped.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>INIT</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1187**************</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The task name. The system performs a fuzzy search based on the task name.</p>
     * 
     * <strong>example:</strong>
     * <p>Test task</p>
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
