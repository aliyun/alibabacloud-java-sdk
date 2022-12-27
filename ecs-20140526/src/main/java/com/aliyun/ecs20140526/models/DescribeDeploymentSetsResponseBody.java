// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDeploymentSetsResponseBody extends TeaModel {
    // Details about the deployment sets.
    @NameInMap("DeploymentSets")
    public DescribeDeploymentSetsResponseBodyDeploymentSets deploymentSets;

    // The page number of the returned page.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The region ID of the deployment set.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of deployment sets returned.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDeploymentSetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeploymentSetsResponseBody self = new DescribeDeploymentSetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeploymentSetsResponseBody setDeploymentSets(DescribeDeploymentSetsResponseBodyDeploymentSets deploymentSets) {
        this.deploymentSets = deploymentSets;
        return this;
    }
    public DescribeDeploymentSetsResponseBodyDeploymentSets getDeploymentSets() {
        return this.deploymentSets;
    }

    public DescribeDeploymentSetsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDeploymentSetsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDeploymentSetsResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDeploymentSetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeploymentSetsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacitiesCapacity extends TeaModel {
        // The number of ECS instances that can be added to the deployment set within the zone.
        @NameInMap("AvailableAmount")
        public Integer availableAmount;

        // The number of ECS instances that belong to the zone in the deployment set.
        @NameInMap("UsedAmount")
        public Integer usedAmount;

        // The ID of the zone. Only the zone IDs of existing ECS instances in the deployment set are returned.
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacitiesCapacity build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacitiesCapacity self = new DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacitiesCapacity();
            return TeaModel.build(map, self);
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacitiesCapacity setAvailableAmount(Integer availableAmount) {
            this.availableAmount = availableAmount;
            return this;
        }
        public Integer getAvailableAmount() {
            return this.availableAmount;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacitiesCapacity setUsedAmount(Integer usedAmount) {
            this.usedAmount = usedAmount;
            return this;
        }
        public Integer getUsedAmount() {
            return this.usedAmount;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacitiesCapacity setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacities extends TeaModel {
        @NameInMap("Capacity")
        public java.util.List<DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacitiesCapacity> capacity;

        public static DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacities build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacities self = new DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacities();
            return TeaModel.build(map, self);
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacities setCapacity(java.util.List<DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacitiesCapacity> capacity) {
            this.capacity = capacity;
            return this;
        }
        public java.util.List<DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacitiesCapacity> getCapacity() {
            return this.capacity;
        }

    }

    public static class DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSetInstanceIds extends TeaModel {
        @NameInMap("InstanceId")
        public java.util.List<String> instanceId;

        public static DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSetInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSetInstanceIds self = new DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSetInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSetInstanceIds setInstanceId(java.util.List<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet extends TeaModel {
        // Details of the capacities of the deployment set. This parameter is valid only when the deployment set contains Elastic Compute Service (ECS) instances. The value contains the capacities of the deployment set in different zones.
        @NameInMap("Capacities")
        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacities capacities;

        // The time when the deployment set was created.
        @NameInMap("CreationTime")
        public String creationTime;

        // The description of the deployment set.
        @NameInMap("DeploymentSetDescription")
        public String deploymentSetDescription;

        // The ID of the deployment set.
        @NameInMap("DeploymentSetId")
        public String deploymentSetId;

        // The name of the deployment set.
        @NameInMap("DeploymentSetName")
        public String deploymentSetName;

        // The deployment strategy. The value of this response parameter is that of the `Strategy` request parameter.
        @NameInMap("DeploymentStrategy")
        public String deploymentStrategy;

        // The deployment domain.
        @NameInMap("Domain")
        public String domain;

        // The deployment granularity.
        @NameInMap("Granularity")
        public String granularity;

        // The number of deployment set groups in the deployment set.
        // 
        // >  This parameter is valid only when the Strategy request parameter is set to AvailabilityGroup.
        @NameInMap("GroupCount")
        public Integer groupCount;

        // The number of instances in the deployment set.
        @NameInMap("InstanceAmount")
        public Integer instanceAmount;

        // The IDs of the instances in the deployment set.
        @NameInMap("InstanceIds")
        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSetInstanceIds instanceIds;

        // The deployment strategy.
        @NameInMap("Strategy")
        public String strategy;

        public static DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet self = new DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet();
            return TeaModel.build(map, self);
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setCapacities(DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacities capacities) {
            this.capacities = capacities;
            return this;
        }
        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSetCapacities getCapacities() {
            return this.capacities;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setDeploymentSetDescription(String deploymentSetDescription) {
            this.deploymentSetDescription = deploymentSetDescription;
            return this;
        }
        public String getDeploymentSetDescription() {
            return this.deploymentSetDescription;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setDeploymentSetId(String deploymentSetId) {
            this.deploymentSetId = deploymentSetId;
            return this;
        }
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setDeploymentSetName(String deploymentSetName) {
            this.deploymentSetName = deploymentSetName;
            return this;
        }
        public String getDeploymentSetName() {
            return this.deploymentSetName;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setDeploymentStrategy(String deploymentStrategy) {
            this.deploymentStrategy = deploymentStrategy;
            return this;
        }
        public String getDeploymentStrategy() {
            return this.deploymentStrategy;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setGranularity(String granularity) {
            this.granularity = granularity;
            return this;
        }
        public String getGranularity() {
            return this.granularity;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setGroupCount(Integer groupCount) {
            this.groupCount = groupCount;
            return this;
        }
        public Integer getGroupCount() {
            return this.groupCount;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setInstanceAmount(Integer instanceAmount) {
            this.instanceAmount = instanceAmount;
            return this;
        }
        public Integer getInstanceAmount() {
            return this.instanceAmount;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setInstanceIds(DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSetInstanceIds instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSetInstanceIds getInstanceIds() {
            return this.instanceIds;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

    }

    public static class DescribeDeploymentSetsResponseBodyDeploymentSets extends TeaModel {
        @NameInMap("DeploymentSet")
        public java.util.List<DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet> deploymentSet;

        public static DescribeDeploymentSetsResponseBodyDeploymentSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeploymentSetsResponseBodyDeploymentSets self = new DescribeDeploymentSetsResponseBodyDeploymentSets();
            return TeaModel.build(map, self);
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSets setDeploymentSet(java.util.List<DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet> deploymentSet) {
            this.deploymentSet = deploymentSet;
            return this;
        }
        public java.util.List<DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet> getDeploymentSet() {
            return this.deploymentSet;
        }

    }

}
