// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListAgenticSqlExecutionHistoriesResponseBody extends TeaModel {
    /**
     * <p>The list of SQL execution history.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListAgenticSqlExecutionHistoriesResponseBodyData> data;

    /**
     * <p>The error code. This parameter is empty when the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>INVALID_PARAMETER</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned when the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid endTime format, expected yyyy-MM-dd HH:mm:ss</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>34E01EDD-6A16-4CF0-9541-C644D1BE01AA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListAgenticSqlExecutionHistoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgenticSqlExecutionHistoriesResponseBody self = new ListAgenticSqlExecutionHistoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgenticSqlExecutionHistoriesResponseBody setData(java.util.List<ListAgenticSqlExecutionHistoriesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAgenticSqlExecutionHistoriesResponseBodyData> getData() {
        return this.data;
    }

    public ListAgenticSqlExecutionHistoriesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAgenticSqlExecutionHistoriesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListAgenticSqlExecutionHistoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAgenticSqlExecutionHistoriesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAgenticSqlExecutionHistoriesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListAgenticSqlExecutionHistoriesResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the actor. User IDs start with usr_, and agent IDs start with agt_.</p>
         * 
         * <strong>example:</strong>
         * <p>usr_10001</p>
         */
        @NameInMap("ActorId")
        public String actorId;

        /**
         * <p>The name of the actor.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-user</p>
         */
        @NameInMap("ActorName")
        public String actorName;

        /**
         * <p>The type of the actor. HUMAN indicates a user, and AGENT indicates an agent.</p>
         * 
         * <strong>example:</strong>
         * <p>HUMAN</p>
         */
        @NameInMap("ActorType")
        public String actorType;

        /**
         * <p>The number of affected rows.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AffectedRows")
        public Long affectedRows;

        /**
         * <p>The ID of the user to which the agent belongs. The ID starts with usr_.</p>
         * 
         * <strong>example:</strong>
         * <p>usr_10001</p>
         */
        @NameInMap("AgentOwnerId")
        public String agentOwnerId;

        /**
         * <p>The catalog UUID to which the execution belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>mc-HZ-OfjcNc2z***</p>
         */
        @NameInMap("CatalogUuid")
        public String catalogUuid;

        /**
         * <p>The IP address of the client that initiated the execution, excluding the port. This parameter is empty in workflow scenarios or when the IP address is not recorded.</p>
         * 
         * <strong>example:</strong>
         * <p>203.0.113.10</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>The execution duration of the SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Cost")
        public Long cost;

        /**
         * <p>The search name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>demo_db</p>
         */
        @NameInMap("DatabaseSearchName")
        public String databaseSearchName;

        /**
         * <p>The database UUID to which the execution belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>md-HZ-fp9K7r***</p>
         */
        @NameInMap("DatabaseUuid")
        public String databaseUuid;

        /**
         * <p>The error message returned when the execution fails.</p>
         * 
         * <strong>example:</strong>
         * <p>syntax error</p>
         */
        @NameInMap("Error")
        public String error;

        /**
         * <p>The actual SQL statement that was executed.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT 1</p>
         */
        @NameInMap("ExecutedSql")
        public String executedSql;

        /**
         * <p>The execution status. Valid values:</p>
         * <ul>
         * <li>SUCCESS: The execution succeeded.</li>
         * <li>FAILED: The execution failed.</li>
         * <li>BLOCKED: The execution was blocked or not actually executed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("ExecutionStatus")
        public String executionStatus;

        /**
         * <p>The original SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT 1</p>
         */
        @NameInMap("OriginalSql")
        public String originalSql;

        /**
         * <p>The query ID of the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>trace-10001</p>
         */
        @NameInMap("QueryId")
        public String queryId;

        /**
         * <p>The number of returned rows.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReturnedRows")
        public Long returnedRows;

        /**
         * <p>The execution scenario. Valid values:</p>
         * <ul>
         * <li>AGENT_QUERY: The agent directly executes the SQL statement.</li>
         * <li>WORKFLOW_QUERY: The SQL statement is asynchronously executed through a workflow.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AGENT_QUERY</p>
         */
        @NameInMap("Scenario")
        public String scenario;

        /**
         * <p>The SQL type.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT</p>
         */
        @NameInMap("SqlType")
        public String sqlType;

        /**
         * <p>The start time of the execution. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The workflow ID. This parameter may be empty in non-workflow scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>wf-10001</p>
         */
        @NameInMap("WorkflowId")
        public String workflowId;

        public static ListAgenticSqlExecutionHistoriesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAgenticSqlExecutionHistoriesResponseBodyData self = new ListAgenticSqlExecutionHistoriesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAgenticSqlExecutionHistoriesResponseBodyData setActorId(String actorId) {
            this.actorId = actorId;
            return this;
        }
        public String getActorId() {
            return this.actorId;
        }

        public ListAgenticSqlExecutionHistoriesResponseBodyData setActorName(String actorName) {
            this.actorName = actorName;
            return this;
        }
        public String getActorName() {
            return this.actorName;
        }

        public ListAgenticSqlExecutionHistoriesResponseBodyData setActorType(String actorType) {
            this.actorType = actorType;
            return this;
        }
        public String getActorType() {
            return this.actorType;
        }

        public ListAgenticSqlExecutionHistoriesResponseBodyData setAffectedRows(Long affectedRows) {
            this.affectedRows = affectedRows;
            return this;
        }
        public Long getAffectedRows() {
            return this.affectedRows;
        }

        public ListAgenticSqlExecutionHistoriesResponseBodyData setAgentOwnerId(String agentOwnerId) {
            this.agentOwnerId = agentOwnerId;
            return this;
        }
        public String getAgentOwnerId() {
            return this.agentOwnerId;
        }

        public ListAgenticSqlExecutionHistoriesResponseBodyData setCatalogUuid(String catalogUuid) {
            this.catalogUuid = catalogUuid;
            return this;
        }
        public String getCatalogUuid() {
            return this.catalogUuid;
        }

        public ListAgenticSqlExecutionHistoriesResponseBodyData setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public ListAgenticSqlExecutionHistoriesResponseBodyData setCost(Long cost) {
            this.cost = cost;
            return this;
        }
        public Long getCost() {
            return this.cost;
        }

        public ListAgenticSqlExecutionHistoriesResponseBodyData setDatabaseSearchName(String databaseSearchName) {
            this.databaseSearchName = databaseSearchName;
            return this;
        }
        public String getDatabaseSearchName() {
            return this.databaseSearchName;
        }

        public ListAgenticSqlExecutionHistoriesResponseBodyData setDatabaseUuid(String databaseUuid) {
            this.databaseUuid = databaseUuid;
            return this;
        }
        public String getDatabaseUuid() {
            return this.databaseUuid;
        }

        public ListAgenticSqlExecutionHistoriesResponseBodyData setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public ListAgenticSqlExecutionHistoriesResponseBodyData setExecutedSql(String executedSql) {
            this.executedSql = executedSql;
            return this;
        }
        public String getExecutedSql() {
            return this.executedSql;
        }

        public ListAgenticSqlExecutionHistoriesResponseBodyData setExecutionStatus(String executionStatus) {
            this.executionStatus = executionStatus;
            return this;
        }
        public String getExecutionStatus() {
            return this.executionStatus;
        }

        public ListAgenticSqlExecutionHistoriesResponseBodyData setOriginalSql(String originalSql) {
            this.originalSql = originalSql;
            return this;
        }
        public String getOriginalSql() {
            return this.originalSql;
        }

        public ListAgenticSqlExecutionHistoriesResponseBodyData setQueryId(String queryId) {
            this.queryId = queryId;
            return this;
        }
        public String getQueryId() {
            return this.queryId;
        }

        public ListAgenticSqlExecutionHistoriesResponseBodyData setReturnedRows(Long returnedRows) {
            this.returnedRows = returnedRows;
            return this;
        }
        public Long getReturnedRows() {
            return this.returnedRows;
        }

        public ListAgenticSqlExecutionHistoriesResponseBodyData setScenario(String scenario) {
            this.scenario = scenario;
            return this;
        }
        public String getScenario() {
            return this.scenario;
        }

        public ListAgenticSqlExecutionHistoriesResponseBodyData setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

        public ListAgenticSqlExecutionHistoriesResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListAgenticSqlExecutionHistoriesResponseBodyData setWorkflowId(String workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public String getWorkflowId() {
            return this.workflowId;
        }

    }

}
