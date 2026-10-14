// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListOptimizeRunsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg5MA==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The status used to filter results.</p>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The lower bound of the window start time in UNIX seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1786432688000</p>
     */
    @NameInMap("windowStartTimeBegin")
    public Long windowStartTimeBegin;

    /**
     * <p>The upper bound of the window start time in UNIX seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1786432690000</p>
     */
    @NameInMap("windowStartTimeEnd")
    public Long windowStartTimeEnd;

    public static ListOptimizeRunsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOptimizeRunsRequest self = new ListOptimizeRunsRequest();
        return TeaModel.build(map, self);
    }

    public ListOptimizeRunsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListOptimizeRunsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOptimizeRunsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListOptimizeRunsRequest setWindowStartTimeBegin(Long windowStartTimeBegin) {
        this.windowStartTimeBegin = windowStartTimeBegin;
        return this;
    }
    public Long getWindowStartTimeBegin() {
        return this.windowStartTimeBegin;
    }

    public ListOptimizeRunsRequest setWindowStartTimeEnd(Long windowStartTimeEnd) {
        this.windowStartTimeEnd = windowStartTimeEnd;
        return this;
    }
    public Long getWindowStartTimeEnd() {
        return this.windowStartTimeEnd;
    }

}
