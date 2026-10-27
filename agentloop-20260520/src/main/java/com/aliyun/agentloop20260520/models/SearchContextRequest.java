// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class SearchContextRequest extends TeaModel {
    /**
     * <p>The structured filter conditions. The key is the field name, and the value is the expected match value.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;userId&quot;:&quot;alice&quot;}</p>
     */
    @NameInMap("filter")
    public java.util.Map<String, ?> filter;

    /**
     * <p>Specifies whether to apply structured formatting to the returned results.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("formatted")
    public Boolean formatted;

    /**
     * <p>Specifies whether to include memories whose sourceState is inactive. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("includeInactive")
    public Boolean includeInactive;

    /**
     * <p>The maximum number of returned results, which corresponds to the top N results by similarity.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The retrieval query text. Natural language is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Recent user preferences</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>The retrieval options used to control the retrieval strategy.</p>
     * 
     * <strong>example:</strong>
     * <p>semantic</p>
     */
    @NameInMap("retrievalOption")
    public String retrievalOption;

    /**
     * <p>The recall scope. If a field with the same name conflicts with the filter, a 400 ScopeFilterConflict error is returned.</p>
     */
    @NameInMap("scope")
    public SearchContextRequestScope scope;

    /**
     * <p>Filters results by extraction strategy ID. Multiple IDs in the list are evaluated with an OR condition. If this parameter is not specified, all strategies are recalled. An empty list returns a 400 error. If the format is valid but no matching IDs are found, an empty result is returned. IDs of historically removed strategies are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;preferences&quot;,&quot;profile&quot;]</p>
     */
    @NameInMap("strategyIds")
    public java.util.List<String> strategyIds;

    /**
     * <p>The similarity threshold. Results with a similarity score below this value are filtered out. Valid values: 0 to 1.</p>
     * 
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

    public SearchContextRequest setIncludeInactive(Boolean includeInactive) {
        this.includeInactive = includeInactive;
        return this;
    }
    public Boolean getIncludeInactive() {
        return this.includeInactive;
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

    public SearchContextRequest setScope(SearchContextRequestScope scope) {
        this.scope = scope;
        return this;
    }
    public SearchContextRequestScope getScope() {
        return this.scope;
    }

    public SearchContextRequest setStrategyIds(java.util.List<String> strategyIds) {
        this.strategyIds = strategyIds;
        return this;
    }
    public java.util.List<String> getStrategyIds() {
        return this.strategyIds;
    }

    public SearchContextRequest setThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }
    public Double getThreshold() {
        return this.threshold;
    }

    public static class SearchContextRequestScope extends TeaModel {
        /**
         * <p>Agent Id</p>
         * 
         * <strong>example:</strong>
         * <p>sales-copilot</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>crm-service</p>
         */
        @NameInMap("appId")
        public String appId;

        /**
         * <p>The run ID.</p>
         * 
         * <strong>example:</strong>
         * <p>run-001</p>
         */
        @NameInMap("runId")
        public String runId;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>u-10001</p>
         */
        @NameInMap("userId")
        public String userId;

        public static SearchContextRequestScope build(java.util.Map<String, ?> map) throws Exception {
            SearchContextRequestScope self = new SearchContextRequestScope();
            return TeaModel.build(map, self);
        }

        public SearchContextRequestScope setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public SearchContextRequestScope setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public SearchContextRequestScope setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public SearchContextRequestScope setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
