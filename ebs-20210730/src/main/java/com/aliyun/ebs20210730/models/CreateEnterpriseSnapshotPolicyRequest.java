// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class CreateEnterpriseSnapshotPolicyRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CrossRegionCopyInfo")
    public CreateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfo crossRegionCopyInfo;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("RetainRule")
    public CreateEnterpriseSnapshotPolicyRequestRetainRule retainRule;

    @NameInMap("Schedule")
    public CreateEnterpriseSnapshotPolicyRequestSchedule schedule;

    @NameInMap("SpecialRetainRules")
    public CreateEnterpriseSnapshotPolicyRequestSpecialRetainRules specialRetainRules;

    @NameInMap("State")
    public String state;

    @NameInMap("StorageRule")
    public CreateEnterpriseSnapshotPolicyRequestStorageRule storageRule;

    @NameInMap("Tag")
    public java.util.List<CreateEnterpriseSnapshotPolicyRequestTag> tag;

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
        @NameInMap("RegionId")
        public String regionId;

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
        @NameInMap("Enabled")
        public Boolean enabled;

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
        @NameInMap("Number")
        public Integer number;

        @NameInMap("TimeInterval")
        public Integer timeInterval;

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
        @NameInMap("SpecialPeriodUnit")
        public String specialPeriodUnit;

        @NameInMap("TimeInterval")
        public Integer timeInterval;

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
        @NameInMap("Enabled")
        public Boolean enabled;

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
        @NameInMap("Key")
        public String key;

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
