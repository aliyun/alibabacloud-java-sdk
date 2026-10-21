// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListAgenticSqlExecutionHistoriesRequest extends TeaModel {
    /**
     * <p>The ID of the actor. User IDs start with usr_, and agent IDs start with agt_. If you do not specify this parameter, a user queries their own execution history and the execution history of their agents, while an agent queries only its own execution history. If you specify this parameter, exact matching is performed, and the value must be the ID of the current user or an agent owned by the current user.</p>
     * 
     * <strong>example:</strong>
     * <p>usr_10001</p>
     */
    @NameInMap("ActorId")
    public String actorId;

    /**
     * <p>The name of the actor for exact matching.</p>
     * 
     * <strong>example:</strong>
     * <p>demo-user</p>
     */
    @NameInMap("ActorName")
    public String actorName;

    /**
     * <p>The type of the actor for exact matching. Valid values: HUMAN and AGENT.</p>
     * 
     * <strong>example:</strong>
     * <p>HUMAN</p>
     */
    @NameInMap("ActorType")
    public String actorType;

    /**
     * <p>The catalog UUID for exact matching. You can obtain this value by calling ListAgenticCatalog or SearchAgenticCatalog.</p>
     * 
     * <strong>example:</strong>
     * <p>mc-HZ-OfjcNc2z***</p>
     */
    @NameInMap("CatalogUuid")
    public String catalogUuid;

    /**
     * <p>The database UUID for exact matching. You can obtain this value by calling ListAgenticDatabase or SearchAgenticDatabase.</p>
     * 
     * <strong>example:</strong>
     * <p>md-HZ-fp9K7r***</p>
     */
    @NameInMap("DatabaseUuid")
    public String databaseUuid;

    /**
     * <p>The end time of the query. Specify the time in the yyyy-MM-dd HH:mm:ss format. If you do not specify this parameter, the default value is the current time. If the format cannot be parsed or the end time is earlier than the start time, the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-06-01 00:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The execution scenario for exact matching. Valid values:</p>
     * <ul>
     * <li>AGENT_QUERY: The agent directly executes the SQL statement.</li>
     * <li>WORKFLOW_QUERY: The SQL statement is asynchronously executed through a workflow.
     * If you do not specify this parameter, both scenarios are queried.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AGENT_QUERY</p>
     */
    @NameInMap("Scenario")
    public String scenario;

    /**
     * <p>The number of entries per page. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>The keyword for fuzzy matching against the original SQL statement.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT</p>
     */
    @NameInMap("SqlKeyword")
    public String sqlKeyword;

    /**
     * <p>The SQL type for exact matching.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT</p>
     */
    @NameInMap("SqlType")
    public String sqlType;

    /**
     * <p>The start time of the query. Specify the time in the yyyy-MM-dd HH:mm:ss format. If you do not specify this parameter, the default time range is the last 7 days. If the specified time is more than 730 days ago or the format cannot be parsed, the query is performed for the last 730 days.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01 00:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ListAgenticSqlExecutionHistoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgenticSqlExecutionHistoriesRequest self = new ListAgenticSqlExecutionHistoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListAgenticSqlExecutionHistoriesRequest setActorId(String actorId) {
        this.actorId = actorId;
        return this;
    }
    public String getActorId() {
        return this.actorId;
    }

    public ListAgenticSqlExecutionHistoriesRequest setActorName(String actorName) {
        this.actorName = actorName;
        return this;
    }
    public String getActorName() {
        return this.actorName;
    }

    public ListAgenticSqlExecutionHistoriesRequest setActorType(String actorType) {
        this.actorType = actorType;
        return this;
    }
    public String getActorType() {
        return this.actorType;
    }

    public ListAgenticSqlExecutionHistoriesRequest setCatalogUuid(String catalogUuid) {
        this.catalogUuid = catalogUuid;
        return this;
    }
    public String getCatalogUuid() {
        return this.catalogUuid;
    }

    public ListAgenticSqlExecutionHistoriesRequest setDatabaseUuid(String databaseUuid) {
        this.databaseUuid = databaseUuid;
        return this;
    }
    public String getDatabaseUuid() {
        return this.databaseUuid;
    }

    public ListAgenticSqlExecutionHistoriesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListAgenticSqlExecutionHistoriesRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListAgenticSqlExecutionHistoriesRequest setScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }
    public String getScenario() {
        return this.scenario;
    }

    public ListAgenticSqlExecutionHistoriesRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListAgenticSqlExecutionHistoriesRequest setSqlKeyword(String sqlKeyword) {
        this.sqlKeyword = sqlKeyword;
        return this;
    }
    public String getSqlKeyword() {
        return this.sqlKeyword;
    }

    public ListAgenticSqlExecutionHistoriesRequest setSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }
    public String getSqlType() {
        return this.sqlType;
    }

    public ListAgenticSqlExecutionHistoriesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
