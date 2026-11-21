// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class SearchContextRequest extends TeaModel {
    /**
     * <p>The filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;metadata.serviceName&quot;:&quot;sls-sop-daily&quot;,&quot;metadata.taskType&quot;:{&quot;in&quot;:[&quot;troubleshooting&quot;,&quot;knowledge_retrieval&quot;]}}</p>
     */
    @NameInMap("filter")
    public java.util.Map<String, ?> filter;

    /**
     * <p>Specifies whether to format the output.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("formatted")
    public Boolean formatted;

    /**
     * <p>The maximum number of results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The query content.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>How is the cost for consuming SLS logs in Flink calculated?</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>The retrieval options.</p>
     * 
     * <strong>example:</strong>
     * <p>reranker,llm_rank</p>
     */
    @NameInMap("retrievalOption")
    public String retrievalOption;

    /**
     * <p>The similarity threshold.</p>
     * 
     * <strong>example:</strong>
     * <p>0.3</p>
     */
    @NameInMap("threshold")
    public Double threshold;

    public static SearchContextRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchContextRequest self = new SearchContextRequest();
        return TeaModel.build(map, self);
    }

    public SearchContextRequest setFilter(java.util.Map<String, ?> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.Map<String, ?> getFilter() {
        return this.filter;
    }

    public SearchContextRequest setFormatted(Boolean formatted) {
        this.formatted = formatted;
        return this;
    }
    public Boolean getFormatted() {
        return this.formatted;
    }

    public SearchContextRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public SearchContextRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public SearchContextRequest setRetrievalOption(String retrievalOption) {
        this.retrievalOption = retrievalOption;
        return this;
    }
    public String getRetrievalOption() {
        return this.retrievalOption;
    }

    public SearchContextRequest setThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }
    public Double getThreshold() {
        return this.threshold;
    }

}
