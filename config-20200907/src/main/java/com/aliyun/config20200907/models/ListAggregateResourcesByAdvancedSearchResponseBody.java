// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateResourcesByAdvancedSearchResponseBody extends TeaModel {
    @NameInMap("QueryResults")
    public ListAggregateResourcesByAdvancedSearchResponseBodyQueryResults queryResults;

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
        @NameInMap("Columns")
        public java.util.List<String> columns;

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
