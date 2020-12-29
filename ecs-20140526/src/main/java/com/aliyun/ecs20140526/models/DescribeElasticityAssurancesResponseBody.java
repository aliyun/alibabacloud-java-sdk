// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeElasticityAssurancesResponseBody extends TeaModel {
    @NameInMap("ElasticityAssuranceSet")
    public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSet elasticityAssuranceSet;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    public static DescribeElasticityAssurancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticityAssurancesResponseBody self = new DescribeElasticityAssurancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeElasticityAssurancesResponseBody setElasticityAssuranceSet(DescribeElasticityAssurancesResponseBodyElasticityAssuranceSet elasticityAssuranceSet) {
        this.elasticityAssuranceSet = elasticityAssuranceSet;
        return this;
    }
    public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSet getElasticityAssuranceSet() {
        return this.elasticityAssuranceSet;
    }

    public DescribeElasticityAssurancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeElasticityAssurancesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeElasticityAssurancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeElasticityAssurancesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public static class DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResource extends TeaModel {
        @NameInMap("zoneId")
        public String zoneId;

        @NameInMap("UsedAmount")
        public Integer usedAmount;

        @NameInMap("TotalAmount")
        public Integer totalAmount;

        @NameInMap("InstanceType")
        public String instanceType;

        public static DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResource self = new DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResource();
            return TeaModel.build(map, self);
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResource setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResource setUsedAmount(Integer usedAmount) {
            this.usedAmount = usedAmount;
            return this;
        }
        public Integer getUsedAmount() {
            return this.usedAmount;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResource setTotalAmount(Integer totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public Integer getTotalAmount() {
            return this.totalAmount;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResource setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResources extends TeaModel {
        @NameInMap("AllocatedResource")
        public java.util.List<DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResource> allocatedResource;

        public static DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResources self = new DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResources();
            return TeaModel.build(map, self);
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResources setAllocatedResource(java.util.List<DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResource> allocatedResource) {
            this.allocatedResource = allocatedResource;
            return this;
        }
        public java.util.List<DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResourcesAllocatedResource> getAllocatedResource() {
            return this.allocatedResource;
        }

    }

    public static class DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("PrivatePoolOptionsMatchCriteria")
        public String privatePoolOptionsMatchCriteria;

        @NameInMap("PrivatePoolOptionsId")
        public String privatePoolOptionsId;

        @NameInMap("UsedAssuranceTimes")
        public Integer usedAssuranceTimes;

        @NameInMap("LatestStartTime")
        public String latestStartTime;

        @NameInMap("AllocatedResources")
        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResources allocatedResources;

        @NameInMap("PrivatePoolOptionsName")
        public String privatePoolOptionsName;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("TotalAssuranceTimes")
        public String totalAssuranceTimes;

        public static DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem self = new DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem();
            return TeaModel.build(map, self);
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem setPrivatePoolOptionsMatchCriteria(String privatePoolOptionsMatchCriteria) {
            this.privatePoolOptionsMatchCriteria = privatePoolOptionsMatchCriteria;
            return this;
        }
        public String getPrivatePoolOptionsMatchCriteria() {
            return this.privatePoolOptionsMatchCriteria;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem setPrivatePoolOptionsId(String privatePoolOptionsId) {
            this.privatePoolOptionsId = privatePoolOptionsId;
            return this;
        }
        public String getPrivatePoolOptionsId() {
            return this.privatePoolOptionsId;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem setUsedAssuranceTimes(Integer usedAssuranceTimes) {
            this.usedAssuranceTimes = usedAssuranceTimes;
            return this;
        }
        public Integer getUsedAssuranceTimes() {
            return this.usedAssuranceTimes;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem setLatestStartTime(String latestStartTime) {
            this.latestStartTime = latestStartTime;
            return this;
        }
        public String getLatestStartTime() {
            return this.latestStartTime;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem setAllocatedResources(DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResources allocatedResources) {
            this.allocatedResources = allocatedResources;
            return this;
        }
        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItemAllocatedResources getAllocatedResources() {
            return this.allocatedResources;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem setPrivatePoolOptionsName(String privatePoolOptionsName) {
            this.privatePoolOptionsName = privatePoolOptionsName;
            return this;
        }
        public String getPrivatePoolOptionsName() {
            return this.privatePoolOptionsName;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem setTotalAssuranceTimes(String totalAssuranceTimes) {
            this.totalAssuranceTimes = totalAssuranceTimes;
            return this;
        }
        public String getTotalAssuranceTimes() {
            return this.totalAssuranceTimes;
        }

    }

    public static class DescribeElasticityAssurancesResponseBodyElasticityAssuranceSet extends TeaModel {
        @NameInMap("ElasticityAssuranceItem")
        public java.util.List<DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem> elasticityAssuranceItem;

        public static DescribeElasticityAssurancesResponseBodyElasticityAssuranceSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticityAssurancesResponseBodyElasticityAssuranceSet self = new DescribeElasticityAssurancesResponseBodyElasticityAssuranceSet();
            return TeaModel.build(map, self);
        }

        public DescribeElasticityAssurancesResponseBodyElasticityAssuranceSet setElasticityAssuranceItem(java.util.List<DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem> elasticityAssuranceItem) {
            this.elasticityAssuranceItem = elasticityAssuranceItem;
            return this;
        }
        public java.util.List<DescribeElasticityAssurancesResponseBodyElasticityAssuranceSetElasticityAssuranceItem> getElasticityAssuranceItem() {
            return this.elasticityAssuranceItem;
        }

    }

}
