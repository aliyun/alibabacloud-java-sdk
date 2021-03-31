// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDeploymentSetsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("DeploymentSets")
    public DescribeDeploymentSetsResponseBodyDeploymentSets deploymentSets;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDeploymentSetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeploymentSetsResponseBody self = new DescribeDeploymentSetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeploymentSetsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDeploymentSetsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDeploymentSetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeploymentSetsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDeploymentSetsResponseBody setDeploymentSets(DescribeDeploymentSetsResponseBodyDeploymentSets deploymentSets) {
        this.deploymentSets = deploymentSets;
        return this;
    }
    public DescribeDeploymentSetsResponseBodyDeploymentSets getDeploymentSets() {
        return this.deploymentSets;
    }

    public DescribeDeploymentSetsResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Strategy")
        public String strategy;

        @NameInMap("DeploymentSetId")
        public String deploymentSetId;

        @NameInMap("DeploymentStrategy")
        public String deploymentStrategy;

        @NameInMap("DeploymentSetDescription")
        public String deploymentSetDescription;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("GroupCount")
        public Integer groupCount;

        @NameInMap("Granularity")
        public String granularity;

        @NameInMap("InstanceIds")
        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSetInstanceIds instanceIds;

        @NameInMap("DeploymentSetName")
        public String deploymentSetName;

        @NameInMap("InstanceAmount")
        public Integer instanceAmount;

        public static DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet self = new DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet();
            return TeaModel.build(map, self);
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setDeploymentSetId(String deploymentSetId) {
            this.deploymentSetId = deploymentSetId;
            return this;
        }
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setDeploymentStrategy(String deploymentStrategy) {
            this.deploymentStrategy = deploymentStrategy;
            return this;
        }
        public String getDeploymentStrategy() {
            return this.deploymentStrategy;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setDeploymentSetDescription(String deploymentSetDescription) {
            this.deploymentSetDescription = deploymentSetDescription;
            return this;
        }
        public String getDeploymentSetDescription() {
            return this.deploymentSetDescription;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setGroupCount(Integer groupCount) {
            this.groupCount = groupCount;
            return this;
        }
        public Integer getGroupCount() {
            return this.groupCount;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setGranularity(String granularity) {
            this.granularity = granularity;
            return this;
        }
        public String getGranularity() {
            return this.granularity;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setInstanceIds(DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSetInstanceIds instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSetInstanceIds getInstanceIds() {
            return this.instanceIds;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setDeploymentSetName(String deploymentSetName) {
            this.deploymentSetName = deploymentSetName;
            return this;
        }
        public String getDeploymentSetName() {
            return this.deploymentSetName;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSetsDeploymentSet setInstanceAmount(Integer instanceAmount) {
            this.instanceAmount = instanceAmount;
            return this;
        }
        public Integer getInstanceAmount() {
            return this.instanceAmount;
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
