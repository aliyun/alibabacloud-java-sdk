// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListFileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Paginator")
    public ListFileResponseBodyPaginator paginator;

    @NameInMap("DataList")
    public java.util.List<ListFileResponseBodyDataList> dataList;

    public static ListFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFileResponseBody self = new ListFileResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFileResponseBody setPaginator(ListFileResponseBodyPaginator paginator) {
        this.paginator = paginator;
        return this;
    }
    public ListFileResponseBodyPaginator getPaginator() {
        return this.paginator;
    }

    public ListFileResponseBody setDataList(java.util.List<ListFileResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<ListFileResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public static class ListFileResponseBodyPaginator extends TeaModel {
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("PageCount")
        public Integer pageCount;

        public static ListFileResponseBodyPaginator build(java.util.Map<String, ?> map) throws Exception {
            ListFileResponseBodyPaginator self = new ListFileResponseBodyPaginator();
            return TeaModel.build(map, self);
        }

        public ListFileResponseBodyPaginator setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListFileResponseBodyPaginator setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFileResponseBodyPaginator setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public ListFileResponseBodyPaginator setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

    }

    public static class ListFileResponseBodyDataList extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Url")
        public String url;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static ListFileResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListFileResponseBodyDataList self = new ListFileResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListFileResponseBodyDataList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListFileResponseBodyDataList setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ListFileResponseBodyDataList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListFileResponseBodyDataList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ListFileResponseBodyDataList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListFileResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFileResponseBodyDataList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
