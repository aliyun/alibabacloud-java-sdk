// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListAtiChangeLogsRequest extends TeaModel {
    /**
     * <p>The agent ID that is assigned by CNNIC after real-name verification. The AgentID serves as the unique identifier that binds the agent to the real-name registered contact.</p>
     * 
     * <strong>example:</strong>
     * <p>Justin@underarmour</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>Ensures the idempotency of the request. Generate a unique parameter value from your client to ensure that the value is unique across different requests. The ClientToken value supports only ASCII characters and cannot exceed 64 characters in length.</p>
     * <ul>
     * <li>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may vary for each API request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>eyJhbGciOiJIUzI1NiIsInR5cC.....</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The end time of the query (timestamp).</p>
     * 
     * <strong>example:</strong>
     * <p>1474335170000</p>
     */
    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    /**
     * <p>The operation type of the Operation logs log record, such as modifying an agent.</p>
     * 
     * <strong>example:</strong>
     * <p>2074753647748672512</p>
     */
    @NameInMap("OperationType")
    public String operationType;

    /**
     * <p>The UID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>1646808646232999</p>
     */
    @NameInMap("OperatorAccount")
    public String operatorAccount;

    /**
     * <p>The current page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page in a paged query. Maximum value: 100. Default value: 20.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start time of the query (timestamp).</p>
     * 
     * <strong>example:</strong>
     * <p>1474335170000</p>
     */
    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    /**
     * <p>Ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>忽略</p>
     */
    @NameInMap("TimeRange")
    public String timeRange;

    public static ListAtiChangeLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAtiChangeLogsRequest self = new ListAtiChangeLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListAtiChangeLogsRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public ListAtiChangeLogsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListAtiChangeLogsRequest setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public ListAtiChangeLogsRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public ListAtiChangeLogsRequest setOperatorAccount(String operatorAccount) {
        this.operatorAccount = operatorAccount;
        return this;
    }
    public String getOperatorAccount() {
        return this.operatorAccount;
    }

    public ListAtiChangeLogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAtiChangeLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAtiChangeLogsRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public ListAtiChangeLogsRequest setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

}
