// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListFlowClusterAllResponseBody extends TeaModel {
    // 集群列表。
    @NameInMap("Clusters")
    public ListFlowClusterAllResponseBodyClusters clusters;

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

    public static ListFlowClusterAllResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowClusterAllResponseBody self = new ListFlowClusterAllResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowClusterAllResponseBody setClusters(ListFlowClusterAllResponseBodyClusters clusters) {
        this.clusters = clusters;
        return this;
    }
    public ListFlowClusterAllResponseBodyClusters getClusters() {
        return this.clusters;
    }

    public ListFlowClusterAllResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public ListFlowClusterAllResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListFlowClusterAllResponseBodyClustersClusterInfoFailReason extends TeaModel {
        // 错误码。
        @NameInMap("ErrorCode")
        public String errorCode;

        // 错误原因。
        @NameInMap("ErrorMsg")
        public String errorMsg;

        // 请求ID。
        @NameInMap("RequestId")
        public String requestId;

        public static ListFlowClusterAllResponseBodyClustersClusterInfoFailReason build(java.util.Map<String, ?> map) throws Exception {
            ListFlowClusterAllResponseBodyClustersClusterInfoFailReason self = new ListFlowClusterAllResponseBodyClustersClusterInfoFailReason();
            return TeaModel.build(map, self);
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfoFailReason setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
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

    }

    public static class ListFlowClusterAllResponseBodyClustersClusterInfoOrderTaskInfo extends TeaModel {
        // 当前数量。
        @NameInMap("CurrentCount")
        public Integer currentCount;

        // 订单列表。
        @NameInMap("OrderIdList")
        public String orderIdList;

        // 目标数量。
        @NameInMap("TargetCount")
        public Integer targetCount;

        public static ListFlowClusterAllResponseBodyClustersClusterInfoOrderTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            ListFlowClusterAllResponseBodyClustersClusterInfoOrderTaskInfo self = new ListFlowClusterAllResponseBodyClustersClusterInfoOrderTaskInfo();
            return TeaModel.build(map, self);
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

        public ListFlowClusterAllResponseBodyClustersClusterInfoOrderTaskInfo setTargetCount(Integer targetCount) {
            this.targetCount = targetCount;
            return this;
        }
        public Integer getTargetCount() {
            return this.targetCount;
        }

    }

    public static class ListFlowClusterAllResponseBodyClustersClusterInfo extends TeaModel {
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
        public ListFlowClusterAllResponseBodyClustersClusterInfoFailReason failReason;

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
        public ListFlowClusterAllResponseBodyClustersClusterInfoOrderTaskInfo orderTaskInfo;

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

        public static ListFlowClusterAllResponseBodyClustersClusterInfo build(java.util.Map<String, ?> map) throws Exception {
            ListFlowClusterAllResponseBodyClustersClusterInfo self = new ListFlowClusterAllResponseBodyClustersClusterInfo();
            return TeaModel.build(map, self);
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfo setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfo setCreateResource(String createResource) {
            this.createResource = createResource;
            return this;
        }
        public String getCreateResource() {
            return this.createResource;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfo setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfo setExpiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfo setFailReason(ListFlowClusterAllResponseBodyClustersClusterInfoFailReason failReason) {
            this.failReason = failReason;
            return this;
        }
        public ListFlowClusterAllResponseBodyClustersClusterInfoFailReason getFailReason() {
            return this.failReason;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfo setHasUncompletedOrder(Boolean hasUncompletedOrder) {
            this.hasUncompletedOrder = hasUncompletedOrder;
            return this;
        }
        public Boolean getHasUncompletedOrder() {
            return this.hasUncompletedOrder;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfo setK8sClusterId(String k8sClusterId) {
            this.k8sClusterId = k8sClusterId;
            return this;
        }
        public String getK8sClusterId() {
            return this.k8sClusterId;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfo setOrderList(String orderList) {
            this.orderList = orderList;
            return this;
        }
        public String getOrderList() {
            return this.orderList;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfo setOrderTaskInfo(ListFlowClusterAllResponseBodyClustersClusterInfoOrderTaskInfo orderTaskInfo) {
            this.orderTaskInfo = orderTaskInfo;
            return this;
        }
        public ListFlowClusterAllResponseBodyClustersClusterInfoOrderTaskInfo getOrderTaskInfo() {
            return this.orderTaskInfo;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfo setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfo setRunningTime(Integer runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public Integer getRunningTime() {
            return this.runningTime;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFlowClusterAllResponseBodyClustersClusterInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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
