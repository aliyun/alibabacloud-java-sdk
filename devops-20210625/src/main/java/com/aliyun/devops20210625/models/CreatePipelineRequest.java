// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreatePipelineRequest extends TeaModel {
    @NameInMap("basicInfo")
    public CreatePipelineRequestBasicInfo basicInfo;

    @NameInMap("pipelineYaml")
    public String pipelineYaml;

    @NameInMap("settings")
    public CreatePipelineRequestSettings settings;

    @NameInMap("triggerInfo")
    public CreatePipelineRequestTriggerInfo triggerInfo;

    public static CreatePipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineRequest self = new CreatePipelineRequest();
        return TeaModel.build(map, self);
    }

    public CreatePipelineRequest setBasicInfo(CreatePipelineRequestBasicInfo basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }
    public CreatePipelineRequestBasicInfo getBasicInfo() {
        return this.basicInfo;
    }

    public CreatePipelineRequest setPipelineYaml(String pipelineYaml) {
        this.pipelineYaml = pipelineYaml;
        return this;
    }
    public String getPipelineYaml() {
        return this.pipelineYaml;
    }

    public CreatePipelineRequest setSettings(CreatePipelineRequestSettings settings) {
        this.settings = settings;
        return this;
    }
    public CreatePipelineRequestSettings getSettings() {
        return this.settings;
    }

    public CreatePipelineRequest setTriggerInfo(CreatePipelineRequestTriggerInfo triggerInfo) {
        this.triggerInfo = triggerInfo;
        return this;
    }
    public CreatePipelineRequestTriggerInfo getTriggerInfo() {
        return this.triggerInfo;
    }

    public static class CreatePipelineRequestBasicInfo extends TeaModel {
        @NameInMap("envId")
        public Long envId;

        @NameInMap("groupId")
        public Long groupId;

        @NameInMap("name")
        public String name;

        @NameInMap("tagIds")
        public String tagIds;

        public static CreatePipelineRequestBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineRequestBasicInfo self = new CreatePipelineRequestBasicInfo();
            return TeaModel.build(map, self);
        }

        public CreatePipelineRequestBasicInfo setEnvId(Long envId) {
            this.envId = envId;
            return this;
        }
        public Long getEnvId() {
            return this.envId;
        }

        public CreatePipelineRequestBasicInfo setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public CreatePipelineRequestBasicInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreatePipelineRequestBasicInfo setTagIds(String tagIds) {
            this.tagIds = tagIds;
            return this;
        }
        public String getTagIds() {
            return this.tagIds;
        }

    }

    public static class CreatePipelineRequestSettingsCaches extends TeaModel {
        @NameInMap("desc")
        public String desc;

        @NameInMap("directory")
        public String directory;

        @NameInMap("disable")
        public Boolean disable;

        public static CreatePipelineRequestSettingsCaches build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineRequestSettingsCaches self = new CreatePipelineRequestSettingsCaches();
            return TeaModel.build(map, self);
        }

        public CreatePipelineRequestSettingsCaches setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public CreatePipelineRequestSettingsCaches setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

        public CreatePipelineRequestSettingsCaches setDisable(Boolean disable) {
            this.disable = disable;
            return this;
        }
        public Boolean getDisable() {
            return this.disable;
        }

    }

    public static class CreatePipelineRequestSettingsGlobalParams extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("mask")
        public Boolean mask;

        @NameInMap("runningConfig")
        public Boolean runningConfig;

        @NameInMap("value")
        public String value;

        public static CreatePipelineRequestSettingsGlobalParams build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineRequestSettingsGlobalParams self = new CreatePipelineRequestSettingsGlobalParams();
            return TeaModel.build(map, self);
        }

        public CreatePipelineRequestSettingsGlobalParams setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreatePipelineRequestSettingsGlobalParams setMask(Boolean mask) {
            this.mask = mask;
            return this;
        }
        public Boolean getMask() {
            return this.mask;
        }

        public CreatePipelineRequestSettingsGlobalParams setRunningConfig(Boolean runningConfig) {
            this.runningConfig = runningConfig;
            return this;
        }
        public Boolean getRunningConfig() {
            return this.runningConfig;
        }

        public CreatePipelineRequestSettingsGlobalParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreatePipelineRequestSettings extends TeaModel {
        @NameInMap("caches")
        public java.util.List<CreatePipelineRequestSettingsCaches> caches;

        @NameInMap("globalParams")
        public java.util.List<CreatePipelineRequestSettingsGlobalParams> globalParams;

        @NameInMap("runnerCacheMode")
        public String runnerCacheMode;

        public static CreatePipelineRequestSettings build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineRequestSettings self = new CreatePipelineRequestSettings();
            return TeaModel.build(map, self);
        }

        public CreatePipelineRequestSettings setCaches(java.util.List<CreatePipelineRequestSettingsCaches> caches) {
            this.caches = caches;
            return this;
        }
        public java.util.List<CreatePipelineRequestSettingsCaches> getCaches() {
            return this.caches;
        }

        public CreatePipelineRequestSettings setGlobalParams(java.util.List<CreatePipelineRequestSettingsGlobalParams> globalParams) {
            this.globalParams = globalParams;
            return this;
        }
        public java.util.List<CreatePipelineRequestSettingsGlobalParams> getGlobalParams() {
            return this.globalParams;
        }

        public CreatePipelineRequestSettings setRunnerCacheMode(String runnerCacheMode) {
            this.runnerCacheMode = runnerCacheMode;
            return this;
        }
        public String getRunnerCacheMode() {
            return this.runnerCacheMode;
        }

    }

    public static class CreatePipelineRequestTriggerInfoScheduled extends TeaModel {
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

        public static CreatePipelineRequestTriggerInfoScheduled build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineRequestTriggerInfoScheduled self = new CreatePipelineRequestTriggerInfoScheduled();
            return TeaModel.build(map, self);
        }

        public CreatePipelineRequestTriggerInfoScheduled setDaysOfWeek(String daysOfWeek) {
            this.daysOfWeek = daysOfWeek;
            return this;
        }
        public String getDaysOfWeek() {
            return this.daysOfWeek;
        }

        public CreatePipelineRequestTriggerInfoScheduled setFixedTime(String fixedTime) {
            this.fixedTime = fixedTime;
            return this;
        }
        public String getFixedTime() {
            return this.fixedTime;
        }

        public CreatePipelineRequestTriggerInfoScheduled setFrom(String from) {
            this.from = from;
            return this;
        }
        public String getFrom() {
            return this.from;
        }

        public CreatePipelineRequestTriggerInfoScheduled setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public CreatePipelineRequestTriggerInfoScheduled setOnlySourceChange(Boolean onlySourceChange) {
            this.onlySourceChange = onlySourceChange;
            return this;
        }
        public Boolean getOnlySourceChange() {
            return this.onlySourceChange;
        }

        public CreatePipelineRequestTriggerInfoScheduled setTo(String to) {
            this.to = to;
            return this;
        }
        public String getTo() {
            return this.to;
        }

        public CreatePipelineRequestTriggerInfoScheduled setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreatePipelineRequestTriggerInfo extends TeaModel {
        @NameInMap("scheduled")
        public CreatePipelineRequestTriggerInfoScheduled scheduled;

        @NameInMap("webhookEnable")
        public Boolean webhookEnable;

        public static CreatePipelineRequestTriggerInfo build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineRequestTriggerInfo self = new CreatePipelineRequestTriggerInfo();
            return TeaModel.build(map, self);
        }

        public CreatePipelineRequestTriggerInfo setScheduled(CreatePipelineRequestTriggerInfoScheduled scheduled) {
            this.scheduled = scheduled;
            return this;
        }
        public CreatePipelineRequestTriggerInfoScheduled getScheduled() {
            return this.scheduled;
        }

        public CreatePipelineRequestTriggerInfo setWebhookEnable(Boolean webhookEnable) {
            this.webhookEnable = webhookEnable;
            return this;
        }
        public Boolean getWebhookEnable() {
            return this.webhookEnable;
        }

    }

}
