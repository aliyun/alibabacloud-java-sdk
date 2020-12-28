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
    public java.util.List<DescribeDeploymentSetsResponseBodyDeploymentSets> deploymentSets;

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

    public DescribeDeploymentSetsResponseBody setDeploymentSets(java.util.List<DescribeDeploymentSetsResponseBodyDeploymentSets> deploymentSets) {
        this.deploymentSets = deploymentSets;
        return this;
    }
    public java.util.List<DescribeDeploymentSetsResponseBodyDeploymentSets> getDeploymentSets() {
        return this.deploymentSets;
    }

    public DescribeDeploymentSetsResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class DescribeDeploymentSetsResponseBodyDeploymentSets extends TeaModel {
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
        public java.util.List<String> instanceIds;

        @NameInMap("DeploymentSetName")
        public String deploymentSetName;

        @NameInMap("InstanceAmount")
        public Integer instanceAmount;

        public static DescribeDeploymentSetsResponseBodyDeploymentSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeploymentSetsResponseBodyDeploymentSets self = new DescribeDeploymentSetsResponseBodyDeploymentSets();
            return TeaModel.build(map, self);
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSets setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSets setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSets setDeploymentSetId(String deploymentSetId) {
            this.deploymentSetId = deploymentSetId;
            return this;
        }
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSets setDeploymentStrategy(String deploymentStrategy) {
            this.deploymentStrategy = deploymentStrategy;
            return this;
        }
        public String getDeploymentStrategy() {
            return this.deploymentStrategy;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSets setDeploymentSetDescription(String deploymentSetDescription) {
            this.deploymentSetDescription = deploymentSetDescription;
            return this;
        }
        public String getDeploymentSetDescription() {
            return this.deploymentSetDescription;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSets setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSets setGroupCount(Integer groupCount) {
            this.groupCount = groupCount;
            return this;
        }
        public Integer getGroupCount() {
            return this.groupCount;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSets setGranularity(String granularity) {
            this.granularity = granularity;
            return this;
        }
        public String getGranularity() {
            return this.granularity;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSets setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSets setDeploymentSetName(String deploymentSetName) {
            this.deploymentSetName = deploymentSetName;
            return this;
        }
        public String getDeploymentSetName() {
            return this.deploymentSetName;
        }

        public DescribeDeploymentSetsResponseBodyDeploymentSets setInstanceAmount(Integer instanceAmount) {
            this.instanceAmount = instanceAmount;
            return this;
        }
        public Integer getInstanceAmount() {
            return this.instanceAmount;
        }

    }

}
