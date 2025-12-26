// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datahub20240620.models;

import com.aliyun.tea.*;

public class ListProjectsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dh</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>9892074a2a89600ae4b0d5a34fb99a3f</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Pure")
    public Boolean pure;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Skip")
    public Integer skip;

    public static ListProjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsRequest self = new ListProjectsRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListProjectsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListProjectsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProjectsRequest setPure(Boolean pure) {
        this.pure = pure;
        return this;
    }
    public Boolean getPure() {
        return this.pure;
    }

    public ListProjectsRequest setSkip(Integer skip) {
        this.skip = skip;
        return this;
    }
    public Integer getSkip() {
        return this.skip;
    }

}
