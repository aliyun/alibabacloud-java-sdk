// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListFileResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<ListFileResponseBodyDataList> dataList;

    @NameInMap("Paginator")
    public ListFileResponseBodyPaginator paginator;

    @NameInMap("RequestId")
    public String requestId;

    public static ListFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFileResponseBody self = new ListFileResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFileResponseBody setDataList(java.util.List<ListFileResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<ListFileResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public ListFileResponseBody setPaginator(ListFileResponseBodyPaginator paginator) {
        this.paginator = paginator;
        return this;
    }
    public ListFileResponseBodyPaginator getPaginator() {
        return this.paginator;
    }

    public ListFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFileResponseBodyDataList extends TeaModel {
        @NameInMap("AuthDelta")
        public Integer authDelta;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Type")
        public String type;

        @NameInMap("Url")
        public String url;

        public static ListFileResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListFileResponseBodyDataList self = new ListFileResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListFileResponseBodyDataList setAuthDelta(Integer authDelta) {
            this.authDelta = authDelta;
            return this;
        }
        public Integer getAuthDelta() {
            return this.authDelta;
        }

        public ListFileResponseBodyDataList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListFileResponseBodyDataList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListFileResponseBodyDataList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListFileResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFileResponseBodyDataList setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ListFileResponseBodyDataList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListFileResponseBodyDataList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListFileResponseBodyPaginator extends TeaModel {
        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListFileResponseBodyPaginator build(java.util.Map<String, ?> map) throws Exception {
            ListFileResponseBodyPaginator self = new ListFileResponseBodyPaginator();
            return TeaModel.build(map, self);
        }

        public ListFileResponseBodyPaginator setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListFileResponseBodyPaginator setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
