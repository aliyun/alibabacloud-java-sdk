// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdatePipelineRequest extends TeaModel {
    @NameInMap("basicInfo")
    public UpdatePipelineRequestBasicInfo basicInfo;

    @NameInMap("pipelineYaml")
    public String pipelineYaml;

    @NameInMap("settings")
    public UpdatePipelineRequestSettings settings;

    @NameInMap("triggerInfo")
    public UpdatePipelineRequestTriggerInfo triggerInfo;

    public static UpdatePipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelineRequest self = new UpdatePipelineRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePipelineRequest setBasicInfo(UpdatePipelineRequestBasicInfo basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }
    public UpdatePipelineRequestBasicInfo getBasicInfo() {
        return this.basicInfo;
    }

    public UpdatePipelineRequest setPipelineYaml(String pipelineYaml) {
        this.pipelineYaml = pipelineYaml;
        return this;
    }
    public String getPipelineYaml() {
        return this.pipelineYaml;
    }

    public UpdatePipelineRequest setSettings(UpdatePipelineRequestSettings settings) {
        this.settings = settings;
        return this;
    }
    public UpdatePipelineRequestSettings getSettings() {
        return this.settings;
    }

    public UpdatePipelineRequest setTriggerInfo(UpdatePipelineRequestTriggerInfo triggerInfo) {
        this.triggerInfo = triggerInfo;
        return this;
    }
    public UpdatePipelineRequestTriggerInfo getTriggerInfo() {
        return this.triggerInfo;
    }

    public static class UpdatePipelineRequestBasicInfo extends TeaModel {
        @NameInMap("envId")
        public Long envId;

        @NameInMap("groupId")
        public Long groupId;

        @NameInMap("name")
        public String name;

        @NameInMap("pipelineId")
        public Long pipelineId;

        @NameInMap("tagIds")
        public String tagIds;

        public static UpdatePipelineRequestBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdatePipelineRequestBasicInfo self = new UpdatePipelineRequestBasicInfo();
            return TeaModel.build(map, self);
        }

        public UpdatePipelineRequestBasicInfo setEnvId(Long envId) {
            this.envId = envId;
            return this;
        }
        public Long getEnvId() {
            return this.envId;
        }

        public UpdatePipelineRequestBasicInfo setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public UpdatePipelineRequestBasicInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdatePipelineRequestBasicInfo setPipelineId(Long pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public Long getPipelineId() {
            return this.pipelineId;
        }

        public UpdatePipelineRequestBasicInfo setTagIds(String tagIds) {
            this.tagIds = tagIds;
            return this;
        }
        public String getTagIds() {
            return this.tagIds;
        }

    }

    public static class UpdatePipelineRequestSettingsCaches extends TeaModel {
        @NameInMap("desc")
        public String desc;

        @NameInMap("directory")
        public String directory;

        @NameInMap("disable")
        public Boolean disable;

        public static UpdatePipelineRequestSettingsCaches build(java.util.Map<String, ?> map) throws Exception {
            UpdatePipelineRequestSettingsCaches self = new UpdatePipelineRequestSettingsCaches();
            return TeaModel.build(map, self);
        }

        public UpdatePipelineRequestSettingsCaches setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public UpdatePipelineRequestSettingsCaches setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public UpdatePipelineRequestSettingsCaches setDisable(Boolean disable) {
            this.disable = disable;
            return this;
        }
        public Boolean getDisable() {
            return this.disable;
        }

    }

    public static class UpdatePipelineRequestSettingsGlobalParams extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("mask")
        public Boolean mask;

        @NameInMap("runningConfig")
        public Boolean runningConfig;

        @NameInMap("value")
        public String value;

        public static UpdatePipelineRequestSettingsGlobalParams build(java.util.Map<String, ?> map) throws Exception {
            UpdatePipelineRequestSettingsGlobalParams self = new UpdatePipelineRequestSettingsGlobalParams();
            return TeaModel.build(map, self);
        }

        public UpdatePipelineRequestSettingsGlobalParams setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdatePipelineRequestSettingsGlobalParams setMask(Boolean mask) {
            this.mask = mask;
            return this;
        }
        public Boolean getMask() {
            return this.mask;
        }

        public UpdatePipelineRequestSettingsGlobalParams setRunningConfig(Boolean runningConfig) {
            this.runningConfig = runningConfig;
            return this;
        }
        public Boolean getRunningConfig() {
            return this.runningConfig;
        }

        public UpdatePipelineRequestSettingsGlobalParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdatePipelineRequestSettings extends TeaModel {
        @NameInMap("caches")
        public java.util.List<UpdatePipelineRequestSettingsCaches> caches;

        @NameInMap("globalParams")
        public java.util.List<UpdatePipelineRequestSettingsGlobalParams> globalParams;

        @NameInMap("runnerCacheMode")
        public String runnerCacheMode;

        public static UpdatePipelineRequestSettings build(java.util.Map<String, ?> map) throws Exception {
            UpdatePipelineRequestSettings self = new UpdatePipelineRequestSettings();
            return TeaModel.build(map, self);
        }

        public UpdatePipelineRequestSettings setCaches(java.util.List<UpdatePipelineRequestSettingsCaches> caches) {
            this.caches = caches;
            return this;
        }
        public java.util.List<UpdatePipelineRequestSettingsCaches> getCaches() {
            return this.caches;
        }

        public UpdatePipelineRequestSettings setGlobalParams(java.util.List<UpdatePipelineRequestSettingsGlobalParams> globalParams) {
            this.globalParams = globalParams;
            return this;
        }
        public java.util.List<UpdatePipelineRequestSettingsGlobalParams> getGlobalParams() {
            return this.globalParams;
        }

        public UpdatePipelineRequestSettings setRunnerCacheMode(String runnerCacheMode) {
            this.runnerCacheMode = runnerCacheMode;
            return this;
        }
        public String getRunnerCacheMode() {
            return this.runnerCacheMode;
        }

    }

    public static class UpdatePipelineRequestTriggerInfoScheduled extends TeaModel {
        @NameInMap("daysOfWeek")
        public String daysOfWeek;

        @NameInMap("fixedTime")
        public String fixedTime;

        @NameInMap("from")
        public String from;

        @NameInMap("interval")
        public Integer interval;

        @NameInMap("onlySourceChange")
        public Boolean onlySourceChange;

        @NameInMap("to")
        public String to;

        @NameInMap("type")
        public String type;

        public static UpdatePipelineRequestTriggerInfoScheduled build(java.util.Map<String, ?> map) throws Exception {
            UpdatePipelineRequestTriggerInfoScheduled self = new UpdatePipelineRequestTriggerInfoScheduled();
            return TeaModel.build(map, self);
        }

        public UpdatePipelineRequestTriggerInfoScheduled setDaysOfWeek(String daysOfWeek) {
            this.daysOfWeek = daysOfWeek;
            return this;
        }
        public String getDaysOfWeek() {
            return this.daysOfWeek;
        }

        public UpdatePipelineRequestTriggerInfoScheduled setFixedTime(String fixedTime) {
            this.fixedTime = fixedTime;
            return this;
        }
        public String getFixedTime() {
            return this.fixedTime;
        }

        public UpdatePipelineRequestTriggerInfoScheduled setFrom(String from) {
            this.from = from;
            return this;
        }
        public String getFrom() {
            return this.from;
        }

        public UpdatePipelineRequestTriggerInfoScheduled setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public UpdatePipelineRequestTriggerInfoScheduled setOnlySourceChange(Boolean onlySourceChange) {
            this.onlySourceChange = onlySourceChange;
            return this;
        }
        public Boolean getOnlySourceChange() {
            return this.onlySourceChange;
        }

        public UpdatePipelineRequestTriggerInfoScheduled setTo(String to) {
            this.to = to;
            return this;
        }
        public String getTo() {
            return this.to;
        }

        public UpdatePipelineRequestTriggerInfoScheduled setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdatePipelineRequestTriggerInfo extends TeaModel {
        @NameInMap("scheduled")
        public UpdatePipelineRequestTriggerInfoScheduled scheduled;

        @NameInMap("webhookEnable")
        public Boolean webhookEnable;

        public static UpdatePipelineRequestTriggerInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdatePipelineRequestTriggerInfo self = new UpdatePipelineRequestTriggerInfo();
            return TeaModel.build(map, self);
        }

        public UpdatePipelineRequestTriggerInfo setScheduled(UpdatePipelineRequestTriggerInfoScheduled scheduled) {
            this.scheduled = scheduled;
            return this;
        }
        public UpdatePipelineRequestTriggerInfoScheduled getScheduled() {
            return this.scheduled;
        }

        public UpdatePipelineRequestTriggerInfo setWebhookEnable(Boolean webhookEnable) {
            this.webhookEnable = webhookEnable;
            return this;
        }
        public Boolean getWebhookEnable() {
            return this.webhookEnable;
        }

    }

}
