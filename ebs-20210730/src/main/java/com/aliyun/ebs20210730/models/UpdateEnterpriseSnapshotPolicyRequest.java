// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class UpdateEnterpriseSnapshotPolicyRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Snapshot replication destination information.</p>
     */
    @NameInMap("CrossRegionCopyInfo")
    public UpdateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfo crossRegionCopyInfo;

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
     * <p>The id of the policy.</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The region ID . You can call the [DescribeRegions](~~354276~~) operation to query the most recent list of regions in which snapshot policy is supported.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Snapshot retention rule.</p>
     */
    @NameInMap("RetainRule")
    public UpdateEnterpriseSnapshotPolicyRequestRetainRule retainRule;

    /**
     * <p>The rule for scheduling.</p>
     */
    @NameInMap("Schedule")
    public UpdateEnterpriseSnapshotPolicyRequestSchedule schedule;

    /**
     * <p>The special snapshot retention rules.</p>
     */
    @NameInMap("SpecialRetainRules")
    public UpdateEnterpriseSnapshotPolicyRequestSpecialRetainRules specialRetainRules;

    /**
     * <p>The status of the policy. Valid values:</p>
     * <br>
     * <p>*   **ENABLED**: Enable snapshot policy execution.</p>
     * <p>*   **DISABLED**: Disable snapshot policy execution.</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>Advanced snapshot features.</p>
     */
    @NameInMap("StorageRule")
    public UpdateEnterpriseSnapshotPolicyRequestStorageRule storageRule;

    public static UpdateEnterpriseSnapshotPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnterpriseSnapshotPolicyRequest self = new UpdateEnterpriseSnapshotPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEnterpriseSnapshotPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateEnterpriseSnapshotPolicyRequest setCrossRegionCopyInfo(UpdateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfo crossRegionCopyInfo) {
        this.crossRegionCopyInfo = crossRegionCopyInfo;
        return this;
    }
    public UpdateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfo getCrossRegionCopyInfo() {
        return this.crossRegionCopyInfo;
    }

    public UpdateEnterpriseSnapshotPolicyRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public UpdateEnterpriseSnapshotPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateEnterpriseSnapshotPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public UpdateEnterpriseSnapshotPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateEnterpriseSnapshotPolicyRequest setRetainRule(UpdateEnterpriseSnapshotPolicyRequestRetainRule retainRule) {
        this.retainRule = retainRule;
        return this;
    }
    public UpdateEnterpriseSnapshotPolicyRequestRetainRule getRetainRule() {
        return this.retainRule;
    }

    public UpdateEnterpriseSnapshotPolicyRequest setSchedule(UpdateEnterpriseSnapshotPolicyRequestSchedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public UpdateEnterpriseSnapshotPolicyRequestSchedule getSchedule() {
        return this.schedule;
    }

    public UpdateEnterpriseSnapshotPolicyRequest setSpecialRetainRules(UpdateEnterpriseSnapshotPolicyRequestSpecialRetainRules specialRetainRules) {
        this.specialRetainRules = specialRetainRules;
        return this;
    }
    public UpdateEnterpriseSnapshotPolicyRequestSpecialRetainRules getSpecialRetainRules() {
        return this.specialRetainRules;
    }

    public UpdateEnterpriseSnapshotPolicyRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public UpdateEnterpriseSnapshotPolicyRequest setStorageRule(UpdateEnterpriseSnapshotPolicyRequestStorageRule storageRule) {
        this.storageRule = storageRule;
        return this;
    }
    public UpdateEnterpriseSnapshotPolicyRequestStorageRule getStorageRule() {
        return this.storageRule;
    }

    public static class UpdateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfoRegions extends TeaModel {
        /**
         * <p>The region ID. You can call the [DescribeRegions](~~354276~~) operation to query the most recent list of regions in which async replication is supported.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Number of days to retain the destination snapshot. The range of values is greater than 1.</p>
         */
        @NameInMap("RetainDays")
        public Integer retainDays;

        public static UpdateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfoRegions build(java.util.Map<String, ?> map) throws Exception {
            UpdateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfoRegions self = new UpdateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfoRegions();
            return TeaModel.build(map, self);
        }

        public UpdateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfoRegions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfoRegions setRetainDays(Integer retainDays) {
            this.retainDays = retainDays;
            return this;
        }
        public Integer getRetainDays() {
            return this.retainDays;
        }

    }

    public static class UpdateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfo extends TeaModel {
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
         * <p>Destination region information.</p>
         */
        @NameInMap("Regions")
        public java.util.List<UpdateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfoRegions> regions;

        public static UpdateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfo self = new UpdateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfo();
            return TeaModel.build(map, self);
        }

        public UpdateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfo setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfo setRegions(java.util.List<UpdateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfoRegions> regions) {
            this.regions = regions;
            return this;
        }
        public java.util.List<UpdateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfoRegions> getRegions() {
            return this.regions;
        }

    }

    public static class UpdateEnterpriseSnapshotPolicyRequestRetainRule extends TeaModel {
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
         * <p>- WEEKS</p>
         */
        @NameInMap("TimeUnit")
        public String timeUnit;

        public static UpdateEnterpriseSnapshotPolicyRequestRetainRule build(java.util.Map<String, ?> map) throws Exception {
            UpdateEnterpriseSnapshotPolicyRequestRetainRule self = new UpdateEnterpriseSnapshotPolicyRequestRetainRule();
            return TeaModel.build(map, self);
        }

        public UpdateEnterpriseSnapshotPolicyRequestRetainRule setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

        public UpdateEnterpriseSnapshotPolicyRequestRetainRule setTimeInterval(Integer timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }
        public Integer getTimeInterval() {
            return this.timeInterval;
        }

        public UpdateEnterpriseSnapshotPolicyRequestRetainRule setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

    }

    public static class UpdateEnterpriseSnapshotPolicyRequestSchedule extends TeaModel {
        /**
         * <p>The time when the policy will to be scheduled. Valid values: Set the parameter in a cron expression.</p>
         * <br>
         * <p>For example, you can use `0 0 4 1/1 * ?` to specify 04:00:00 (UTC+8) on the first day of each month.</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        public static UpdateEnterpriseSnapshotPolicyRequestSchedule build(java.util.Map<String, ?> map) throws Exception {
            UpdateEnterpriseSnapshotPolicyRequestSchedule self = new UpdateEnterpriseSnapshotPolicyRequestSchedule();
            return TeaModel.build(map, self);
        }

        public UpdateEnterpriseSnapshotPolicyRequestSchedule setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

    }

    public static class UpdateEnterpriseSnapshotPolicyRequestSpecialRetainRulesRules extends TeaModel {
        /**
         * <p>The periodic unit for specially retained snapshots. If configured to WEEKS, it provides special retention for the first snapshot of each week. The retention period is determined by TimeUnit and TimeInterval. The range of values are:</p>
         * <p>- WEEKS</p>
         * <p>- MONTHS</p>
         * <p>- YEARS"</p>
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

        public static UpdateEnterpriseSnapshotPolicyRequestSpecialRetainRulesRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateEnterpriseSnapshotPolicyRequestSpecialRetainRulesRules self = new UpdateEnterpriseSnapshotPolicyRequestSpecialRetainRulesRules();
            return TeaModel.build(map, self);
        }

        public UpdateEnterpriseSnapshotPolicyRequestSpecialRetainRulesRules setSpecialPeriodUnit(String specialPeriodUnit) {
            this.specialPeriodUnit = specialPeriodUnit;
            return this;
        }
        public String getSpecialPeriodUnit() {
            return this.specialPeriodUnit;
        }

        public UpdateEnterpriseSnapshotPolicyRequestSpecialRetainRulesRules setTimeInterval(Integer timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }
        public Integer getTimeInterval() {
            return this.timeInterval;
        }

        public UpdateEnterpriseSnapshotPolicyRequestSpecialRetainRulesRules setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

    }

    public static class UpdateEnterpriseSnapshotPolicyRequestSpecialRetainRules extends TeaModel {
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
        public java.util.List<UpdateEnterpriseSnapshotPolicyRequestSpecialRetainRulesRules> rules;

        public static UpdateEnterpriseSnapshotPolicyRequestSpecialRetainRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateEnterpriseSnapshotPolicyRequestSpecialRetainRules self = new UpdateEnterpriseSnapshotPolicyRequestSpecialRetainRules();
            return TeaModel.build(map, self);
        }

        public UpdateEnterpriseSnapshotPolicyRequestSpecialRetainRules setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateEnterpriseSnapshotPolicyRequestSpecialRetainRules setRules(java.util.List<UpdateEnterpriseSnapshotPolicyRequestSpecialRetainRulesRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<UpdateEnterpriseSnapshotPolicyRequestSpecialRetainRulesRules> getRules() {
            return this.rules;
        }

    }

    public static class UpdateEnterpriseSnapshotPolicyRequestStorageRule extends TeaModel {
        /**
         * <p>Whether to enable the rapid availability of snapshots. The range of values:</p>
         * <br>
         * <p>- true</p>
         * <br>
         * <p>- false</p>
         */
        @NameInMap("EnableImmediateAccess")
        public Boolean enableImmediateAccess;

        public static UpdateEnterpriseSnapshotPolicyRequestStorageRule build(java.util.Map<String, ?> map) throws Exception {
            UpdateEnterpriseSnapshotPolicyRequestStorageRule self = new UpdateEnterpriseSnapshotPolicyRequestStorageRule();
            return TeaModel.build(map, self);
        }

        public UpdateEnterpriseSnapshotPolicyRequestStorageRule setEnableImmediateAccess(Boolean enableImmediateAccess) {
            this.enableImmediateAccess = enableImmediateAccess;
            return this;
        }
        public Boolean getEnableImmediateAccess() {
            return this.enableImmediateAccess;
        }

    }

}
