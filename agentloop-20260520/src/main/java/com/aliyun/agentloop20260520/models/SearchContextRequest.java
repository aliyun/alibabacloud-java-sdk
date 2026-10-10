// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class SearchContextRequest extends TeaModel {
    /**
     * <p>The structured filter conditions. The key is the field name, and the value is the expected matching value.</p>
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
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("includeInactive")
    public Boolean includeInactive;

    /**
     * <p>The maximum number of returned results (similarity Top-N).</p>
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
     * <p>用户最近的偏好设置</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>The retrieval options that control the retrieval strategy.</p>
     * 
     * <strong>example:</strong>
     * <p>semantic</p>
     */
    @NameInMap("retrievalOption")
    public String retrievalOption;

    @NameInMap("scope")
    public SearchContextRequestScope scope;

    /**
     * <p>The similarity threshold. Results with a similarity score lower than this value are filtered out. Valid values: 0 to 1.</p>
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

    public SearchContextRequest setThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }
    public Double getThreshold() {
        return this.threshold;
    }

    public static class SearchContextRequestScope extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>sales-copilot</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <strong>example:</strong>
         * <p>crm-service</p>
         */
        @NameInMap("appId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>run-001</p>
         */
        @NameInMap("runId")
        public String runId;

        /**
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
