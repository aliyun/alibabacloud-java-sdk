// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class UpdateEnterpriseSnapshotPolicyRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CrossRegionCopyInfo")
    public UpdateEnterpriseSnapshotPolicyRequestCrossRegionCopyInfo crossRegionCopyInfo;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("Name")
    public String name;

    @NameInMap("PolicyId")
    public String policyId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RetainRule")
    public UpdateEnterpriseSnapshotPolicyRequestRetainRule retainRule;

    @NameInMap("Schedule")
    public UpdateEnterpriseSnapshotPolicyRequestSchedule schedule;

    @NameInMap("SpecialRetainRules")
    public UpdateEnterpriseSnapshotPolicyRequestSpecialRetainRules specialRetainRules;

    @NameInMap("State")
    public String state;

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
        @NameInMap("RegionId")
        public String regionId;

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
        @NameInMap("Enabled")
        public Boolean enabled;

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
        @NameInMap("Number")
        public Integer number;

        @NameInMap("TimeInterval")
        public Integer timeInterval;

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
        @NameInMap("SpecialPeriodUnit")
        public String specialPeriodUnit;

        @NameInMap("TimeInterval")
        public Integer timeInterval;

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
        @NameInMap("Enabled")
        public Boolean enabled;

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
