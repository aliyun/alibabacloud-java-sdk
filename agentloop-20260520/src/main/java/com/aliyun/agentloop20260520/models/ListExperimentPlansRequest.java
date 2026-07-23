// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListExperimentPlansRequest extends TeaModel {
    /**
     * <p>The number of entries to return. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>Optional. Use <code>offset</code> and <code>limit</code> for pagination instead.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>Optional. Use <code>offset</code> and <code>limit</code> for pagination instead.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJsYXN0SWQiOjEyM30=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The offset. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("offset")
    public Integer offset;

    /**
     * <p>Fuzzy match by plan name.</p>
     * 
     * <strong>example:</strong>
     * <p>arms_agent</p>
     */
    @NameInMap("planName")
    public String planName;

    /**
     * <p>Filters by exact status.</p>
     * 
     * <strong>example:</strong>
     * <p>pending</p>
     */
    @NameInMap("status")
    public String status;

    public static ListExperimentPlansRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentPlansRequest self = new ListExperimentPlansRequest();
        return TeaModel.build(map, self);
    }

    public ListExperimentPlansRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListExperimentPlansRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListExperimentPlansRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListExperimentPlansRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListExperimentPlansRequest setPlanName(String planName) {
        this.planName = planName;
        return this;
    }
    public String getPlanName() {
        return this.planName;
    }

    public ListExperimentPlansRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
