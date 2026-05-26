// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentexplorer20260317.models;

import com.aliyun.tea.*;

public class SearchSkillsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>compute.serverless,network</p>
     */
    @NameInMap("categoryCode")
    public String categoryCode;

    /**
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAZjtYxxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("skip")
    public Integer skip;

    public static SearchSkillsRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchSkillsRequest self = new SearchSkillsRequest();
        return TeaModel.build(map, self);
    }

    public SearchSkillsRequest setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }
    public String getCategoryCode() {
        return this.categoryCode;
    }

    public SearchSkillsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public SearchSkillsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public SearchSkillsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SearchSkillsRequest setSkip(Integer skip) {
        this.skip = skip;
        return this;
    }
    public Integer getSkip() {
        return this.skip;
    }

}
