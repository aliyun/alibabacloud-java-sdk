// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class CreateEnterpriseSnapshotPolicyRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotency of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Snapshot replication destination information.</p>
     */
    @NameInMap("CrossRegionCopyInfo")
    public CreateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfo crossRegionCopyInfo;

    /**
     * <p>The description of the policy.</p>
     */
    @NameInMap("Desc")
    public String desc;

    /**
     * <p>The name of the policy.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID . You can call the [DescribeRegions](~~354276~~) operation to query the most recent list of regions in which snapshot policy is supported.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which to assign the snapshot policy.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The snapshot retention rule.</p>
     */
    @NameInMap("RetainRule")
    public CreateEnterpriseSnapshotPolicyRequestRetainRule retainRule;

    /**
     * <p>The rule for scheduling.</p>
     */
    @NameInMap("Schedule")
    public CreateEnterpriseSnapshotPolicyRequestSchedule schedule;

    /**
     * <p>The special snapshot retention rules.</p>
     */
    @NameInMap("SpecialRetainRules")
    public CreateEnterpriseSnapshotPolicyRequestSpecialRetainRules specialRetainRules;

    /**
     * <p>The status of the policy. Valid values:</p>
     * <br>
     * <p>- ENABLED: Enable snapshot policy execution.</p>
     * <br>
     * <p>- DISABLED: Disable snapshot policy execution.</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>Advanced snapshot features.</p>
     */
    @NameInMap("StorageRule")
    public CreateEnterpriseSnapshotPolicyRequestStorageRule storageRule;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateEnterpriseSnapshotPolicyRequestTag> tag;

    /**
     * <p>Binding target type, valid value:</p>
     * <br>
     * <p>- DISK</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static CreateEnterpriseSnapshotPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnterpriseSnapshotPolicyRequest self = new CreateEnterpriseSnapshotPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnterpriseSnapshotPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEnterpriseSnapshotPolicyRequest setCrossRegionCopyInfo(CreateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfo crossRegionCopyInfo) {
        this.crossRegionCopyInfo = crossRegionCopyInfo;
        return this;
    }
    public CreateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfo getCrossRegionCopyInfo() {
        return this.crossRegionCopyInfo;
    }

    public CreateEnterpriseSnapshotPolicyRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateEnterpriseSnapshotPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateEnterpriseSnapshotPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateEnterpriseSnapshotPolicyRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateEnterpriseSnapshotPolicyRequest setRetainRule(CreateEnterpriseSnapshotPolicyRequestRetainRule retainRule) {
        this.retainRule = retainRule;
        return this;
    }
    public CreateEnterpriseSnapshotPolicyRequestRetainRule getRetainRule() {
        return this.retainRule;
    }

    public CreateEnterpriseSnapshotPolicyRequest setSchedule(CreateEnterpriseSnapshotPolicyRequestSchedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public CreateEnterpriseSnapshotPolicyRequestSchedule getSchedule() {
        return this.schedule;
    }

    public CreateEnterpriseSnapshotPolicyRequest setSpecialRetainRules(CreateEnterpriseSnapshotPolicyRequestSpecialRetainRules specialRetainRules) {
        this.specialRetainRules = specialRetainRules;
        return this;
    }
    public CreateEnterpriseSnapshotPolicyRequestSpecialRetainRules getSpecialRetainRules() {
        return this.specialRetainRules;
    }

    public CreateEnterpriseSnapshotPolicyRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateEnterpriseSnapshotPolicyRequest setStorageRule(CreateEnterpriseSnapshotPolicyRequestStorageRule storageRule) {
        this.storageRule = storageRule;
        return this;
    }
    public CreateEnterpriseSnapshotPolicyRequestStorageRule getStorageRule() {
        return this.storageRule;
    }

    public CreateEnterpriseSnapshotPolicyRequest setTag(java.util.List<CreateEnterpriseSnapshotPolicyRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateEnterpriseSnapshotPolicyRequestTag> getTag() {
        return this.tag;
    }

    public CreateEnterpriseSnapshotPolicyRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public static class CreateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfoRegions extends TeaModel {
        /**
         * <p>The region ID of the destination. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Number of days to retain the destination snapshot. The range of values is greater than 1.</p>
         */
        @NameInMap("RetainDays")
        public Integer retainDays;

        public static CreateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfoRegions build(java.util.Map<String, ?> map) throws Exception {
            CreateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfoRegions self = new CreateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfoRegions();
            return TeaModel.build(map, self);
        }

        public CreateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfoRegions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfoRegions setRetainDays(Integer retainDays) {
            this.retainDays = retainDays;
            return this;
        }
        public Integer getRetainDays() {
            return this.retainDays;
        }

    }

    public static class CreateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfo extends TeaModel {
        /**
         * <p>Whether cross-region replication is enabled. The range of values:</p>
         * <br>
         * <p>- true</p>
         * <br>
         * <p>- false</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The list of destination regions.</p>
         */
        @NameInMap("Regions")
        public java.util.List<CreateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfoRegions> regions;

        public static CreateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfo self = new CreateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfo();
            return TeaModel.build(map, self);
        }

        public CreateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfo setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfo setRegions(java.util.List<CreateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfoRegions> regions) {
            this.regions = regions;
            return this;
        }
        public java.util.List<CreateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfoRegions> getRegions() {
            return this.regions;
        }

    }

    public static class CreateEnterpriseSnapshotPolicyRequestRetainRule extends TeaModel {
        /**
         * <p>Maximum number of retained snapshots.</p>
         */
        @NameInMap("Number")
        public Integer number;

        /**
         * <p>The time interval , valid value greater than 1.</p>
         */
        @NameInMap("TimeInterval")
        public Integer timeInterval;

        /**
         * <p>The unit of time, valid values:</p>
         * <br>
         * <p>- DAYS</p>
         * <br>
         * <p>- WEEKS</p>
         */
        @NameInMap("TimeUnit")
        public String timeUnit;

        public static CreateEnterpriseSnapshotPolicyRequestRetainRule build(java.util.Map<String, ?> map) throws Exception {
            CreateEnterpriseSnapshotPolicyRequestRetainRule self = new CreateEnterpriseSnapshotPolicyRequestRetainRule();
            return TeaModel.build(map, self);
        }

        public CreateEnterpriseSnapshotPolicyRequestRetainRule setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

        public CreateEnterpriseSnapshotPolicyRequestRetainRule setTimeInterval(Integer timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }
        public Integer getTimeInterval() {
            return this.timeInterval;
        }

        public CreateEnterpriseSnapshotPolicyRequestRetainRule setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

    }

    public static class CreateEnterpriseSnapshotPolicyRequestSchedule extends TeaModel {
        /**
         * <p>The time when the policy will to be scheduled. Valid values: Set the parameter in a cron expression.</p>
         * <br>
         * <p>For example, you can use 0 0 4 1/1 * ? to specify 04:00:00 (UTC+8) on the first day of each month.</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        public static CreateEnterpriseSnapshotPolicyRequestSchedule build(java.util.Map<String, ?> map) throws Exception {
            CreateEnterpriseSnapshotPolicyRequestSchedule self = new CreateEnterpriseSnapshotPolicyRequestSchedule();
            return TeaModel.build(map, self);
        }

        public CreateEnterpriseSnapshotPolicyRequestSchedule setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

    }

    public static class CreateEnterpriseSnapshotPolicyRequestSpecialRetainRulesRules extends TeaModel {
        /**
         * <p>The periodic unit for specially retained snapshots. If configured to WEEKS, it provides special retention for the first snapshot of each week. The retention period is determined by TimeUnit and TimeInterval. The range of values are:</p>
         * <p>- WEEKS</p>
         * <p>- MONTHS</p>
         * <p>- YEARS</p>
         */
        @NameInMap("SpecialPeriodUnit")
        public String specialPeriodUnit;

        /**
         * <p>Retention Time Value. The range of values is greater than 1.</p>
         */
        @NameInMap("TimeInterval")
        public Integer timeInterval;

        /**
         * <p>Retention time unit for special snapshots. The range of values:</p>
         * <br>
         * <p>- DAYS</p>
         * <br>
         * <p>- WEEKS</p>
         */
        @NameInMap("TimeUnit")
        public String timeUnit;

        public static CreateEnterpriseSnapshotPolicyRequestSpecialRetainRulesRules build(java.util.Map<String, ?> map) throws Exception {
            CreateEnterpriseSnapshotPolicyRequestSpecialRetainRulesRules self = new CreateEnterpriseSnapshotPolicyRequestSpecialRetainRulesRules();
            return TeaModel.build(map, self);
        }

        public CreateEnterpriseSnapshotPolicyRequestSpecialRetainRulesRules setSpecialPeriodUnit(String specialPeriodUnit) {
            this.specialPeriodUnit = specialPeriodUnit;
            return this;
        }
        public String getSpecialPeriodUnit() {
            return this.specialPeriodUnit;
        }

        public CreateEnterpriseSnapshotPolicyRequestSpecialRetainRulesRules setTimeInterval(Integer timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }
        public Integer getTimeInterval() {
            return this.timeInterval;
        }

        public CreateEnterpriseSnapshotPolicyRequestSpecialRetainRulesRules setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

    }

    public static class CreateEnterpriseSnapshotPolicyRequestSpecialRetainRules extends TeaModel {
        /**
         * <p>Indicates whether the special retention is enabled.</p>
         * <br>
         * <p>*   true: enable</p>
         * <p>*   false: disable</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The special retention rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<CreateEnterpriseSnapshotPolicyRequestSpecialRetainRulesRules> rules;

        public static CreateEnterpriseSnapshotPolicyRequestSpecialRetainRules build(java.util.Map<String, ?> map) throws Exception {
            CreateEnterpriseSnapshotPolicyRequestSpecialRetainRules self = new CreateEnterpriseSnapshotPolicyRequestSpecialRetainRules();
            return TeaModel.build(map, self);
        }

        public CreateEnterpriseSnapshotPolicyRequestSpecialRetainRules setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateEnterpriseSnapshotPolicyRequestSpecialRetainRules setRules(java.util.List<CreateEnterpriseSnapshotPolicyRequestSpecialRetainRulesRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<CreateEnterpriseSnapshotPolicyRequestSpecialRetainRulesRules> getRules() {
            return this.rules;
        }

    }

    public static class CreateEnterpriseSnapshotPolicyRequestStorageRule extends TeaModel {
        /**
         * <p>Whether to enable the rapid availability of snapshots. The range of values:</p>
         * <br>
         * <p>- true</p>
         * <br>
         * <p>- false</p>
         */
        @NameInMap("EnableImmediateAccess")
        public Boolean enableImmediateAccess;

        public static CreateEnterpriseSnapshotPolicyRequestStorageRule build(java.util.Map<String, ?> map) throws Exception {
            CreateEnterpriseSnapshotPolicyRequestStorageRule self = new CreateEnterpriseSnapshotPolicyRequestStorageRule();
            return TeaModel.build(map, self);
        }

        public CreateEnterpriseSnapshotPolicyRequestStorageRule setEnableImmediateAccess(Boolean enableImmediateAccess) {
            this.enableImmediateAccess = enableImmediateAccess;
            return this;
        }
        public Boolean getEnableImmediateAccess() {
            return this.enableImmediateAccess;
        }

    }

    public static class CreateEnterpriseSnapshotPolicyRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <br>
         * <p>The tag value can be 0 to 128 characters in length, and cannot start with `aliyun` or `acs:`. It cannot contain `http://` or `https://`.</p>
         * <br>
         * <p>Each tag key must have a unique tag value. You can specify at most 20 tag values in each call.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEnterpriseSnapshotPolicyRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateEnterpriseSnapshotPolicyRequestTag self = new CreateEnterpriseSnapshotPolicyRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateEnterpriseSnapshotPolicyRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateEnterpriseSnapshotPolicyRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
