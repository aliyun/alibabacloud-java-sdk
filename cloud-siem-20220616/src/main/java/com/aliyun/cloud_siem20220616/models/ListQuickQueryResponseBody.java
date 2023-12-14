// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListQuickQueryResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public ListQuickQueryResponseBodyData data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListQuickQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQuickQueryResponseBody self = new ListQuickQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQuickQueryResponseBody setData(ListQuickQueryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListQuickQueryResponseBodyData getData() {
        return this.data;
    }

    public ListQuickQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListQuickQueryResponseBodyDataQuickQueryList extends TeaModel {
        /**
         * <p>The alias of the saved search.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The query statement corresponding to the saved search.</p>
         */
        @NameInMap("Query")
        public String query;

        /**
         * <p>The name of the saved search.</p>
         */
        @NameInMap("SearchName")
        public String searchName;

        public static ListQuickQueryResponseBodyDataQuickQueryList build(java.util.Map<String, ?> map) throws Exception {
            ListQuickQueryResponseBodyDataQuickQueryList self = new ListQuickQueryResponseBodyDataQuickQueryList();
            return TeaModel.build(map, self);
        }

        public ListQuickQueryResponseBodyDataQuickQueryList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListQuickQueryResponseBodyDataQuickQueryList setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public ListQuickQueryResponseBodyDataQuickQueryList setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

    }

    public static class ListQuickQueryResponseBodyData extends TeaModel {
        /**
         * <p>The number of saved searches per page.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The saved search.</p>
         */
        @NameInMap("QuickQueryList")
        public java.util.List<ListQuickQueryResponseBodyDataQuickQueryList> quickQueryList;

        /**
         * <p>The total number of saved searches that meet the query conditions.</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListQuickQueryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListQuickQueryResponseBodyData self = new ListQuickQueryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListQuickQueryResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListQuickQueryResponseBodyData setQuickQueryList(java.util.List<ListQuickQueryResponseBodyDataQuickQueryList> quickQueryList) {
            this.quickQueryList = quickQueryList;
            return this;
        }
        public java.util.List<ListQuickQueryResponseBodyDataQuickQueryList> getQuickQueryList() {
            return this.quickQueryList;
        }

        public ListQuickQueryResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
