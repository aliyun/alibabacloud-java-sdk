// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class ListTablePartitionsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListTablePartitionsResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    public static ListTablePartitionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTablePartitionsResponseBody self = new ListTablePartitionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTablePartitionsResponseBody setData(ListTablePartitionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTablePartitionsResponseBodyData getData() {
        return this.data;
    }

    public ListTablePartitionsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListTablePartitionsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListTablePartitionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTablePartitionsResponseBodyDataPagedData extends TeaModel {
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Location")
        public String location;

        @NameInMap("PartitionComment")
        public String partitionComment;

        @NameInMap("PartitionName")
        public String partitionName;

        @NameInMap("PartitionPath")
        public String partitionPath;

        @NameInMap("PartitionType")
        public String partitionType;

        public static ListTablePartitionsResponseBodyDataPagedData build(java.util.Map<String, ?> map) throws Exception {
            ListTablePartitionsResponseBodyDataPagedData self = new ListTablePartitionsResponseBodyDataPagedData();
            return TeaModel.build(map, self);
        }

        public ListTablePartitionsResponseBodyDataPagedData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListTablePartitionsResponseBodyDataPagedData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListTablePartitionsResponseBodyDataPagedData setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListTablePartitionsResponseBodyDataPagedData setPartitionComment(String partitionComment) {
            this.partitionComment = partitionComment;
            return this;
        }
        public String getPartitionComment() {
            return this.partitionComment;
        }

        public ListTablePartitionsResponseBodyDataPagedData setPartitionName(String partitionName) {
            this.partitionName = partitionName;
            return this;
        }
        public String getPartitionName() {
            return this.partitionName;
        }

        public ListTablePartitionsResponseBodyDataPagedData setPartitionPath(String partitionPath) {
            this.partitionPath = partitionPath;
            return this;
        }
        public String getPartitionPath() {
            return this.partitionPath;
        }

        public ListTablePartitionsResponseBodyDataPagedData setPartitionType(String partitionType) {
            this.partitionType = partitionType;
            return this;
        }
        public String getPartitionType() {
            return this.partitionType;
        }

    }

    public static class ListTablePartitionsResponseBodyData extends TeaModel {
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("PagedData")
        public java.util.List<ListTablePartitionsResponseBodyDataPagedData> pagedData;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListTablePartitionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTablePartitionsResponseBodyData self = new ListTablePartitionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTablePartitionsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListTablePartitionsResponseBodyData setPagedData(java.util.List<ListTablePartitionsResponseBodyDataPagedData> pagedData) {
            this.pagedData = pagedData;
            return this;
        }
        public java.util.List<ListTablePartitionsResponseBodyDataPagedData> getPagedData() {
            return this.pagedData;
        }

        public ListTablePartitionsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
