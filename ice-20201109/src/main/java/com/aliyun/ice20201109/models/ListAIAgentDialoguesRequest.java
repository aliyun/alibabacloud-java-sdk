// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAIAgentDialoguesRequest extends TeaModel {
    /**
     * <p>The end Unix timestamp (inclusive), in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>17358082464030</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The sort order. Valid values: <code>ASC</code> (ascending) and <code>DESC</code> (descending). Default value: <code>DESC</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of items per page. Maximum value: 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The number of most recent dialogue rounds to return. This value must be a positive integer. This parameter is mutually exclusive with pagination parameters; if specified, it overrides them.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("RoundLimit")
    public String roundLimit;

    /**
     * <p>The session ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f27f9b9be28642a88e18****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The start Unix timestamp (inclusive), in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListAIAgentDialoguesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAIAgentDialoguesRequest self = new ListAIAgentDialoguesRequest();
        return TeaModel.build(map, self);
    }

    public ListAIAgentDialoguesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListAIAgentDialoguesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListAIAgentDialoguesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAIAgentDialoguesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAIAgentDialoguesRequest setRoundLimit(String roundLimit) {
        this.roundLimit = roundLimit;
        return this;
    }
    public String getRoundLimit() {
        return this.roundLimit;
    }

    public ListAIAgentDialoguesRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ListAIAgentDialoguesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
