// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class UpdateEnterpriseSnapshotPolicyRequest extends TeaModel {
    /**
     * <p>Ensures the idempotence of the request. Generate a parameter value from your client to ensure that the value is unique across different requests. The ClientToken value supports only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The cross-region copy destination information.</p>
     */
    @NameInMap("CrossRegionCopyInfo")
    public UpdateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfo crossRegionCopyInfo;

    /**
     * <p>The description of the snapshot policy.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Desc")
    public String desc;

    /**
     * <p>The ID of the policy to modify.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The snapshot policy ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esp-xxx</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The retention rule.</p>
     */
    @NameInMap("RetainRule")
    public UpdateEnterpriseSnapshotPolicyRequestRetainRule retainRule;

    /**
     * <p>The schedule rule.</p>
     */
    @NameInMap("Schedule")
    public UpdateEnterpriseSnapshotPolicyRequestSchedule schedule;

    /**
     * <p>The special retention rules.</p>
     */
    @NameInMap("SpecialRetainRules")
    public UpdateEnterpriseSnapshotPolicyRequestSpecialRetainRules specialRetainRules;

    /**
     * <p>The status of the snapshot policy. Valid values:</p>
     * <ul>
     * <li>ENABLED</li>
     * <li>DISABLED</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ENABLED</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The advanced snapshot feature.</p>
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
         * <p>The destination region ID for snapshot replication. You can call <a href="https://help.aliyun.com/document_detail/354206.html">DescribeDiskReplicaPairs</a> to query the region information of existing asynchronous replication relationships.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of days to retain snapshots in the destination region. The value must be greater than 1.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
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
         * <p>Specifies whether to enable cross-region replication. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The destination region information.</p>
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
         * <p>The number of snapshots to retain. Valid values: 1 to 256.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Number")
        public Integer number;

        /**
         * <p>The time interval of the retention rule. The unit is specified by the TimeUnit parameter. The value must be greater than 1.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("TimeInterval")
        public Integer timeInterval;

        /**
         * <p>The unit of the retention time. Valid values:</p>
         * <ul>
         * <li>DAYS</li>
         * <li>WEEKS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DAYS</p>
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
         * <p>The execution cycle and time of the policy. A cron expression is used.</p>
         * <p>For example, <code>0 0 4 1/1 * ?</code> specifies that the snapshot operation is performed at 04:00 every day, starting from the first day of each month.</p>
         * <p>This parameter is required.</p>
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
         * <p>The period unit for special retention snapshots. For example, if this parameter is set to WEEKS, the first snapshot of each week is given special retention. The retention duration is determined by the TimeUnit and TimeInterval parameters. Valid values:</p>
         * <ul>
         * <li>WEEKS</li>
         * <li>MONTHS</li>
         * <li>YEARS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WEEKS</p>
         */
        @NameInMap("SpecialPeriodUnit")
        public String specialPeriodUnit;

        /**
         * <p>The time interval of the retention rule. The unit is specified by the TimeUnit parameter. The value must be greater than 1.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TimeInterval")
        public Integer timeInterval;

        /**
         * <p>The unit of the retention time for special snapshots. Valid values:</p>
         * <ul>
         * <li>DAYS</li>
         * <li>WEEKS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DAYS</p>
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
         * <p>Specifies whether to enable special retention. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The list of special retention rules. Multiple rules are supported.</p>
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
         * <p>Specifies whether to enable instant access for snapshots. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
