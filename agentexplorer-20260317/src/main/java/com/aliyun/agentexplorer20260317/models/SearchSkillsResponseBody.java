// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentexplorer20260317.models;

import com.aliyun.tea.*;

public class SearchSkillsResponseBody extends TeaModel {
    /**
     * <p>The list of skills returned.</p>
     */
    @NameInMap("data")
    public java.util.List<Skill> data;

    /**
     * <p>The maximum number of entries per page for a paged query. Maximum value: 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The NextToken value, which is used to retrieve more results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAZjtYxxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>53EAEBC0-4DEC-5AF4-AA21-3923D5A819C3</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static SearchSkillsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchSkillsResponseBody self = new SearchSkillsResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchSkillsResponseBody setData(java.util.List<Skill> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Skill> getData() {
        return this.data;
    }

    public SearchSkillsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public SearchSkillsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SearchSkillsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchSkillsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
