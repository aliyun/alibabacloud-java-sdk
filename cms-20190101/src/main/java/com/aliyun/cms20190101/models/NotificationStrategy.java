// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class NotificationStrategy extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("EscalationSetting")
    public NotificationStrategyEscalationSetting escalationSetting;

    @NameInMap("FilterSetting")
    public NotificationStrategyFilterSetting filterSetting;

    @NameInMap("GroupingSetting")
    public NotificationStrategyGroupingSetting groupingSetting;

    @NameInMap("Name")
    public String name;

    @NameInMap("PushingSetting")
    public NotificationStrategyPushingSetting pushingSetting;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("Uuid")
    public String uuid;

    public static NotificationStrategy build(java.util.Map<String, ?> map) throws Exception {
        NotificationStrategy self = new NotificationStrategy();
        return TeaModel.build(map, self);
    }

    public NotificationStrategy setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public NotificationStrategy setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public NotificationStrategy setEscalationSetting(NotificationStrategyEscalationSetting escalationSetting) {
        this.escalationSetting = escalationSetting;
        return this;
    }
    public NotificationStrategyEscalationSetting getEscalationSetting() {
        return this.escalationSetting;
    }

    public NotificationStrategy setFilterSetting(NotificationStrategyFilterSetting filterSetting) {
        this.filterSetting = filterSetting;
        return this;
    }
    public NotificationStrategyFilterSetting getFilterSetting() {
        return this.filterSetting;
    }

    public NotificationStrategy setGroupingSetting(NotificationStrategyGroupingSetting groupingSetting) {
        this.groupingSetting = groupingSetting;
        return this;
    }
    public NotificationStrategyGroupingSetting getGroupingSetting() {
        return this.groupingSetting;
    }

    public NotificationStrategy setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public NotificationStrategy setPushingSetting(NotificationStrategyPushingSetting pushingSetting) {
        this.pushingSetting = pushingSetting;
        return this;
    }
    public NotificationStrategyPushingSetting getPushingSetting() {
        return this.pushingSetting;
    }

    public NotificationStrategy setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public NotificationStrategy setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public NotificationStrategy setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public static class NotificationStrategyEscalationSettingCustomChannels extends TeaModel {
        @NameInMap("ChannelType")
        public String channelType;

        @NameInMap("Severities")
        public java.util.List<String> severities;

        @NameInMap("TemplateUuid")
        public String templateUuid;

        public static NotificationStrategyEscalationSettingCustomChannels build(java.util.Map<String, ?> map) throws Exception {
            NotificationStrategyEscalationSettingCustomChannels self = new NotificationStrategyEscalationSettingCustomChannels();
            return TeaModel.build(map, self);
        }

        public NotificationStrategyEscalationSettingCustomChannels setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public NotificationStrategyEscalationSettingCustomChannels setSeverities(java.util.List<String> severities) {
            this.severities = severities;
            return this;
        }
        public java.util.List<String> getSeverities() {
            return this.severities;
        }

        public NotificationStrategyEscalationSettingCustomChannels setTemplateUuid(String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        public String getTemplateUuid() {
            return this.templateUuid;
        }

    }

    public static class NotificationStrategyEscalationSetting extends TeaModel {
        @NameInMap("AutoResolveMin")
        public Long autoResolveMin;

        @NameInMap("CustomChannels")
        public java.util.List<NotificationStrategyEscalationSettingCustomChannels> customChannels;

        @NameInMap("EscalationLevel")
        public String escalationLevel;

        @NameInMap("EscalationUuid")
        public String escalationUuid;

        @NameInMap("Range")
        public String range;

        @NameInMap("RetriggerMin")
        public Long retriggerMin;

        public static NotificationStrategyEscalationSetting build(java.util.Map<String, ?> map) throws Exception {
            NotificationStrategyEscalationSetting self = new NotificationStrategyEscalationSetting();
            return TeaModel.build(map, self);
        }

        public NotificationStrategyEscalationSetting setAutoResolveMin(Long autoResolveMin) {
            this.autoResolveMin = autoResolveMin;
            return this;
        }
        public Long getAutoResolveMin() {
            return this.autoResolveMin;
        }

        public NotificationStrategyEscalationSetting setCustomChannels(java.util.List<NotificationStrategyEscalationSettingCustomChannels> customChannels) {
            this.customChannels = customChannels;
            return this;
        }
        public java.util.List<NotificationStrategyEscalationSettingCustomChannels> getCustomChannels() {
            return this.customChannels;
        }

        public NotificationStrategyEscalationSetting setEscalationLevel(String escalationLevel) {
            this.escalationLevel = escalationLevel;
            return this;
        }
        public String getEscalationLevel() {
            return this.escalationLevel;
        }

        public NotificationStrategyEscalationSetting setEscalationUuid(String escalationUuid) {
            this.escalationUuid = escalationUuid;
            return this;
        }
        public String getEscalationUuid() {
            return this.escalationUuid;
        }

        public NotificationStrategyEscalationSetting setRange(String range) {
            this.range = range;
            return this;
        }
        public String getRange() {
            return this.range;
        }

        public NotificationStrategyEscalationSetting setRetriggerMin(Long retriggerMin) {
            this.retriggerMin = retriggerMin;
            return this;
        }
        public Long getRetriggerMin() {
            return this.retriggerMin;
        }

    }

    public static class NotificationStrategyFilterSettingBlackList extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Op")
        public String op;

        @NameInMap("Value")
        public String value;

        public static NotificationStrategyFilterSettingBlackList build(java.util.Map<String, ?> map) throws Exception {
            NotificationStrategyFilterSettingBlackList self = new NotificationStrategyFilterSettingBlackList();
            return TeaModel.build(map, self);
        }

        public NotificationStrategyFilterSettingBlackList setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public NotificationStrategyFilterSettingBlackList setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public NotificationStrategyFilterSettingBlackList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class NotificationStrategyFilterSettingWhiteList extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Op")
        public String op;

        @NameInMap("Value")
        public String value;

        public static NotificationStrategyFilterSettingWhiteList build(java.util.Map<String, ?> map) throws Exception {
            NotificationStrategyFilterSettingWhiteList self = new NotificationStrategyFilterSettingWhiteList();
            return TeaModel.build(map, self);
        }

        public NotificationStrategyFilterSettingWhiteList setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public NotificationStrategyFilterSettingWhiteList setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public NotificationStrategyFilterSettingWhiteList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class NotificationStrategyFilterSetting extends TeaModel {
        @NameInMap("BlackList")
        public java.util.List<java.util.List<NotificationStrategyFilterSettingBlackList>> blackList;

        @NameInMap("WhiteList")
        public java.util.List<java.util.List<NotificationStrategyFilterSettingWhiteList>> whiteList;

        public static NotificationStrategyFilterSetting build(java.util.Map<String, ?> map) throws Exception {
            NotificationStrategyFilterSetting self = new NotificationStrategyFilterSetting();
            return TeaModel.build(map, self);
        }

        public NotificationStrategyFilterSetting setBlackList(java.util.List<java.util.List<NotificationStrategyFilterSettingBlackList>> blackList) {
            this.blackList = blackList;
            return this;
        }
        public java.util.List<java.util.List<NotificationStrategyFilterSettingBlackList>> getBlackList() {
            return this.blackList;
        }

        public NotificationStrategyFilterSetting setWhiteList(java.util.List<java.util.List<NotificationStrategyFilterSettingWhiteList>> whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public java.util.List<java.util.List<NotificationStrategyFilterSettingWhiteList>> getWhiteList() {
            return this.whiteList;
        }

    }

    public static class NotificationStrategyGroupingSettingGroupingItems extends TeaModel {
        @NameInMap("Keys")
        public java.util.List<String> keys;

        @NameInMap("Type")
        public String type;

        public static NotificationStrategyGroupingSettingGroupingItems build(java.util.Map<String, ?> map) throws Exception {
            NotificationStrategyGroupingSettingGroupingItems self = new NotificationStrategyGroupingSettingGroupingItems();
            return TeaModel.build(map, self);
        }

        public NotificationStrategyGroupingSettingGroupingItems setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

        public NotificationStrategyGroupingSettingGroupingItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class NotificationStrategyGroupingSetting extends TeaModel {
        @NameInMap("EnableRawAlertDispatching")
        public Boolean enableRawAlertDispatching;

        @NameInMap("GroupingItems")
        public java.util.List<NotificationStrategyGroupingSettingGroupingItems> groupingItems;

        @NameInMap("PeriodMin")
        public Integer periodMin;

        @NameInMap("SilenceSec")
        public Integer silenceSec;

        @NameInMap("Times")
        public Integer times;

        public static NotificationStrategyGroupingSetting build(java.util.Map<String, ?> map) throws Exception {
            NotificationStrategyGroupingSetting self = new NotificationStrategyGroupingSetting();
            return TeaModel.build(map, self);
        }

        public NotificationStrategyGroupingSetting setEnableRawAlertDispatching(Boolean enableRawAlertDispatching) {
            this.enableRawAlertDispatching = enableRawAlertDispatching;
            return this;
        }
        public Boolean getEnableRawAlertDispatching() {
            return this.enableRawAlertDispatching;
        }

        public NotificationStrategyGroupingSetting setGroupingItems(java.util.List<NotificationStrategyGroupingSettingGroupingItems> groupingItems) {
            this.groupingItems = groupingItems;
            return this;
        }
        public java.util.List<NotificationStrategyGroupingSettingGroupingItems> getGroupingItems() {
            return this.groupingItems;
        }

        public NotificationStrategyGroupingSetting setPeriodMin(Integer periodMin) {
            this.periodMin = periodMin;
            return this;
        }
        public Integer getPeriodMin() {
            return this.periodMin;
        }

        public NotificationStrategyGroupingSetting setSilenceSec(Integer silenceSec) {
            this.silenceSec = silenceSec;
            return this;
        }
        public Integer getSilenceSec() {
            return this.silenceSec;
        }

        public NotificationStrategyGroupingSetting setTimes(Integer times) {
            this.times = times;
            return this;
        }
        public Integer getTimes() {
            return this.times;
        }

    }

    public static class NotificationStrategyPushingSetting extends TeaModel {
        @NameInMap("PushingDataFormat")
        public String pushingDataFormat;

        @NameInMap("Range")
        public String range;

        @NameInMap("TargetUuids")
        public java.util.List<String> targetUuids;

        @NameInMap("TemplateUuid")
        public String templateUuid;

        public static NotificationStrategyPushingSetting build(java.util.Map<String, ?> map) throws Exception {
            NotificationStrategyPushingSetting self = new NotificationStrategyPushingSetting();
            return TeaModel.build(map, self);
        }

        public NotificationStrategyPushingSetting setPushingDataFormat(String pushingDataFormat) {
            this.pushingDataFormat = pushingDataFormat;
            return this;
        }
        public String getPushingDataFormat() {
            return this.pushingDataFormat;
        }

        public NotificationStrategyPushingSetting setRange(String range) {
            this.range = range;
            return this;
        }
        public String getRange() {
            return this.range;
        }

        public NotificationStrategyPushingSetting setTargetUuids(java.util.List<String> targetUuids) {
            this.targetUuids = targetUuids;
            return this;
        }
        public java.util.List<String> getTargetUuids() {
            return this.targetUuids;
        }

        public NotificationStrategyPushingSetting setTemplateUuid(String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        public String getTemplateUuid() {
            return this.templateUuid;
        }

    }

}
