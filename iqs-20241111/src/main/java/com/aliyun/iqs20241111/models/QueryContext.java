// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class QueryContext extends TeaModel {
    @NameInMap("originalQuery")
    public QueryContextOriginalQuery originalQuery;

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
        @NameInMap("industry")
        public String industry;

        @NameInMap("page")
        public String page;

        @NameInMap("query")
        public String query;

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
        @NameInMap("enabled")
        public Boolean enabled;

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
