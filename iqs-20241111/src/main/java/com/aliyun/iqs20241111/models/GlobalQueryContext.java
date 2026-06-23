// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class GlobalQueryContext extends TeaModel {
    /**
     * <p>The initial query condition.</p>
     */
    @NameInMap("originalQuery")
    public GlobalQueryContextOriginalQuery originalQuery;

    public static GlobalQueryContext build(java.util.Map<String, ?> map) throws Exception {
        GlobalQueryContext self = new GlobalQueryContext();
        return TeaModel.build(map, self);
    }

    public GlobalQueryContext setOriginalQuery(GlobalQueryContextOriginalQuery originalQuery) {
        this.originalQuery = originalQuery;
        return this;
    }
    public GlobalQueryContextOriginalQuery getOriginalQuery() {
        return this.originalQuery;
    }

    public static class GlobalQueryContextOriginalQuery extends TeaModel {
        /**
         * <p>页码</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("page")
        public String page;

        /**
         * <p>查询关键字</p>
         * 
         * <strong>example:</strong>
         * <p>特朗普关税最新消息</p>
         */
        @NameInMap("query")
        public String query;

        /**
         * <p>时间范围</p>
         * 
         * <strong>example:</strong>
         * <p>NoLimit</p>
         */
        @NameInMap("timeRange")
        public String timeRange;

        public static GlobalQueryContextOriginalQuery build(java.util.Map<String, ?> map) throws Exception {
            GlobalQueryContextOriginalQuery self = new GlobalQueryContextOriginalQuery();
            return TeaModel.build(map, self);
        }

        public GlobalQueryContextOriginalQuery setPage(String page) {
            this.page = page;
            return this;
        }
        public String getPage() {
            return this.page;
        }

        public GlobalQueryContextOriginalQuery setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public GlobalQueryContextOriginalQuery setTimeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public String getTimeRange() {
            return this.timeRange;
        }

    }

}
