// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListFlowClusterAllResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Clusters")
    public ListFlowClusterAllResponseBodyClusters clusters;

    public static ListFlowClusterAllResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowClusterAllResponseBody self = new ListFlowClusterAllResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowClusterAllResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFlowClusterAllResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowClusterAllResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFlowClusterAllResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListFlowClusterAllResponseBody setClusters(ListFlowClusterAllResponseBodyClusters clusters) {
        this.clusters = clusters;
        return this;
    }
    public ListFlowClusterAllResponseBodyClusters getClusters() {
        return this.clusters;
    }

    public static class ListFlowClusterAllResponseBodyClustersClusterInfoOrderTaskInfo extends TeaModel {
        @NameInMap("TargetCount")
        public Integer targetCount;

        @NameInMap("CurrentCount")
        public Integer currentCount;

        @NameInMap("OrderIdList")
        public String orderIdList;

        public static ListFlowClusterAllResponseBodyClustersClusterInfoOrderTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            ListFlowClusterAllResponseBodyClustersClusterInfoOrderTaskInfo self = new ListFlowClusterAllResponseBodyClustersClusterInfoOrderTaskInfo();
            return TeaModel.build(map, self);
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfoOrderTaskInfo setTargetCount(Integer targetCount) {
            this.targetCount = targetCount;
            return this;
        }
        public Integer getTargetCount() {
            return this.targetCount;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfoOrderTaskInfo setCurrentCount(Integer currentCount) {
            this.currentCount = currentCount;
            return this;
        }
        public Integer getCurrentCount() {
            return this.currentCount;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfoOrderTaskInfo setOrderIdList(String orderIdList) {
            this.orderIdList = orderIdList;
            return this;
        }
        public String getOrderIdList() {
            return this.orderIdList;
        }

    }

    public static class ListFlowClusterAllResponseBodyClustersClusterInfoFailReason extends TeaModel {
        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ErrorCode")
        public String errorCode;

        public static ListFlowClusterAllResponseBodyClustersClusterInfoFailReason build(java.util.Map<String, ?> map) throws Exception {
            ListFlowClusterAllResponseBodyClustersClusterInfoFailReason self = new ListFlowClusterAllResponseBodyClustersClusterInfoFailReason();
            return TeaModel.build(map, self);
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfoFailReason setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfoFailReason setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfoFailReason setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

    }

    public static class ListFlowClusterAllResponseBodyClustersClusterInfo extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Status")
        public String status;

        @NameInMap("RunningTime")
        public Integer runningTime;

        @NameInMap("OrderList")
        public String orderList;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("Period")
        public Integer period;

        @NameInMap("K8sClusterId")
        public String k8sClusterId;

        @NameInMap("ExpiredTime")
        public Long expiredTime;

        @NameInMap("HasUncompletedOrder")
        public Boolean hasUncompletedOrder;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        @NameInMap("CreateResource")
        public String createResource;

        @NameInMap("OrderTaskInfo")
        public ListFlowClusterAllResponseBodyClustersClusterInfoOrderTaskInfo orderTaskInfo;

        @NameInMap("FailReason")
        public ListFlowClusterAllResponseBodyClustersClusterInfoFailReason failReason;

        public static ListFlowClusterAllResponseBodyClustersClusterInfo build(java.util.Map<String, ?> map) throws Exception {
            ListFlowClusterAllResponseBodyClustersClusterInfo self = new ListFlowClusterAllResponseBodyClustersClusterInfo();
            return TeaModel.build(map, self);
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfo setRunningTime(Integer runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public Integer getRunningTime() {
            return this.runningTime;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfo setOrderList(String orderList) {
            this.orderList = orderList;
            return this;
        }
        public String getOrderList() {
            return this.orderList;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfo setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfo setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfo setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfo setK8sClusterId(String k8sClusterId) {
            this.k8sClusterId = k8sClusterId;
            return this;
        }
        public String getK8sClusterId() {
            return this.k8sClusterId;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfo setExpiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfo setHasUncompletedOrder(Boolean hasUncompletedOrder) {
            this.hasUncompletedOrder = hasUncompletedOrder;
            return this;
        }
        public Boolean getHasUncompletedOrder() {
            return this.hasUncompletedOrder;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfo setCreateResource(String createResource) {
            this.createResource = createResource;
            return this;
        }
        public String getCreateResource() {
            return this.createResource;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfo setOrderTaskInfo(ListFlowClusterAllResponseBodyClustersClusterInfoOrderTaskInfo orderTaskInfo) {
            this.orderTaskInfo = orderTaskInfo;
            return this;
        }
        public ListFlowClusterAllResponseBodyClustersClusterInfoOrderTaskInfo getOrderTaskInfo() {
            return this.orderTaskInfo;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfo setFailReason(ListFlowClusterAllResponseBodyClustersClusterInfoFailReason failReason) {
            this.failReason = failReason;
            return this;
        }
        public ListFlowClusterAllResponseBodyClustersClusterInfoFailReason getFailReason() {
            return this.failReason;
        }

    }

    public static class ListFlowClusterAllResponseBodyClusters extends TeaModel {
        @NameInMap("ClusterInfo")
        public java.util.List<ListFlowClusterAllResponseBodyClustersClusterInfo> clusterInfo;

        public static ListFlowClusterAllResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            ListFlowClusterAllResponseBodyClusters self = new ListFlowClusterAllResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public ListFlowClusterAllResponseBodyClusters setClusterInfo(java.util.List<ListFlowClusterAllResponseBodyClustersClusterInfo> clusterInfo) {
            this.clusterInfo = clusterInfo;
            return this;
        }
        public java.util.List<ListFlowClusterAllResponseBodyClustersClusterInfo> getClusterInfo() {
            return this.clusterInfo;
        }

    }

}
