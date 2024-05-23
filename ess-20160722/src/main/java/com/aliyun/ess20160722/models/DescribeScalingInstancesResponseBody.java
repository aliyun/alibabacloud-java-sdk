// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20160722.models;

import com.aliyun.tea.*;

public class DescribeScalingInstancesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScalingInstances")
    public DescribeScalingInstancesResponseBodyScalingInstances scalingInstances;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeScalingInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingInstancesResponseBody self = new DescribeScalingInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScalingInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeScalingInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeScalingInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScalingInstancesResponseBody setScalingInstances(DescribeScalingInstancesResponseBodyScalingInstances scalingInstances) {
        this.scalingInstances = scalingInstances;
        return this;
    }
    public DescribeScalingInstancesResponseBodyScalingInstances getScalingInstances() {
        return this.scalingInstances;
    }

    public DescribeScalingInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("CreationType")
        public String creationType;

        @NameInMap("HealthStatus")
        public String healthStatus;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LifecycleState")
        public String lifecycleState;

        @NameInMap("ScalingConfigurationId")
        public String scalingConfigurationId;

        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        public static DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance self = new DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance();
            return TeaModel.build(map, self);
        }

        public DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance setCreationType(String creationType) {
            this.creationType = creationType;
            return this;
        }
        public String getCreationType() {
            return this.creationType;
        }

        public DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance setLifecycleState(String lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }
        public String getLifecycleState() {
            return this.lifecycleState;
        }

        public DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance setScalingConfigurationId(String scalingConfigurationId) {
            this.scalingConfigurationId = scalingConfigurationId;
            return this;
        }
        public String getScalingConfigurationId() {
            return this.scalingConfigurationId;
        }

        public DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

    }

    public static class DescribeScalingInstancesResponseBodyScalingInstances extends TeaModel {
        @NameInMap("ScalingInstance")
        public java.util.List<DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance> scalingInstance;

        public static DescribeScalingInstancesResponseBodyScalingInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingInstancesResponseBodyScalingInstances self = new DescribeScalingInstancesResponseBodyScalingInstances();
            return TeaModel.build(map, self);
        }

        public DescribeScalingInstancesResponseBodyScalingInstances setScalingInstance(java.util.List<DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance> scalingInstance) {
            this.scalingInstance = scalingInstance;
            return this;
        }
        public java.util.List<DescribeScalingInstancesResponseBodyScalingInstancesScalingInstance> getScalingInstance() {
            return this.scalingInstance;
        }

    }

}
