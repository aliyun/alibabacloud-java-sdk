// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListClustersResponseBody extends TeaModel {
    @NameInMap("Clusters")
    public ListClustersResponseBodyClusters clusters;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClustersResponseBody self = new ListClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClustersResponseBody setClusters(ListClustersResponseBodyClusters clusters) {
        this.clusters = clusters;
        return this;
    }
    public ListClustersResponseBodyClusters getClusters() {
        return this.clusters;
    }

    public ListClustersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListClustersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClustersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListClustersResponseBodyClustersClusterInfoFailReason extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("RequestId")
        public String requestId;

        public static ListClustersResponseBodyClustersClusterInfoFailReason build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClustersClusterInfoFailReason self = new ListClustersResponseBodyClustersClusterInfoFailReason();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClustersClusterInfoFailReason setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListClustersResponseBodyClustersClusterInfoFailReason setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public ListClustersResponseBodyClustersClusterInfoFailReason setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

    public static class ListClustersResponseBodyClustersClusterInfoOrderTaskInfo extends TeaModel {
        @NameInMap("CurrentCount")
        public Integer currentCount;

        @NameInMap("OrderIdList")
        public String orderIdList;

        @NameInMap("TargetCount")
        public Integer targetCount;

        public static ListClustersResponseBodyClustersClusterInfoOrderTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClustersClusterInfoOrderTaskInfo self = new ListClustersResponseBodyClustersClusterInfoOrderTaskInfo();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClustersClusterInfoOrderTaskInfo setCurrentCount(Integer currentCount) {
            this.currentCount = currentCount;
            return this;
        }
        public Integer getCurrentCount() {
            return this.currentCount;
        }

        public ListClustersResponseBodyClustersClusterInfoOrderTaskInfo setOrderIdList(String orderIdList) {
            this.orderIdList = orderIdList;
            return this;
        }
        public String getOrderIdList() {
            return this.orderIdList;
        }

        public ListClustersResponseBodyClustersClusterInfoOrderTaskInfo setTargetCount(Integer targetCount) {
            this.targetCount = targetCount;
            return this;
        }
        public Integer getTargetCount() {
            return this.targetCount;
        }

    }

    public static class ListClustersResponseBodyClustersClusterInfoTagsTag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static ListClustersResponseBodyClustersClusterInfoTagsTag build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClustersClusterInfoTagsTag self = new ListClustersResponseBodyClustersClusterInfoTagsTag();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClustersClusterInfoTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListClustersResponseBodyClustersClusterInfoTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListClustersResponseBodyClustersClusterInfoTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<ListClustersResponseBodyClustersClusterInfoTagsTag> tag;

        public static ListClustersResponseBodyClustersClusterInfoTags build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClustersClusterInfoTags self = new ListClustersResponseBodyClustersClusterInfoTags();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClustersClusterInfoTags setTag(java.util.List<ListClustersResponseBodyClustersClusterInfoTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<ListClustersResponseBodyClustersClusterInfoTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class ListClustersResponseBodyClustersClusterInfo extends TeaModel {
        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("CreateResource")
        public String createResource;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DepositType")
        public String depositType;

        @NameInMap("ExpiredTime")
        public Long expiredTime;

        @NameInMap("FailReason")
        public ListClustersResponseBodyClustersClusterInfoFailReason failReason;

        @NameInMap("HasUncompletedOrder")
        public Boolean hasUncompletedOrder;

        @NameInMap("Id")
        public String id;

        @NameInMap("K8sClusterId")
        public String k8sClusterId;

        @NameInMap("MachineType")
        public String machineType;

        @NameInMap("MetaStoreType")
        public String metaStoreType;

        @NameInMap("Name")
        public String name;

        @NameInMap("OrderList")
        public String orderList;

        @NameInMap("OrderTaskInfo")
        public ListClustersResponseBodyClustersClusterInfoOrderTaskInfo orderTaskInfo;

        @NameInMap("Period")
        public Integer period;

        @NameInMap("RunningTime")
        public Integer runningTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public ListClustersResponseBodyClustersClusterInfoTags tags;

        @NameInMap("Type")
        public String type;

        public static ListClustersResponseBodyClustersClusterInfo build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClustersClusterInfo self = new ListClustersResponseBodyClustersClusterInfo();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClustersClusterInfo setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListClustersResponseBodyClustersClusterInfo setCreateResource(String createResource) {
            this.createResource = createResource;
            return this;
        }
        public String getCreateResource() {
            return this.createResource;
        }

        public ListClustersResponseBodyClustersClusterInfo setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListClustersResponseBodyClustersClusterInfo setDepositType(String depositType) {
            this.depositType = depositType;
            return this;
        }
        public String getDepositType() {
            return this.depositType;
        }

        public ListClustersResponseBodyClustersClusterInfo setExpiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        public ListClustersResponseBodyClustersClusterInfo setFailReason(ListClustersResponseBodyClustersClusterInfoFailReason failReason) {
            this.failReason = failReason;
            return this;
        }
        public ListClustersResponseBodyClustersClusterInfoFailReason getFailReason() {
            return this.failReason;
        }

        public ListClustersResponseBodyClustersClusterInfo setHasUncompletedOrder(Boolean hasUncompletedOrder) {
            this.hasUncompletedOrder = hasUncompletedOrder;
            return this;
        }
        public Boolean getHasUncompletedOrder() {
            return this.hasUncompletedOrder;
        }

        public ListClustersResponseBodyClustersClusterInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListClustersResponseBodyClustersClusterInfo setK8sClusterId(String k8sClusterId) {
            this.k8sClusterId = k8sClusterId;
            return this;
        }
        public String getK8sClusterId() {
            return this.k8sClusterId;
        }

        public ListClustersResponseBodyClustersClusterInfo setMachineType(String machineType) {
            this.machineType = machineType;
            return this;
        }
        public String getMachineType() {
            return this.machineType;
        }

        public ListClustersResponseBodyClustersClusterInfo setMetaStoreType(String metaStoreType) {
            this.metaStoreType = metaStoreType;
            return this;
        }
        public String getMetaStoreType() {
            return this.metaStoreType;
        }

        public ListClustersResponseBodyClustersClusterInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClustersResponseBodyClustersClusterInfo setOrderList(String orderList) {
            this.orderList = orderList;
            return this;
        }
        public String getOrderList() {
            return this.orderList;
        }

        public ListClustersResponseBodyClustersClusterInfo setOrderTaskInfo(ListClustersResponseBodyClustersClusterInfoOrderTaskInfo orderTaskInfo) {
            this.orderTaskInfo = orderTaskInfo;
            return this;
        }
        public ListClustersResponseBodyClustersClusterInfoOrderTaskInfo getOrderTaskInfo() {
            return this.orderTaskInfo;
        }

        public ListClustersResponseBodyClustersClusterInfo setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public ListClustersResponseBodyClustersClusterInfo setRunningTime(Integer runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public Integer getRunningTime() {
            return this.runningTime;
        }

        public ListClustersResponseBodyClustersClusterInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClustersResponseBodyClustersClusterInfo setTags(ListClustersResponseBodyClustersClusterInfoTags tags) {
            this.tags = tags;
            return this;
        }
        public ListClustersResponseBodyClustersClusterInfoTags getTags() {
            return this.tags;
        }

        public ListClustersResponseBodyClustersClusterInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListClustersResponseBodyClusters extends TeaModel {
        @NameInMap("ClusterInfo")
        public java.util.List<ListClustersResponseBodyClustersClusterInfo> clusterInfo;

        public static ListClustersResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyClusters self = new ListClustersResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyClusters setClusterInfo(java.util.List<ListClustersResponseBodyClustersClusterInfo> clusterInfo) {
            this.clusterInfo = clusterInfo;
            return this;
        }
        public java.util.List<ListClustersResponseBodyClustersClusterInfo> getClusterInfo() {
            return this.clusterInfo;
        }

    }

}
