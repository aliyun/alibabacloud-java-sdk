// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeLimitationResponseBody extends TeaModel {
    /**
     * <p>The maximum number of Application Load Balancer (ALB) server groups that can be attached to a scaling group.</p>
     * <br>
     * <p>>  To view the server group quota or request a quota increase, go to [Quota Center](https://quotas.console.aliyun.com/products/ess/quotas).</p>
     */
    @NameInMap("MaxNumberOfAlbServerGroup")
    public Integer maxNumberOfAlbServerGroup;

    /**
     * <p>The maximum number of ApsaraDB RDS instances that can be attached to a scaling group.</p>
     * <br>
     * <p>>  To view the database quota or request a quota increase, go to [Quota Center](https://quotas.console.aliyun.com/products/ess/quotas).</p>
     */
    @NameInMap("MaxNumberOfDBInstances")
    public Integer maxNumberOfDBInstances;

    @NameInMap("MaxNumberOfLifecycleHooks")
    public Integer maxNumberOfLifecycleHooks;

    @NameInMap("MaxNumberOfLoadBalancers")
    public Integer maxNumberOfLoadBalancers;

    @NameInMap("MaxNumberOfMaxSize")
    public Integer maxNumberOfMaxSize;

    /**
     * <p>The minimum number of instances that must be contained in a scaling group. The value of `MaxNumberOfMinSize` must be consistent with the value of `MaxNumberOfMaxSize`.</p>
     */
    @NameInMap("MaxNumberOfMinSize")
    public Integer maxNumberOfMinSize;

    @NameInMap("MaxNumberOfNlbServerGroup")
    public Integer maxNumberOfNlbServerGroup;

    @NameInMap("MaxNumberOfNotificationConfigurations")
    public Integer maxNumberOfNotificationConfigurations;

    /**
     * <p>The maximum number of scaling configurations that can be created in a scaling group.</p>
     * <br>
     * <p>>  To view the scaling configuration quota or request a quota increase, go to [Quota Center](https://quotas.console.aliyun.com/products/ess/quotas).</p>
     */
    @NameInMap("MaxNumberOfScalingConfigurations")
    public Integer maxNumberOfScalingConfigurations;

    /**
     * <p>The maximum number of scaling groups that can be created in a region by using an Alibaba Cloud account.</p>
     * <br>
     * <p>>  To view the scaling group quota or request a quota increase, go to [Quota Center](https://quotas.console.aliyun.com/products/ess/quotas).</p>
     */
    @NameInMap("MaxNumberOfScalingGroups")
    public Integer maxNumberOfScalingGroups;

    @NameInMap("MaxNumberOfScalingInstances")
    public Integer maxNumberOfScalingInstances;

    /**
     * <p>The maximum number of scaling rules that can be created in a scaling group.</p>
     * <br>
     * <p>>  To view the scaling rule quota or request a quota increase, go to [Quota Center](https://quotas.console.aliyun.com/products/ess/quotas).</p>
     */
    @NameInMap("MaxNumberOfScalingRules")
    public Integer maxNumberOfScalingRules;

    @NameInMap("MaxNumberOfScheduledTasks")
    public Integer maxNumberOfScheduledTasks;

    @NameInMap("MaxNumberOfVServerGroups")
    public Integer maxNumberOfVServerGroups;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLimitationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLimitationResponseBody self = new DescribeLimitationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLimitationResponseBody setMaxNumberOfAlbServerGroup(Integer maxNumberOfAlbServerGroup) {
        this.maxNumberOfAlbServerGroup = maxNumberOfAlbServerGroup;
        return this;
    }
    public Integer getMaxNumberOfAlbServerGroup() {
        return this.maxNumberOfAlbServerGroup;
    }

    public DescribeLimitationResponseBody setMaxNumberOfDBInstances(Integer maxNumberOfDBInstances) {
        this.maxNumberOfDBInstances = maxNumberOfDBInstances;
        return this;
    }
    public Integer getMaxNumberOfDBInstances() {
        return this.maxNumberOfDBInstances;
    }

    public DescribeLimitationResponseBody setMaxNumberOfLifecycleHooks(Integer maxNumberOfLifecycleHooks) {
        this.maxNumberOfLifecycleHooks = maxNumberOfLifecycleHooks;
        return this;
    }
    public Integer getMaxNumberOfLifecycleHooks() {
        return this.maxNumberOfLifecycleHooks;
    }

    public DescribeLimitationResponseBody setMaxNumberOfLoadBalancers(Integer maxNumberOfLoadBalancers) {
        this.maxNumberOfLoadBalancers = maxNumberOfLoadBalancers;
        return this;
    }
    public Integer getMaxNumberOfLoadBalancers() {
        return this.maxNumberOfLoadBalancers;
    }

    public DescribeLimitationResponseBody setMaxNumberOfMaxSize(Integer maxNumberOfMaxSize) {
        this.maxNumberOfMaxSize = maxNumberOfMaxSize;
        return this;
    }
    public Integer getMaxNumberOfMaxSize() {
        return this.maxNumberOfMaxSize;
    }

    public DescribeLimitationResponseBody setMaxNumberOfMinSize(Integer maxNumberOfMinSize) {
        this.maxNumberOfMinSize = maxNumberOfMinSize;
        return this;
    }
    public Integer getMaxNumberOfMinSize() {
        return this.maxNumberOfMinSize;
    }

    public DescribeLimitationResponseBody setMaxNumberOfNlbServerGroup(Integer maxNumberOfNlbServerGroup) {
        this.maxNumberOfNlbServerGroup = maxNumberOfNlbServerGroup;
        return this;
    }
    public Integer getMaxNumberOfNlbServerGroup() {
        return this.maxNumberOfNlbServerGroup;
    }

    public DescribeLimitationResponseBody setMaxNumberOfNotificationConfigurations(Integer maxNumberOfNotificationConfigurations) {
        this.maxNumberOfNotificationConfigurations = maxNumberOfNotificationConfigurations;
        return this;
    }
    public Integer getMaxNumberOfNotificationConfigurations() {
        return this.maxNumberOfNotificationConfigurations;
    }

    public DescribeLimitationResponseBody setMaxNumberOfScalingConfigurations(Integer maxNumberOfScalingConfigurations) {
        this.maxNumberOfScalingConfigurations = maxNumberOfScalingConfigurations;
        return this;
    }
    public Integer getMaxNumberOfScalingConfigurations() {
        return this.maxNumberOfScalingConfigurations;
    }

    public DescribeLimitationResponseBody setMaxNumberOfScalingGroups(Integer maxNumberOfScalingGroups) {
        this.maxNumberOfScalingGroups = maxNumberOfScalingGroups;
        return this;
    }
    public Integer getMaxNumberOfScalingGroups() {
        return this.maxNumberOfScalingGroups;
    }

    public DescribeLimitationResponseBody setMaxNumberOfScalingInstances(Integer maxNumberOfScalingInstances) {
        this.maxNumberOfScalingInstances = maxNumberOfScalingInstances;
        return this;
    }
    public Integer getMaxNumberOfScalingInstances() {
        return this.maxNumberOfScalingInstances;
    }

    public DescribeLimitationResponseBody setMaxNumberOfScalingRules(Integer maxNumberOfScalingRules) {
        this.maxNumberOfScalingRules = maxNumberOfScalingRules;
        return this;
    }
    public Integer getMaxNumberOfScalingRules() {
        return this.maxNumberOfScalingRules;
    }

    public DescribeLimitationResponseBody setMaxNumberOfScheduledTasks(Integer maxNumberOfScheduledTasks) {
        this.maxNumberOfScheduledTasks = maxNumberOfScheduledTasks;
        return this;
    }
    public Integer getMaxNumberOfScheduledTasks() {
        return this.maxNumberOfScheduledTasks;
    }

    public DescribeLimitationResponseBody setMaxNumberOfVServerGroups(Integer maxNumberOfVServerGroups) {
        this.maxNumberOfVServerGroups = maxNumberOfVServerGroups;
        return this;
    }
    public Integer getMaxNumberOfVServerGroups() {
        return this.maxNumberOfVServerGroups;
    }

    public DescribeLimitationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
