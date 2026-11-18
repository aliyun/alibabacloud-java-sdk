// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class QueryContext extends TeaModel {
    /**
     * <p>The initial query condition.</p>
     */
    @NameInMap("originalQuery")
    public QueryContextOriginalQuery originalQuery;

    /**
     * <p>The query rewrite information.</p>
     */
    @NameInMap("rewrite")
    public QueryContextRewrite rewrite;

    public static QueryContext build(java.util.Map<String, ?> map) throws Exception {
        QueryContext self = new QueryContext();
        return TeaModel.build(map, self);
    }

    public QueryContext setOriginalQuery(QueryContextOriginalQuery originalQuery) {
        this.originalQuery = originalQuery;
        return this;
    }
    public QueryContextOriginalQuery getOriginalQuery() {
        return this.originalQuery;
    }

    public QueryContext setRewrite(QueryContextRewrite rewrite) {
        this.rewrite = rewrite;
        return this;
    }
    public QueryContextRewrite getRewrite() {
        return this.rewrite;
    }

    public static class QueryContextOriginalQuery extends TeaModel {
        /**
         * <p>The industry classification of the original request.</p>
         * 
         * <strong>example:</strong>
         * <p>medical</p>
         */
        @NameInMap("industry")
        public String industry;

        /**
         * <p>The page number of the original request.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("page")
        public String page;

        /**
         * <p>The query content of the original request.</p>
         * 
         * <strong>example:</strong>
         * <p>Apsara Conference</p>
         */
        @NameInMap("query")
        public String query;

        /**
         * <p>The time range of the original request. Valid values: OneDay, OneWeek, OneMonth, OneYear, and NoLimit.</p>
         * 
         * <strong>example:</strong>
         * <p>NoLimit</p>
         */
        @NameInMap("timeRange")
        public String timeRange;

        public static QueryContextOriginalQuery build(java.util.Map<String, ?> map) throws Exception {
            QueryContextOriginalQuery self = new QueryContextOriginalQuery();
            return TeaModel.build(map, self);
        }

        public QueryContextOriginalQuery setIndustry(String industry) {
            this.industry = industry;
            return this;
        }
        public String getIndustry() {
            return this.industry;
        }

        public QueryContextOriginalQuery setPage(String page) {
            this.page = page;
            return this;
        }
        public String getPage() {
            return this.page;
        }

        public QueryContextOriginalQuery setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public QueryContextOriginalQuery setTimeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public String getTimeRange() {
            return this.timeRange;
        }

    }

    public static class QueryContextRewrite extends TeaModel {
        /**
         * <p>Specifies whether query rewrite is enabled.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The rewritten time range. An empty value indicates that no rewrite is performed or the rewrite result is the same as the original result.</p>
         * 
         * <strong>example:</strong>
         * <p>OneYear</p>
         */
        @NameInMap("timeRange")
        public String timeRange;

        public static QueryContextRewrite build(java.util.Map<String, ?> map) throws Exception {
            QueryContextRewrite self = new QueryContextRewrite();
            return TeaModel.build(map, self);
        }

        public QueryContextRewrite setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public QueryContextRewrite setTimeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public String getTimeRange() {
            return this.timeRange;
        }

    }

}
