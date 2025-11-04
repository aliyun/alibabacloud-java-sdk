// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAIAgentDialoguesRequest extends TeaModel {
    /**
     * <p>Specify the end of the time range to query using a UNIX timestamp accurate to milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>17358082464030</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The sorting order. Valid values: </p>
     * <ul>
     * <li>DESC: descending order (default)</li>
     * <li>ASC: ascending order</li>
     * </ul>
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
     * <p>The number of entries per page. Default value: 20. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

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
     * <p>Specify the start of the time range to query using a UNIX timestamp accurate to milliseconds.</p>
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
