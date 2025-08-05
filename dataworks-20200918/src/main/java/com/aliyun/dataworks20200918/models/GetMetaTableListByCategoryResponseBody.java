// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetMetaTableListByCategoryResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetMetaTableListByCategoryResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetMetaTableListByCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableListByCategoryResponseBody self = new GetMetaTableListByCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaTableListByCategoryResponseBody setData(GetMetaTableListByCategoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMetaTableListByCategoryResponseBodyData getData() {
        return this.data;
    }

    public GetMetaTableListByCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMetaTableListByCategoryResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TableGuidList")
        public java.util.List<String> tableGuidList;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetMetaTableListByCategoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableListByCategoryResponseBodyData self = new GetMetaTableListByCategoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMetaTableListByCategoryResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetMetaTableListByCategoryResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetMetaTableListByCategoryResponseBodyData setTableGuidList(java.util.List<String> tableGuidList) {
            this.tableGuidList = tableGuidList;
            return this;
        }
        public java.util.List<String> getTableGuidList() {
            return this.tableGuidList;
        }

        public GetMetaTableListByCategoryResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
