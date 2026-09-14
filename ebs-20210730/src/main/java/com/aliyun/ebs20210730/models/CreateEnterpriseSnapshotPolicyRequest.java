// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class CreateEnterpriseSnapshotPolicyRequest extends TeaModel {
    /**
     * <p>Ensures the idempotence of the request. Generate a parameter value from your client that is unique across different requests. ClientToken supports only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The snapshot replication information.</p>
     */
    @NameInMap("CrossRegionCopyInfo")
    public CreateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfo crossRegionCopyInfo;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Desc")
    public String desc;

    /**
     * <p>The Policy Name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID. You can call DescribeRegions to query the regions that support asynchronous replication.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The retention rule.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RetainRule")
    public CreateEnterpriseSnapshotPolicyRequestRetainRule retainRule;

    /**
     * <p>The schedule rule.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Schedule")
    public CreateEnterpriseSnapshotPolicyRequestSchedule schedule;

    /**
     * <p>The special retention rules.</p>
     */
    @NameInMap("SpecialRetainRules")
    public CreateEnterpriseSnapshotPolicyRequestSpecialRetainRules specialRetainRules;

    /**
     * <p>The status. Valid values:</p>
     * <ul>
     * <li>DISABLED</li>
     * <li>ENABLED</li>
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
    public CreateEnterpriseSnapshotPolicyRequestStorageRule storageRule;

    /**
     * <p>The tag key-value pairs. Valid values of n: 1 to 20.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateEnterpriseSnapshotPolicyRequestTag> tag;

    /**
     * <p>The type. Valid values:</p>
     * <ul>
     * <li>DISK</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DISK</p>
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
         * <p>The ID of the destination region for snapshot replication. You can invoke <a href="https://help.aliyun.com/document_detail/354206.html">DescribeDiskReplicaPairs</a> to query the region information of existing asynchronous replication relationships.</p>
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
         * <p>The cycle and time at which the policy is executed. Specify the value in a cron expression.</p>
         * <p>For example, <code>0 0 4 1/1 * ?</code> specifies that the snapshot operation is performed at 4:00 AM every day, starting from the first day of each month.</p>
         * <p>This parameter is required.</p>
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
         * <p>The period unit for specially retained snapshots. For example, if this parameter is set to WEEKS, the first snapshot of each week is specially retained. The retention duration is determined by TimeUnit and TimeInterval. Valid values:</p>
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
         * <p>14</p>
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
         * <p>WEEKS</p>
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
         * <p>Specifies whether to enable special retention. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The list of special retention rules.</p>
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
         * <p>The tag key of the resource.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-value</p>
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
