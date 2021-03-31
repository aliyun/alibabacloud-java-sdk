// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDeploymentSetsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("DeploymentSets")
    @Validation(required = true)
    public DescribeDeploymentSetsResponseDeploymentSets deploymentSets;

    public static DescribeDeploymentSetsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeploymentSetsResponse self = new DescribeDeploymentSetsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeploymentSetsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeploymentSetsResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDeploymentSetsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDeploymentSetsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDeploymentSetsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDeploymentSetsResponse setDeploymentSets(DescribeDeploymentSetsResponseDeploymentSets deploymentSets) {
        this.deploymentSets = deploymentSets;
        return this;
    }
    public DescribeDeploymentSetsResponseDeploymentSets getDeploymentSets() {
        return this.deploymentSets;
    }

    public static class DescribeDeploymentSetsResponseDeploymentSetsDeploymentSetInstanceIds extends TeaModel {
        // InstanceId
        @NameInMap("InstanceId")
        @Validation(required = true)
        public java.util.List<String> instanceId;

        public static DescribeDeploymentSetsResponseDeploymentSetsDeploymentSetInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeploymentSetsResponseDeploymentSetsDeploymentSetInstanceIds self = new DescribeDeploymentSetsResponseDeploymentSetsDeploymentSetInstanceIds();
            return TeaModel.build(map, self);
        }

        public DescribeDeploymentSetsResponseDeploymentSetsDeploymentSetInstanceIds setInstanceId(java.util.List<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeDeploymentSetsResponseDeploymentSetsDeploymentSet extends TeaModel {
        @NameInMap("DeploymentSetId")
        @Validation(required = true)
        public String deploymentSetId;

        @NameInMap("DeploymentSetDescription")
        @Validation(required = true)
        public String deploymentSetDescription;

        @NameInMap("DeploymentSetName")
        @Validation(required = true)
        public String deploymentSetName;

        @NameInMap("Strategy")
        @Validation(required = true)
        public String strategy;

        @NameInMap("DeploymentStrategy")
        @Validation(required = true)
        public String deploymentStrategy;

        @NameInMap("Domain")
        @Validation(required = true)
        public String domain;

        @NameInMap("Granularity")
        @Validation(required = true)
        public String granularity;

        @NameInMap("GroupCount")
        @Validation(required = true)
        public Integer groupCount;

        @NameInMap("InstanceAmount")
        @Validation(required = true)
        public Integer instanceAmount;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("InstanceIds")
        @Validation(required = true)
        public DescribeDeploymentSetsResponseDeploymentSetsDeploymentSetInstanceIds instanceIds;

        public static DescribeDeploymentSetsResponseDeploymentSetsDeploymentSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeploymentSetsResponseDeploymentSetsDeploymentSet self = new DescribeDeploymentSetsResponseDeploymentSetsDeploymentSet();
            return TeaModel.build(map, self);
        }

        public DescribeDeploymentSetsResponseDeploymentSetsDeploymentSet setDeploymentSetId(String deploymentSetId) {
            this.deploymentSetId = deploymentSetId;
            return this;
        }
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        public DescribeDeploymentSetsResponseDeploymentSetsDeploymentSet setDeploymentSetDescription(String deploymentSetDescription) {
            this.deploymentSetDescription = deploymentSetDescription;
            return this;
        }
        public String getDeploymentSetDescription() {
            return this.deploymentSetDescription;
        }

        public DescribeDeploymentSetsResponseDeploymentSetsDeploymentSet setDeploymentSetName(String deploymentSetName) {
            this.deploymentSetName = deploymentSetName;
            return this;
        }
        public String getDeploymentSetName() {
            return this.deploymentSetName;
        }

        public DescribeDeploymentSetsResponseDeploymentSetsDeploymentSet setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

        public DescribeDeploymentSetsResponseDeploymentSetsDeploymentSet setDeploymentStrategy(String deploymentStrategy) {
            this.deploymentStrategy = deploymentStrategy;
            return this;
        }
        public String getDeploymentStrategy() {
            return this.deploymentStrategy;
        }

        public DescribeDeploymentSetsResponseDeploymentSetsDeploymentSet setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDeploymentSetsResponseDeploymentSetsDeploymentSet setGranularity(String granularity) {
            this.granularity = granularity;
            return this;
        }
        public String getGranularity() {
            return this.granularity;
        }

        public DescribeDeploymentSetsResponseDeploymentSetsDeploymentSet setGroupCount(Integer groupCount) {
            this.groupCount = groupCount;
            return this;
        }
        public Integer getGroupCount() {
            return this.groupCount;
        }

        public DescribeDeploymentSetsResponseDeploymentSetsDeploymentSet setInstanceAmount(Integer instanceAmount) {
            this.instanceAmount = instanceAmount;
            return this;
        }
        public Integer getInstanceAmount() {
            return this.instanceAmount;
        }

        public DescribeDeploymentSetsResponseDeploymentSetsDeploymentSet setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDeploymentSetsResponseDeploymentSetsDeploymentSet setInstanceIds(DescribeDeploymentSetsResponseDeploymentSetsDeploymentSetInstanceIds instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public DescribeDeploymentSetsResponseDeploymentSetsDeploymentSetInstanceIds getInstanceIds() {
            return this.instanceIds;
        }

    }

    public static class DescribeDeploymentSetsResponseDeploymentSets extends TeaModel {
        @NameInMap("DeploymentSet")
        @Validation(required = true)
        public java.util.List<DescribeDeploymentSetsResponseDeploymentSetsDeploymentSet> deploymentSet;

        public static DescribeDeploymentSetsResponseDeploymentSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeploymentSetsResponseDeploymentSets self = new DescribeDeploymentSetsResponseDeploymentSets();
            return TeaModel.build(map, self);
        }

        public DescribeDeploymentSetsResponseDeploymentSets setDeploymentSet(java.util.List<DescribeDeploymentSetsResponseDeploymentSetsDeploymentSet> deploymentSet) {
            this.deploymentSet = deploymentSet;
            return this;
        }
        public java.util.List<DescribeDeploymentSetsResponseDeploymentSetsDeploymentSet> getDeploymentSet() {
            return this.deploymentSet;
        }

    }

}
