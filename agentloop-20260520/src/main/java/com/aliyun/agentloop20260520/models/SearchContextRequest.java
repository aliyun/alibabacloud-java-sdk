// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class SearchContextRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;userId&quot;:&quot;alice&quot;}</p>
     */
    @NameInMap("filter")
    public java.util.Map<String, ?> filter;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("formatted")
    public Boolean formatted;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>用户最近的偏好设置</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <strong>example:</strong>
     * <p>semantic</p>
     */
    @NameInMap("retrievalOption")
    public String retrievalOption;

    /**
     * <strong>example:</strong>
     * <p>0.5</p>
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
