// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListMemoryRulesRequest extends TeaModel {
    /**
     * <p>Filters by the enabled status.</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>nameLike</p>
     * 
     * <strong>example:</strong>
     * <p>Preference</p>
     */
    @NameInMap("nameLike")
    public String nameLike;

    /**
     * <p>The pagination token returned for the same resource and filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjIwMH0=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListMemoryRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMemoryRulesRequest self = new ListMemoryRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListMemoryRulesRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public ListMemoryRulesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMemoryRulesRequest setNameLike(String nameLike) {
        this.nameLike = nameLike;
        return this;
    }
    public String getNameLike() {
        return this.nameLike;
    }

    public ListMemoryRulesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
