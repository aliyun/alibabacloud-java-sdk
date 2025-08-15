// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListSqlStatementContentsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("sqlStatementContents")
    public ListSqlStatementContentsResponseBodySqlStatementContents sqlStatementContents;

    public static ListSqlStatementContentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSqlStatementContentsResponseBody self = new ListSqlStatementContentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSqlStatementContentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSqlStatementContentsResponseBody setSqlStatementContents(ListSqlStatementContentsResponseBodySqlStatementContents sqlStatementContents) {
        this.sqlStatementContents = sqlStatementContents;
        return this;
    }
    public ListSqlStatementContentsResponseBodySqlStatementContents getSqlStatementContents() {
        return this.sqlStatementContents;
    }

    public static class ListSqlStatementContentsResponseBodySqlStatementContents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[{\&quot;values\&quot;:[\&quot;wj*****\&quot;,\&quot;test\&quot;,\&quot;2025-04-15\&quot;]}]</p>
         */
        @NameInMap("contents")
        public String contents;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("maxResults")
        public Integer maxResults;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("nextToken")
        public String nextToken;

        /**
         * <strong>example:</strong>
         * <p>40000</p>
         */
        @NameInMap("totalCount")
        public Integer totalCount;

        public static ListSqlStatementContentsResponseBodySqlStatementContents build(java.util.Map<String, ?> map) throws Exception {
            ListSqlStatementContentsResponseBodySqlStatementContents self = new ListSqlStatementContentsResponseBodySqlStatementContents();
            return TeaModel.build(map, self);
        }

        public ListSqlStatementContentsResponseBodySqlStatementContents setContents(String contents) {
            this.contents = contents;
            return this;
        }
        public String getContents() {
            return this.contents;
        }

        public ListSqlStatementContentsResponseBodySqlStatementContents setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListSqlStatementContentsResponseBodySqlStatementContents setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListSqlStatementContentsResponseBodySqlStatementContents setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
