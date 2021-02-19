// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DescribeLimitationResponseBody extends TeaModel {
    @NameInMap("MaxNumberOfLifecycleHooks")
    public Integer maxNumberOfLifecycleHooks;

    @NameInMap("MaxNumberOfScalingRules")
    public Integer maxNumberOfScalingRules;

    @NameInMap("MaxNumberOfScalingInstances")
    public Integer maxNumberOfScalingInstances;

    @NameInMap("MaxNumberOfScheduledTasks")
    public Integer maxNumberOfScheduledTasks;

    @NameInMap("MaxNumberOfVServerGroups")
    public Integer maxNumberOfVServerGroups;

    @NameInMap("MaxNumberOfLoadBalancers")
    public Integer maxNumberOfLoadBalancers;

    @NameInMap("MaxNumberOfMinSize")
    public Integer maxNumberOfMinSize;

    @NameInMap("MaxNumberOfScalingGroups")
    public Integer maxNumberOfScalingGroups;

    @NameInMap("MaxNumberOfNotificationConfigurations")
    public Integer maxNumberOfNotificationConfigurations;

    @NameInMap("MaxNumberOfMaxSize")
    public Integer maxNumberOfMaxSize;

    @NameInMap("MaxNumberOfDBInstances")
    public Integer maxNumberOfDBInstances;

    @NameInMap("MaxNumberOfScalingConfigurations")
    public Integer maxNumberOfScalingConfigurations;

    public static DescribeLimitationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLimitationResponseBody self = new DescribeLimitationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLimitationResponseBody setMaxNumberOfLifecycleHooks(Integer maxNumberOfLifecycleHooks) {
        this.maxNumberOfLifecycleHooks = maxNumberOfLifecycleHooks;
        return this;
    }
    public Integer getMaxNumberOfLifecycleHooks() {
        return this.maxNumberOfLifecycleHooks;
    }

    public DescribeLimitationResponseBody setMaxNumberOfScalingRules(Integer maxNumberOfScalingRules) {
        this.maxNumberOfScalingRules = maxNumberOfScalingRules;
        return this;
    }
    public Integer getMaxNumberOfScalingRules() {
        return this.maxNumberOfScalingRules;
    }

    public DescribeLimitationResponseBody setMaxNumberOfScalingInstances(Integer maxNumberOfScalingInstances) {
        this.maxNumberOfScalingInstances = maxNumberOfScalingInstances;
        return this;
    }
    public Integer getMaxNumberOfScalingInstances() {
        return this.maxNumberOfScalingInstances;
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

    public DescribeLimitationResponseBody setMaxNumberOfLoadBalancers(Integer maxNumberOfLoadBalancers) {
        this.maxNumberOfLoadBalancers = maxNumberOfLoadBalancers;
        return this;
    }
    public Integer getMaxNumberOfLoadBalancers() {
        return this.maxNumberOfLoadBalancers;
    }

    public DescribeLimitationResponseBody setMaxNumberOfMinSize(Integer maxNumberOfMinSize) {
        this.maxNumberOfMinSize = maxNumberOfMinSize;
        return this;
    }
    public Integer getMaxNumberOfMinSize() {
        return this.maxNumberOfMinSize;
    }

    public DescribeLimitationResponseBody setMaxNumberOfScalingGroups(Integer maxNumberOfScalingGroups) {
        this.maxNumberOfScalingGroups = maxNumberOfScalingGroups;
        return this;
    }
    public Integer getMaxNumberOfScalingGroups() {
        return this.maxNumberOfScalingGroups;
    }

    public DescribeLimitationResponseBody setMaxNumberOfNotificationConfigurations(Integer maxNumberOfNotificationConfigurations) {
        this.maxNumberOfNotificationConfigurations = maxNumberOfNotificationConfigurations;
        return this;
    }
    public Integer getMaxNumberOfNotificationConfigurations() {
        return this.maxNumberOfNotificationConfigurations;
    }

    public DescribeLimitationResponseBody setMaxNumberOfMaxSize(Integer maxNumberOfMaxSize) {
        this.maxNumberOfMaxSize = maxNumberOfMaxSize;
        return this;
    }
    public Integer getMaxNumberOfMaxSize() {
        return this.maxNumberOfMaxSize;
    }

    public DescribeLimitationResponseBody setMaxNumberOfDBInstances(Integer maxNumberOfDBInstances) {
        this.maxNumberOfDBInstances = maxNumberOfDBInstances;
        return this;
    }
    public Integer getMaxNumberOfDBInstances() {
        return this.maxNumberOfDBInstances;
    }

    public DescribeLimitationResponseBody setMaxNumberOfScalingConfigurations(Integer maxNumberOfScalingConfigurations) {
        this.maxNumberOfScalingConfigurations = maxNumberOfScalingConfigurations;
        return this;
    }
    public Integer getMaxNumberOfScalingConfigurations() {
        return this.maxNumberOfScalingConfigurations;
    }

}
