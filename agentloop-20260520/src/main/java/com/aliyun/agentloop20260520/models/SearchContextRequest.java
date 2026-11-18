// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class SearchContextRequest extends TeaModel {
    /**
     * <p>The structured filter conditions. The experience store supports scene. When __agentloopControl.mode is set to direct, hybrid, or agentic, multi-strategy recall with auditing is used, and you can pass source, callId, application, fields, channels, and budget simultaneously. The management plane can additionally pass contentStatus=all, active, candidate, gray, or deprecated to perform content retrieval, which includes disabled or unreviewed content and is not affected by store-level runtime switches. The API key runtime entry prohibits contentStatus and retains the original governance thresholds. The maximum value of timeoutMs is 60000. If mode is not passed, the existing semantics of fields, channels, minQualityScore, expansion, and debug are retained. When query is *, you can use includeCandidates, cursor, and offset to browse experiences (management plane only).</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;scene&quot;:&quot;incident-recovery&quot;,&quot;__agentloopControl&quot;:{&quot;fields&quot;:[&quot;when_to_use&quot;,&quot;summary&quot;],&quot;channels&quot;:[&quot;vector&quot;,&quot;fulltext&quot;],&quot;minQualityScore&quot;:0.6,&quot;expansion&quot;:false,&quot;debug&quot;:true}}</p>
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
     * <p>Specifies whether to include memories with sourceState set to inactive. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("includeInactive")
    public Boolean includeInactive;

    /**
     * <p>The maximum number of returned results (Top-N similarity).</p>
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
     * <p>Recent user preference settings</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>The retrieval options. The experience store supports normal and reranker (deterministic reranking). The memory store uses its own retrieval strategy. For real-time recall in the experience store, the limit ranges from 1 to 20.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("retrievalOption")
    public String retrievalOption;

    /**
     * <p>The recall scope. If this field conflicts with a field of the same name in filter, a 400 ScopeFilterConflict error is returned.</p>
     */
    @NameInMap("scope")
    public SearchContextRequestScope scope;

    /**
     * <p>Filters results by extraction strategy IDs. The conditions in the list are combined by using the OR operator. If this parameter is not passed, all strategies are recalled. An empty list returns a 400 error. If the format is valid but no matching IDs are found, an empty result is returned. Historical removed strategy IDs are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;preferences&quot;,&quot;profile&quot;]</p>
     */
    @NameInMap("strategyIds")
    public java.util.List<String> strategyIds;

    /**
     * <p>The similarity threshold. Results with a score lower than this value are filtered out. Valid values: 0 to 1.</p>
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
         * <p>The ID of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>sales-copilot</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>crm-service</p>
         */
        @NameInMap("appId")
        public String appId;

        /**
         * <p>The ID of the run.</p>
         * 
         * <strong>example:</strong>
         * <p>run-001</p>
         */
        @NameInMap("runId")
        public String runId;

        /**
         * <p>The ID of the user.</p>
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
