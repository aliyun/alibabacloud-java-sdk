// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListFunctionLogResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<ListFunctionLogResponseBodyDataList> dataList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Paginator")
    public ListFunctionLogResponseBodyPaginator paginator;

    public static ListFunctionLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionLogResponseBody self = new ListFunctionLogResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFunctionLogResponseBody setDataList(java.util.List<ListFunctionLogResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<ListFunctionLogResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public ListFunctionLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFunctionLogResponseBody setPaginator(ListFunctionLogResponseBodyPaginator paginator) {
        this.paginator = paginator;
        return this;
    }
    public ListFunctionLogResponseBodyPaginator getPaginator() {
        return this.paginator;
    }

    public static class ListFunctionLogResponseBodyDataList extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Timestamps")
        public java.util.List<String> timestamps;

        @NameInMap("SpaceId")
        public String spaceId;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("FunctionName")
        public String functionName;

        @NameInMap("Contents")
        public java.util.List<String> contents;

        @NameInMap("Levels")
        public java.util.List<String> levels;

        public static ListFunctionLogResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionLogResponseBodyDataList self = new ListFunctionLogResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListFunctionLogResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFunctionLogResponseBodyDataList setTimestamps(java.util.List<String> timestamps) {
            this.timestamps = timestamps;
            return this;
        }
        public java.util.List<String> getTimestamps() {
            return this.timestamps;
        }

        public ListFunctionLogResponseBodyDataList setSpaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }
        public String getSpaceId() {
            return this.spaceId;
        }

        public ListFunctionLogResponseBodyDataList setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListFunctionLogResponseBodyDataList setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public ListFunctionLogResponseBodyDataList setContents(java.util.List<String> contents) {
            this.contents = contents;
            return this;
        }
        public java.util.List<String> getContents() {
            return this.contents;
        }

        public ListFunctionLogResponseBodyDataList setLevels(java.util.List<String> levels) {
            this.levels = levels;
            return this;
        }
        public java.util.List<String> getLevels() {
            return this.levels;
        }

    }

    public static class ListFunctionLogResponseBodyPaginator extends TeaModel {
        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("PageCount")
        public Integer pageCount;

        public static ListFunctionLogResponseBodyPaginator build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionLogResponseBodyPaginator self = new ListFunctionLogResponseBodyPaginator();
            return TeaModel.build(map, self);
        }

        public ListFunctionLogResponseBodyPaginator setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListFunctionLogResponseBodyPaginator setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFunctionLogResponseBodyPaginator setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public ListFunctionLogResponseBodyPaginator setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

    }

}
