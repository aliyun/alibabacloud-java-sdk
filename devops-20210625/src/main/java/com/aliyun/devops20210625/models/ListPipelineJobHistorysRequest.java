// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListPipelineJobHistorysRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("identifier")
    public String identifier;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    public static ListPipelineJobHistorysRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineJobHistorysRequest self = new ListPipelineJobHistorysRequest();
        return TeaModel.build(map, self);
    }

    public ListPipelineJobHistorysRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListPipelineJobHistorysRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public ListPipelineJobHistorysRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListPipelineJobHistorysRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
