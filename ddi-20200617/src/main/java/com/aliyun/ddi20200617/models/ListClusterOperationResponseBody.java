// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListClusterOperationResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("ClusterOperationList")
    public ListClusterOperationResponseBodyClusterOperationList clusterOperationList;

    public static ListClusterOperationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterOperationResponseBody self = new ListClusterOperationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterOperationResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListClusterOperationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterOperationResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListClusterOperationResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListClusterOperationResponseBody setClusterOperationList(ListClusterOperationResponseBodyClusterOperationList clusterOperationList) {
        this.clusterOperationList = clusterOperationList;
        return this;
    }
    public ListClusterOperationResponseBodyClusterOperationList getClusterOperationList() {
        return this.clusterOperationList;
    }

    public static class ListClusterOperationResponseBodyClusterOperationListClusterOperation extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("OperationName")
        public String operationName;

        @NameInMap("OperationId")
        public String operationId;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Percentage")
        public String percentage;

        public static ListClusterOperationResponseBodyClusterOperationListClusterOperation build(java.util.Map<String, ?> map) throws Exception {
            ListClusterOperationResponseBodyClusterOperationListClusterOperation self = new ListClusterOperationResponseBodyClusterOperationListClusterOperation();
            return TeaModel.build(map, self);
        }

        public ListClusterOperationResponseBodyClusterOperationListClusterOperation setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClusterOperationResponseBodyClusterOperationListClusterOperation setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListClusterOperationResponseBodyClusterOperationListClusterOperation setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListClusterOperationResponseBodyClusterOperationListClusterOperation setOperationName(String operationName) {
            this.operationName = operationName;
            return this;
        }
        public String getOperationName() {
            return this.operationName;
        }

        public ListClusterOperationResponseBodyClusterOperationListClusterOperation setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

        public ListClusterOperationResponseBodyClusterOperationListClusterOperation setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListClusterOperationResponseBodyClusterOperationListClusterOperation setPercentage(String percentage) {
            this.percentage = percentage;
            return this;
        }
        public String getPercentage() {
            return this.percentage;
        }

    }

    public static class ListClusterOperationResponseBodyClusterOperationList extends TeaModel {
        @NameInMap("ClusterOperation")
        public java.util.List<ListClusterOperationResponseBodyClusterOperationListClusterOperation> clusterOperation;

        public static ListClusterOperationResponseBodyClusterOperationList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterOperationResponseBodyClusterOperationList self = new ListClusterOperationResponseBodyClusterOperationList();
            return TeaModel.build(map, self);
        }

        public ListClusterOperationResponseBodyClusterOperationList setClusterOperation(java.util.List<ListClusterOperationResponseBodyClusterOperationListClusterOperation> clusterOperation) {
            this.clusterOperation = clusterOperation;
            return this;
        }
        public java.util.List<ListClusterOperationResponseBodyClusterOperationListClusterOperation> getClusterOperation() {
            return this.clusterOperation;
        }

    }

}
