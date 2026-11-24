// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeWarmPoolInstancesResponseBody extends TeaModel {
    /**
     * <p>The token for the next query. An empty NextToken value indicates that no more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAcSz4VTb1Nq****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E38EB733-D714-4658-8A5F-0688AB68****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the scaling group.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp18p2yfxow2dloq****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>The list of ECS instances in the warm pool.</p>
     */
    @NameInMap("WarmPoolInstances")
    public java.util.List<DescribeWarmPoolInstancesResponseBodyWarmPoolInstances> warmPoolInstances;

    public static DescribeWarmPoolInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWarmPoolInstancesResponseBody self = new DescribeWarmPoolInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWarmPoolInstancesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeWarmPoolInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWarmPoolInstancesResponseBody setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public DescribeWarmPoolInstancesResponseBody setWarmPoolInstances(java.util.List<DescribeWarmPoolInstancesResponseBodyWarmPoolInstances> warmPoolInstances) {
        this.warmPoolInstances = warmPoolInstances;
        return this;
    }
    public java.util.List<DescribeWarmPoolInstancesResponseBodyWarmPoolInstances> getWarmPoolInstances() {
        return this.warmPoolInstances;
    }

    public static class DescribeWarmPoolInstancesResponseBodyWarmPoolInstances extends TeaModel {
        /**
         * <p>The time when the ECS instance was added to the warm pool, accurate to the second. The time is in UTC and follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-18T03:11:39Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The ID of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1c2hf**********</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the instance launch template.</p>
         * 
         * <strong>example:</strong>
         * <p>lt-uf64k10pok76*****</p>
         */
        @NameInMap("LaunchTemplateId")
        public String launchTemplateId;

        /**
         * <p>The version of the instance launch template.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("LaunchTemplateVersion")
        public String launchTemplateVersion;

        /**
         * <p>The lifecycle state of the ECS instance in the warm pool. Valid values:</p>
         * <ul>
         * <li><p>Pending: The ECS instance is being added to the warm pool.</p>
         * </li>
         * <li><p>Pending:Wait: The addition of the ECS instance is suspended. If a lifecycle hook that applies to scale-out activities for the warm pool is created in the scaling group, the ECS instance is suspended when it is added to the warm pool and waits for the lifecycle hook to time out.</p>
         * </li>
         * <li><p>Removing: The ECS instance is being removed from the warm pool.</p>
         * </li>
         * <li><p>Removing:Wait: The removal of the ECS instance is suspended. If a lifecycle hook that applies to scale-in activities for the warm pool is created in the scaling group, the ECS instance is suspended when it is removed from the warm pool and waits for the lifecycle hook to time out.</p>
         * </li>
         * <li><p>Running: The ECS instance is successfully added to the warm pool and is in the running state.</p>
         * </li>
         * <li><p>Stopped: The ECS instance is successfully added to the warm pool and is in the economical mode.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("LifecycleState")
        public String lifecycleState;

        /**
         * <p>The private IP address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1*.1*.1*.2*</p>
         */
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        /**
         * <p>The ID of the scaling activity when the ECS instance was added to the warm pool.</p>
         * 
         * <strong>example:</strong>
         * <p>asa-2ze87i********</p>
         */
        @NameInMap("ScalingActivityId")
        public String scalingActivityId;

        /**
         * <p>The ID of the associated scaling configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>asc-2ze3j8*********</p>
         */
        @NameInMap("ScalingConfigurationId")
        public String scalingConfigurationId;

        /**
         * <p>The ID of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp18p2yfxow2dloq****</p>
         */
        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        /**
         * <p>The instance identity in the scaling group, which corresponds one-to-one with the ID of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>asi-j6cj1gcte640ekhb****</p>
         */
        @NameInMap("ScalingInstanceId")
        public String scalingInstanceId;

        /**
         * <p>The zone ID of the ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeWarmPoolInstancesResponseBodyWarmPoolInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeWarmPoolInstancesResponseBodyWarmPoolInstances self = new DescribeWarmPoolInstancesResponseBodyWarmPoolInstances();
            return TeaModel.build(map, self);
        }

        public DescribeWarmPoolInstancesResponseBodyWarmPoolInstances setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeWarmPoolInstancesResponseBodyWarmPoolInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeWarmPoolInstancesResponseBodyWarmPoolInstances setLaunchTemplateId(String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        public DescribeWarmPoolInstancesResponseBodyWarmPoolInstances setLaunchTemplateVersion(String launchTemplateVersion) {
            this.launchTemplateVersion = launchTemplateVersion;
            return this;
        }
        public String getLaunchTemplateVersion() {
            return this.launchTemplateVersion;
        }

        public DescribeWarmPoolInstancesResponseBodyWarmPoolInstances setLifecycleState(String lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }
        public String getLifecycleState() {
            return this.lifecycleState;
        }

        public DescribeWarmPoolInstancesResponseBodyWarmPoolInstances setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public DescribeWarmPoolInstancesResponseBodyWarmPoolInstances setScalingActivityId(String scalingActivityId) {
            this.scalingActivityId = scalingActivityId;
            return this;
        }
        public String getScalingActivityId() {
            return this.scalingActivityId;
        }

        public DescribeWarmPoolInstancesResponseBodyWarmPoolInstances setScalingConfigurationId(String scalingConfigurationId) {
            this.scalingConfigurationId = scalingConfigurationId;
            return this;
        }
        public String getScalingConfigurationId() {
            return this.scalingConfigurationId;
        }

        public DescribeWarmPoolInstancesResponseBodyWarmPoolInstances setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeWarmPoolInstancesResponseBodyWarmPoolInstances setScalingInstanceId(String scalingInstanceId) {
            this.scalingInstanceId = scalingInstanceId;
            return this;
        }
        public String getScalingInstanceId() {
            return this.scalingInstanceId;
        }

        public DescribeWarmPoolInstancesResponseBodyWarmPoolInstances setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
