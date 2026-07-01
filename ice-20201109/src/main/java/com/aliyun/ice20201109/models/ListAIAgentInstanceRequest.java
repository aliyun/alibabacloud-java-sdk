// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAIAgentInstanceRequest extends TeaModel {
    /**
     * <p>Agent ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4***</p>
     */
    @NameInMap("AIAgentId")
    public String AIAgentId;

    /**
     * <p>End time of the query in ISO 8601 format. No default value.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-02T00:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Page number. Default is 1. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>Number of results per page. Default is 10. Valid values: 0 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>Start time of the query in ISO 8601 format. No default value.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-01T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ListAIAgentInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAIAgentInstanceRequest self = new ListAIAgentInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ListAIAgentInstanceRequest setAIAgentId(String AIAgentId) {
        this.AIAgentId = AIAgentId;
        return this;
    }
    public String getAIAgentId() {
        return this.AIAgentId;
    }

    public ListAIAgentInstanceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListAIAgentInstanceRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAIAgentInstanceRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAIAgentInstanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
