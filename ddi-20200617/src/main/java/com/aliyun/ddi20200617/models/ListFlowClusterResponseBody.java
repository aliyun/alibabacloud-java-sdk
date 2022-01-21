// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListFlowClusterResponseBody extends TeaModel {
    // 集群列表。
    @NameInMap("Clusters")
    public ListFlowClusterResponseBodyClusters clusters;

    // 当前页码，从1开始。
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 分页查询时每页行数。
    @NameInMap("PageSize")
    public Integer pageSize;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 总数。
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListFlowClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowClusterResponseBody self = new ListFlowClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowClusterResponseBody setClusters(ListFlowClusterResponseBodyClusters clusters) {
        this.clusters = clusters;
        return this;
    }
    public ListFlowClusterResponseBodyClusters getClusters() {
        return this.clusters;
    }

    public ListFlowClusterResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFlowClusterResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFlowClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowClusterResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListFlowClusterResponseBodyClustersClusterInfoFailReason extends TeaModel {
        // 错误码。
        @NameInMap("ErrorCode")
        public String errorCode;

        // 错误原因。
        @NameInMap("ErrorMsg")
        public String errorMsg;

        // 请求ID。
        @NameInMap("RequestId")
        public String requestId;

        public static ListFlowClusterResponseBodyClustersClusterInfoFailReason build(java.util.Map<String, ?> map) throws Exception {
            ListFlowClusterResponseBodyClustersClusterInfoFailReason self = new ListFlowClusterResponseBodyClustersClusterInfoFailReason();
            return TeaModel.build(map, self);
        }

        public ListFlowClusterResponseBodyClustersClusterInfoFailReason setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListFlowClusterResponseBodyClustersClusterInfoFailReason setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public ListFlowClusterResponseBodyClustersClusterInfoFailReason setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

    public static class ListFlowClusterResponseBodyClustersClusterInfoOrderTaskInfo extends TeaModel {
        // 当前数量。
        @NameInMap("CurrentCount")
        public Integer currentCount;

        // 订单列表。
        @NameInMap("OrderIdList")
        public String orderIdList;

        // 目标数量。
        @NameInMap("TargetCount")
        public Integer targetCount;

        public static ListFlowClusterResponseBodyClustersClusterInfoOrderTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            ListFlowClusterResponseBodyClustersClusterInfoOrderTaskInfo self = new ListFlowClusterResponseBodyClustersClusterInfoOrderTaskInfo();
            return TeaModel.build(map, self);
        }

        public ListFlowClusterResponseBodyClustersClusterInfoOrderTaskInfo setCurrentCount(Integer currentCount) {
            this.currentCount = currentCount;
            return this;
        }
        public Integer getCurrentCount() {
            return this.currentCount;
        }

        public ListFlowClusterResponseBodyClustersClusterInfoOrderTaskInfo setOrderIdList(String orderIdList) {
            this.orderIdList = orderIdList;
            return this;
        }
        public String getOrderIdList() {
            return this.orderIdList;
        }

        public ListFlowClusterResponseBodyClustersClusterInfoOrderTaskInfo setTargetCount(Integer targetCount) {
            this.targetCount = targetCount;
            return this;
        }
        public Integer getTargetCount() {
            return this.targetCount;
        }

    }

    public static class ListFlowClusterResponseBodyClustersClusterInfo extends TeaModel {
        // 付费类型。PostPaid: 按量付费，PrePaid：包年包月集群。
        @NameInMap("ChargeType")
        public String chargeType;

        // 资源。
        @NameInMap("CreateResource")
        public String createResource;

        // 创建时间。
        @NameInMap("CreateTime")
        public Long createTime;

        // 过期时间。
        @NameInMap("ExpiredTime")
        public Long expiredTime;

        // 集群失败原因。
        @NameInMap("FailReason")
        public ListFlowClusterResponseBodyClustersClusterInfoFailReason failReason;

        // 是否有未完成订单。
        @NameInMap("HasUncompletedOrder")
        public Boolean hasUncompletedOrder;

        // 集群ID。
        @NameInMap("Id")
        public String id;

        // 保留字段。
        @NameInMap("K8sClusterId")
        public String k8sClusterId;

        // 集群名字。
        @NameInMap("Name")
        public String name;

        // 订单列表
        @NameInMap("OrderList")
        public String orderList;

        // 订单任务信息。
        @NameInMap("OrderTaskInfo")
        public ListFlowClusterResponseBodyClustersClusterInfoOrderTaskInfo orderTaskInfo;

        // 包年包月时间（包月数有：1、2、3、4、5、6、7、8、9、12、24、36）。ChargeType=PrePaid 时，必填。
        @NameInMap("Period")
        public Integer period;

        // 运行时间，单位：秒。
        @NameInMap("RunningTime")
        public Integer runningTime;

        // 集群状态。
        @NameInMap("Status")
        public String status;

        // 集群类型。
        @NameInMap("Type")
        public String type;

        public static ListFlowClusterResponseBodyClustersClusterInfo build(java.util.Map<String, ?> map) throws Exception {
            ListFlowClusterResponseBodyClustersClusterInfo self = new ListFlowClusterResponseBodyClustersClusterInfo();
            return TeaModel.build(map, self);
        }

        public ListFlowClusterResponseBodyClustersClusterInfo setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListFlowClusterResponseBodyClustersClusterInfo setCreateResource(String createResource) {
            this.createResource = createResource;
            return this;
        }
        public String getCreateResource() {
            return this.createResource;
        }

        public ListFlowClusterResponseBodyClustersClusterInfo setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListFlowClusterResponseBodyClustersClusterInfo setExpiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        public ListFlowClusterResponseBodyClustersClusterInfo setFailReason(ListFlowClusterResponseBodyClustersClusterInfoFailReason failReason) {
            this.failReason = failReason;
            return this;
        }
        public ListFlowClusterResponseBodyClustersClusterInfoFailReason getFailReason() {
            return this.failReason;
        }

        public ListFlowClusterResponseBodyClustersClusterInfo setHasUncompletedOrder(Boolean hasUncompletedOrder) {
            this.hasUncompletedOrder = hasUncompletedOrder;
            return this;
        }
        public Boolean getHasUncompletedOrder() {
            return this.hasUncompletedOrder;
        }

        public ListFlowClusterResponseBodyClustersClusterInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListFlowClusterResponseBodyClustersClusterInfo setK8sClusterId(String k8sClusterId) {
            this.k8sClusterId = k8sClusterId;
            return this;
        }
        public String getK8sClusterId() {
            return this.k8sClusterId;
        }

        public ListFlowClusterResponseBodyClustersClusterInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFlowClusterResponseBodyClustersClusterInfo setOrderList(String orderList) {
            this.orderList = orderList;
            return this;
        }
        public String getOrderList() {
            return this.orderList;
        }

        public ListFlowClusterResponseBodyClustersClusterInfo setOrderTaskInfo(ListFlowClusterResponseBodyClustersClusterInfoOrderTaskInfo orderTaskInfo) {
            this.orderTaskInfo = orderTaskInfo;
            return this;
        }
        public ListFlowClusterResponseBodyClustersClusterInfoOrderTaskInfo getOrderTaskInfo() {
            return this.orderTaskInfo;
        }

        public ListFlowClusterResponseBodyClustersClusterInfo setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public ListFlowClusterResponseBodyClustersClusterInfo setRunningTime(Integer runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public Integer getRunningTime() {
            return this.runningTime;
        }

        public ListFlowClusterResponseBodyClustersClusterInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFlowClusterResponseBodyClustersClusterInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListFlowClusterResponseBodyClusters extends TeaModel {
        @NameInMap("ClusterInfo")
        public java.util.List<ListFlowClusterResponseBodyClustersClusterInfo> clusterInfo;

        public static ListFlowClusterResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            ListFlowClusterResponseBodyClusters self = new ListFlowClusterResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public ListFlowClusterResponseBodyClusters setClusterInfo(java.util.List<ListFlowClusterResponseBodyClustersClusterInfo> clusterInfo) {
            this.clusterInfo = clusterInfo;
            return this;
        }
        public java.util.List<ListFlowClusterResponseBodyClustersClusterInfo> getClusterInfo() {
            return this.clusterInfo;
        }

    }

}
