// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RetrieveKnowledgePointsShrinkRequest extends TeaModel {
    /**
     * <p>The graph objects to focus the search on. You can specify up to 2 unique objects. The objects must be within the current authorized search scope and do not expand permissions.</p>
     */
    @NameInMap("FocusObjects")
    public String focusObjectsShrink;

    /**
     * <p>A list of 1 to 50 unique knowledge base IDs that restricts the search. If you omit this parameter, the operation discovers knowledge bases within the caller’s authorized scope. If you provide IDs, the operation checks access to each knowledge base and the entire request fails if the caller lacks access to any of them.</p>
     */
    @NameInMap("KnowledgeBaseIds")
    public String knowledgeBaseIdsShrink;

    /**
     * <p>The maximum number of hits across all knowledge bases. Default value: 10. Valid values: 1 to 50. This parameter does not specify the quota for each knowledge base or the page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The natural language question. The length cannot exceed 256 Unicode code points after leading and trailing whitespaces are removed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>How is sales revenue calculated, and which tables does it come from?</p>
     */
    @NameInMap("Query")
    public String query;

    public static RetrieveKnowledgePointsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RetrieveKnowledgePointsShrinkRequest self = new RetrieveKnowledgePointsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RetrieveKnowledgePointsShrinkRequest setFocusObjectsShrink(String focusObjectsShrink) {
        this.focusObjectsShrink = focusObjectsShrink;
        return this;
    }
    public String getFocusObjectsShrink() {
        return this.focusObjectsShrink;
    }

    public RetrieveKnowledgePointsShrinkRequest setKnowledgeBaseIdsShrink(String knowledgeBaseIdsShrink) {
        this.knowledgeBaseIdsShrink = knowledgeBaseIdsShrink;
        return this;
    }
    public String getKnowledgeBaseIdsShrink() {
        return this.knowledgeBaseIdsShrink;
    }

    public RetrieveKnowledgePointsShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public RetrieveKnowledgePointsShrinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

}
