// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateScheduleConferenceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1687928400000L</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ScheduleConfSettingModel")
    public CreateScheduleConferenceRequestScheduleConfSettingModel scheduleConfSettingModel;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1687924800000L</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TenantContext")
    public CreateScheduleConferenceRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>预约会议标题</p>
     */
    @NameInMap("Title")
    public String title;

    public static CreateScheduleConferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduleConferenceRequest self = new CreateScheduleConferenceRequest();
        return TeaModel.build(map, self);
    }

    public CreateScheduleConferenceRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreateScheduleConferenceRequest setScheduleConfSettingModel(CreateScheduleConferenceRequestScheduleConfSettingModel scheduleConfSettingModel) {
        this.scheduleConfSettingModel = scheduleConfSettingModel;
        return this;
    }
    public CreateScheduleConferenceRequestScheduleConfSettingModel getScheduleConfSettingModel() {
        return this.scheduleConfSettingModel;
    }

    public CreateScheduleConferenceRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreateScheduleConferenceRequest setTenantContext(CreateScheduleConferenceRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public CreateScheduleConferenceRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public CreateScheduleConferenceRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public static class CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfOpenRecordSetting extends TeaModel {
        @NameInMap("IsFollowHost")
        public Boolean isFollowHost;

        /**
         * <strong>example:</strong>
         * <p>grid</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RecordAutoStart")
        public Integer recordAutoStart;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RecordAutoStartType")
        public Integer recordAutoStartType;

        public static CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfOpenRecordSetting build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfOpenRecordSetting self = new CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfOpenRecordSetting();
            return TeaModel.build(map, self);
        }

        public CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfOpenRecordSetting setIsFollowHost(Boolean isFollowHost) {
            this.isFollowHost = isFollowHost;
            return this;
        }
        public Boolean getIsFollowHost() {
            return this.isFollowHost;
        }

        public CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfOpenRecordSetting setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfOpenRecordSetting setRecordAutoStart(Integer recordAutoStart) {
            this.recordAutoStart = recordAutoStart;
            return this;
        }
        public Integer getRecordAutoStart() {
            return this.recordAutoStart;
        }

        public CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfOpenRecordSetting setRecordAutoStartType(Integer recordAutoStartType) {
            this.recordAutoStartType = recordAutoStartType;
            return this;
        }
        public Integer getRecordAutoStartType() {
            return this.recordAutoStartType;
        }

    }

    public static class CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfVirtualExtraSettingMoziConfExtensionAppSettings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AutoOpenMode")
        public Integer autoOpenMode;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CoolAppCode")
        public String coolAppCode;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ExtensionAppBizData")
        public String extensionAppBizData;

        public static CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfVirtualExtraSettingMoziConfExtensionAppSettings build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfVirtualExtraSettingMoziConfExtensionAppSettings self = new CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfVirtualExtraSettingMoziConfExtensionAppSettings();
            return TeaModel.build(map, self);
        }

        public CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfVirtualExtraSettingMoziConfExtensionAppSettings setAutoOpenMode(Integer autoOpenMode) {
            this.autoOpenMode = autoOpenMode;
            return this;
        }
        public Integer getAutoOpenMode() {
            return this.autoOpenMode;
        }

        public CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfVirtualExtraSettingMoziConfExtensionAppSettings setCoolAppCode(String coolAppCode) {
            this.coolAppCode = coolAppCode;
            return this;
        }
        public String getCoolAppCode() {
            return this.coolAppCode;
        }

        public CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfVirtualExtraSettingMoziConfExtensionAppSettings setExtensionAppBizData(String extensionAppBizData) {
            this.extensionAppBizData = extensionAppBizData;
            return this;
        }
        public String getExtensionAppBizData() {
            return this.extensionAppBizData;
        }

    }

    public static class CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfVirtualExtraSetting extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2iPOLbpUNMLzB5LuwggiiqiPwiEiE</p>
         */
        @NameInMap("CloudRecordOwnerUserId")
        public String cloudRecordOwnerUserId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("EnableChat")
        public Integer enableChat;

        @NameInMap("EnableWebAnonymousJoin")
        public Boolean enableWebAnonymousJoin;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("JoinBeforeHost")
        public Integer joinBeforeHost;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LockMediaStatusMicMute")
        public Integer lockMediaStatusMicMute;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LockNick")
        public Integer lockNick;

        @NameInMap("MinutesOwnerUserId")
        public String minutesOwnerUserId;

        @NameInMap("MoziConfExtensionAppSettings")
        public java.util.List<CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfVirtualExtraSettingMoziConfExtensionAppSettings> moziConfExtensionAppSettings;

        @NameInMap("PushAllMeetingRecords")
        public Boolean pushAllMeetingRecords;

        @NameInMap("PushCloudRecordCard")
        public Boolean pushCloudRecordCard;

        @NameInMap("PushMinutesCard")
        public Boolean pushMinutesCard;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WaitingRoom")
        public Integer waitingRoom;

        public static CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfVirtualExtraSetting build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfVirtualExtraSetting self = new CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfVirtualExtraSetting();
            return TeaModel.build(map, self);
        }

        public CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfVirtualExtraSetting setCloudRecordOwnerUserId(String cloudRecordOwnerUserId) {
            this.cloudRecordOwnerUserId = cloudRecordOwnerUserId;
            return this;
        }
        public String getCloudRecordOwnerUserId() {
            return this.cloudRecordOwnerUserId;
        }

        public CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfVirtualExtraSetting setEnableChat(Integer enableChat) {
            this.enableChat = enableChat;
            return this;
        }
        public Integer getEnableChat() {
            return this.enableChat;
        }

        public CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfVirtualExtraSetting setEnableWebAnonymousJoin(Boolean enableWebAnonymousJoin) {
            this.enableWebAnonymousJoin = enableWebAnonymousJoin;
            return this;
        }
        public Boolean getEnableWebAnonymousJoin() {
            return this.enableWebAnonymousJoin;
        }

        public CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfVirtualExtraSetting setJoinBeforeHost(Integer joinBeforeHost) {
            this.joinBeforeHost = joinBeforeHost;
            return this;
        }
        public Integer getJoinBeforeHost() {
            return this.joinBeforeHost;
        }

        public CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfVirtualExtraSetting setLockMediaStatusMicMute(Integer lockMediaStatusMicMute) {
            this.lockMediaStatusMicMute = lockMediaStatusMicMute;
            return this;
        }
        public Integer getLockMediaStatusMicMute() {
            return this.lockMediaStatusMicMute;
        }

        public CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfVirtualExtraSetting setLockNick(Integer lockNick) {
            this.lockNick = lockNick;
            return this;
        }
        public Integer getLockNick() {
            return this.lockNick;
        }

        public CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfVirtualExtraSetting setMinutesOwnerUserId(String minutesOwnerUserId) {
            this.minutesOwnerUserId = minutesOwnerUserId;
            return this;
        }
        public String getMinutesOwnerUserId() {
            return this.minutesOwnerUserId;
        }

        public CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfVirtualExtraSetting setMoziConfExtensionAppSettings(java.util.List<CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfVirtualExtraSettingMoziConfExtensionAppSettings> moziConfExtensionAppSettings) {
            this.moziConfExtensionAppSettings = moziConfExtensionAppSettings;
            return this;
        }
        public java.util.List<CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfVirtualExtraSettingMoziConfExtensionAppSettings> getMoziConfExtensionAppSettings() {
            return this.moziConfExtensionAppSettings;
        }

        public CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfVirtualExtraSetting setPushAllMeetingRecords(Boolean pushAllMeetingRecords) {
            this.pushAllMeetingRecords = pushAllMeetingRecords;
            return this;
        }
        public Boolean getPushAllMeetingRecords() {
            return this.pushAllMeetingRecords;
        }

        public CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfVirtualExtraSetting setPushCloudRecordCard(Boolean pushCloudRecordCard) {
            this.pushCloudRecordCard = pushCloudRecordCard;
            return this;
        }
        public Boolean getPushCloudRecordCard() {
            return this.pushCloudRecordCard;
        }

        public CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfVirtualExtraSetting setPushMinutesCard(Boolean pushMinutesCard) {
            this.pushMinutesCard = pushMinutesCard;
            return this;
        }
        public Boolean getPushMinutesCard() {
            return this.pushMinutesCard;
        }

        public CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfVirtualExtraSetting setWaitingRoom(Integer waitingRoom) {
            this.waitingRoom = waitingRoom;
            return this;
        }
        public Integer getWaitingRoom() {
            return this.waitingRoom;
        }

    }

    public static class CreateScheduleConferenceRequestScheduleConfSettingModel extends TeaModel {
        @NameInMap("CohostUserIds")
        public java.util.List<String> cohostUserIds;

        /**
         * <strong>example:</strong>
         * <p>dingc02f685fa06381c44ac5d6980864d335</p>
         */
        @NameInMap("ConfAllowedCorpId")
        public String confAllowedCorpId;

        /**
         * <strong>example:</strong>
         * <p>2iPOLbpUNMLzB5LuwggiiqiPwiEiE</p>
         */
        @NameInMap("HostUserId")
        public String hostUserId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LockRoom")
        public Integer lockRoom;

        @NameInMap("MoziConfOpenRecordSetting")
        public CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfOpenRecordSetting moziConfOpenRecordSetting;

        @NameInMap("MoziConfVirtualExtraSetting")
        public CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfVirtualExtraSetting moziConfVirtualExtraSetting;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MuteOnJoin")
        public Integer muteOnJoin;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ScreenShareForbidden")
        public Integer screenShareForbidden;

        public static CreateScheduleConferenceRequestScheduleConfSettingModel build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduleConferenceRequestScheduleConfSettingModel self = new CreateScheduleConferenceRequestScheduleConfSettingModel();
            return TeaModel.build(map, self);
        }

        public CreateScheduleConferenceRequestScheduleConfSettingModel setCohostUserIds(java.util.List<String> cohostUserIds) {
            this.cohostUserIds = cohostUserIds;
            return this;
        }
        public java.util.List<String> getCohostUserIds() {
            return this.cohostUserIds;
        }

        public CreateScheduleConferenceRequestScheduleConfSettingModel setConfAllowedCorpId(String confAllowedCorpId) {
            this.confAllowedCorpId = confAllowedCorpId;
            return this;
        }
        public String getConfAllowedCorpId() {
            return this.confAllowedCorpId;
        }

        public CreateScheduleConferenceRequestScheduleConfSettingModel setHostUserId(String hostUserId) {
            this.hostUserId = hostUserId;
            return this;
        }
        public String getHostUserId() {
            return this.hostUserId;
        }

        public CreateScheduleConferenceRequestScheduleConfSettingModel setLockRoom(Integer lockRoom) {
            this.lockRoom = lockRoom;
            return this;
        }
        public Integer getLockRoom() {
            return this.lockRoom;
        }

        public CreateScheduleConferenceRequestScheduleConfSettingModel setMoziConfOpenRecordSetting(CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfOpenRecordSetting moziConfOpenRecordSetting) {
            this.moziConfOpenRecordSetting = moziConfOpenRecordSetting;
            return this;
        }
        public CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfOpenRecordSetting getMoziConfOpenRecordSetting() {
            return this.moziConfOpenRecordSetting;
        }

        public CreateScheduleConferenceRequestScheduleConfSettingModel setMoziConfVirtualExtraSetting(CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfVirtualExtraSetting moziConfVirtualExtraSetting) {
            this.moziConfVirtualExtraSetting = moziConfVirtualExtraSetting;
            return this;
        }
        public CreateScheduleConferenceRequestScheduleConfSettingModelMoziConfVirtualExtraSetting getMoziConfVirtualExtraSetting() {
            return this.moziConfVirtualExtraSetting;
        }

        public CreateScheduleConferenceRequestScheduleConfSettingModel setMuteOnJoin(Integer muteOnJoin) {
            this.muteOnJoin = muteOnJoin;
            return this;
        }
        public Integer getMuteOnJoin() {
            return this.muteOnJoin;
        }

        public CreateScheduleConferenceRequestScheduleConfSettingModel setScreenShareForbidden(Integer screenShareForbidden) {
            this.screenShareForbidden = screenShareForbidden;
            return this;
        }
        public Integer getScreenShareForbidden() {
            return this.screenShareForbidden;
        }

    }

    public static class CreateScheduleConferenceRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static CreateScheduleConferenceRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduleConferenceRequestTenantContext self = new CreateScheduleConferenceRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public CreateScheduleConferenceRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
