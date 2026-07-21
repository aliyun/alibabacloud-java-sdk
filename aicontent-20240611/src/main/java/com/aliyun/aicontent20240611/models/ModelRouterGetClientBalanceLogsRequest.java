// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterGetClientBalanceLogsRequest extends TeaModel {
    /**
     * <p>Filters the logs by change type. Valid values: auto_deduct, deduct, and recharge.</p>
     * 
     * <strong>example:</strong>
     * <p>recharge</p>
     */
    @NameInMap("changeType")
    public String changeType;

    /**
     * <p>The maximum number of entries to return.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The number of entries to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("size")
    public Integer size;

    public static ModelRouterGetClientBalanceLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterGetClientBalanceLogsRequest self = new ModelRouterGetClientBalanceLogsRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterGetClientBalanceLogsRequest setChangeType(String changeType) {
        this.changeType = changeType;
        return this;
    }
    public String getChangeType() {
        return this.changeType;
    }

    public ModelRouterGetClientBalanceLogsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ModelRouterGetClientBalanceLogsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ModelRouterGetClientBalanceLogsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ModelRouterGetClientBalanceLogsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
