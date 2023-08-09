// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListResourcesByAdvancedSearchResponseBody extends TeaModel {
    @NameInMap("QueryResults")
    public ListResourcesByAdvancedSearchResponseBodyQueryResults queryResults;

    @NameInMap("RequestId")
    public String requestId;

    public static ListResourcesByAdvancedSearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesByAdvancedSearchResponseBody self = new ListResourcesByAdvancedSearchResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourcesByAdvancedSearchResponseBody setQueryResults(ListResourcesByAdvancedSearchResponseBodyQueryResults queryResults) {
        this.queryResults = queryResults;
        return this;
    }
    public ListResourcesByAdvancedSearchResponseBodyQueryResults getQueryResults() {
        return this.queryResults;
    }

    public ListResourcesByAdvancedSearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListResourcesByAdvancedSearchResponseBodyQueryResultsQueryResultList extends TeaModel {
        @NameInMap("Columns")
        public java.util.List<String> columns;

        @NameInMap("Values")
        public java.util.List<?> values;

        public static ListResourcesByAdvancedSearchResponseBodyQueryResultsQueryResultList build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesByAdvancedSearchResponseBodyQueryResultsQueryResultList self = new ListResourcesByAdvancedSearchResponseBodyQueryResultsQueryResultList();
            return TeaModel.build(map, self);
        }

        public ListResourcesByAdvancedSearchResponseBodyQueryResultsQueryResultList setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public ListResourcesByAdvancedSearchResponseBodyQueryResultsQueryResultList setValues(java.util.List<?> values) {
            this.values = values;
            return this;
        }
        public java.util.List<?> getValues() {
            return this.values;
        }

    }

    public static class ListResourcesByAdvancedSearchResponseBodyQueryResults extends TeaModel {
        @NameInMap("QueryResultList")
        public ListResourcesByAdvancedSearchResponseBodyQueryResultsQueryResultList queryResultList;

        public static ListResourcesByAdvancedSearchResponseBodyQueryResults build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesByAdvancedSearchResponseBodyQueryResults self = new ListResourcesByAdvancedSearchResponseBodyQueryResults();
            return TeaModel.build(map, self);
        }

        public ListResourcesByAdvancedSearchResponseBodyQueryResults setQueryResultList(ListResourcesByAdvancedSearchResponseBodyQueryResultsQueryResultList queryResultList) {
            this.queryResultList = queryResultList;
            return this;
        }
        public ListResourcesByAdvancedSearchResponseBodyQueryResultsQueryResultList getQueryResultList() {
            return this.queryResultList;
        }

    }

}
