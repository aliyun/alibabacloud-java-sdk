// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateResourcesByAdvancedSearchResponseBody extends TeaModel {
    /**
     * <p>The result of the request.</p>
     */
    @NameInMap("QueryResults")
    public ListAggregateResourcesByAdvancedSearchResponseBodyQueryResults queryResults;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAggregateResourcesByAdvancedSearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateResourcesByAdvancedSearchResponseBody self = new ListAggregateResourcesByAdvancedSearchResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAggregateResourcesByAdvancedSearchResponseBody setQueryResults(ListAggregateResourcesByAdvancedSearchResponseBodyQueryResults queryResults) {
        this.queryResults = queryResults;
        return this;
    }
    public ListAggregateResourcesByAdvancedSearchResponseBodyQueryResults getQueryResults() {
        return this.queryResults;
    }

    public ListAggregateResourcesByAdvancedSearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAggregateResourcesByAdvancedSearchResponseBodyQueryResultsQueryResultList extends TeaModel {
        /**
         * <p>The field names.</p>
         */
        @NameInMap("Columns")
        public java.util.List<String> columns;

        /**
         * <p>The resource data.</p>
         */
        @NameInMap("Values")
        public java.util.List<?> values;

        public static ListAggregateResourcesByAdvancedSearchResponseBodyQueryResultsQueryResultList build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateResourcesByAdvancedSearchResponseBodyQueryResultsQueryResultList self = new ListAggregateResourcesByAdvancedSearchResponseBodyQueryResultsQueryResultList();
            return TeaModel.build(map, self);
        }

        public ListAggregateResourcesByAdvancedSearchResponseBodyQueryResultsQueryResultList setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public ListAggregateResourcesByAdvancedSearchResponseBodyQueryResultsQueryResultList setValues(java.util.List<?> values) {
            this.values = values;
            return this;
        }
        public java.util.List<?> getValues() {
            return this.values;
        }

    }

    public static class ListAggregateResourcesByAdvancedSearchResponseBodyQueryResults extends TeaModel {
        /**
         * <p>The queried resources. A maximum of 1,000 data records can be returned. To view more data, use the download URL of the resource file.</p>
         */
        @NameInMap("QueryResultList")
        public ListAggregateResourcesByAdvancedSearchResponseBodyQueryResultsQueryResultList queryResultList;

        public static ListAggregateResourcesByAdvancedSearchResponseBodyQueryResults build(java.util.Map<String, ?> map) throws Exception {
            ListAggregateResourcesByAdvancedSearchResponseBodyQueryResults self = new ListAggregateResourcesByAdvancedSearchResponseBodyQueryResults();
            return TeaModel.build(map, self);
        }

        public ListAggregateResourcesByAdvancedSearchResponseBodyQueryResults setQueryResultList(ListAggregateResourcesByAdvancedSearchResponseBodyQueryResultsQueryResultList queryResultList) {
            this.queryResultList = queryResultList;
            return this;
        }
        public ListAggregateResourcesByAdvancedSearchResponseBodyQueryResultsQueryResultList getQueryResultList() {
            return this.queryResultList;
        }

    }

}
