// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateScheduleConfSettingsRequest extends TeaModel {
    @NameInMap("ScheduleConfSettingModel")
    public UpdateScheduleConfSettingsRequestScheduleConfSettingModel scheduleConfSettingModel;

    /**
     * <strong>example:</strong>
     * <p>f6fb627e-a7e8-403e-b1f8-26e85450f4a9</p>
     */
    @NameInMap("ScheduleConferenceId")
    public String scheduleConferenceId;

    @NameInMap("TenantContext")
    public UpdateScheduleConfSettingsRequestTenantContext tenantContext;

    public static UpdateScheduleConfSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduleConfSettingsRequest self = new UpdateScheduleConfSettingsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScheduleConfSettingsRequest setScheduleConfSettingModel(UpdateScheduleConfSettingsRequestScheduleConfSettingModel scheduleConfSettingModel) {
        this.scheduleConfSettingModel = scheduleConfSettingModel;
        return this;
    }
    public UpdateScheduleConfSettingsRequestScheduleConfSettingModel getScheduleConfSettingModel() {
        return this.scheduleConfSettingModel;
    }

    public UpdateScheduleConfSettingsRequest setScheduleConferenceId(String scheduleConferenceId) {
        this.scheduleConferenceId = scheduleConferenceId;
        return this;
    }
    public String getScheduleConferenceId() {
        return this.scheduleConferenceId;
    }

    public UpdateScheduleConfSettingsRequest setTenantContext(UpdateScheduleConfSettingsRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public UpdateScheduleConfSettingsRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfOpenRecordSetting extends TeaModel {
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

        public static UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfOpenRecordSetting build(java.util.Map<String, ?> map) throws Exception {
            UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfOpenRecordSetting self = new UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfOpenRecordSetting();
            return TeaModel.build(map, self);
        }

        public UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfOpenRecordSetting setIsFollowHost(Boolean isFollowHost) {
            this.isFollowHost = isFollowHost;
            return this;
        }
        public Boolean getIsFollowHost() {
            return this.isFollowHost;
        }

        public UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfOpenRecordSetting setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfOpenRecordSetting setRecordAutoStart(Integer recordAutoStart) {
            this.recordAutoStart = recordAutoStart;
            return this;
        }
        public Integer getRecordAutoStart() {
            return this.recordAutoStart;
        }

        public UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfOpenRecordSetting setRecordAutoStartType(Integer recordAutoStartType) {
            this.recordAutoStartType = recordAutoStartType;
            return this;
        }
        public Integer getRecordAutoStartType() {
            return this.recordAutoStartType;
        }

    }

    public static class UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSettingMoziConfExtensionAppSettings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AutoOpenMode")
        public Integer autoOpenMode;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("CoolAppCode")
        public String coolAppCode;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ExtensionAppBizData")
        public String extensionAppBizData;

        public static UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSettingMoziConfExtensionAppSettings build(java.util.Map<String, ?> map) throws Exception {
            UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSettingMoziConfExtensionAppSettings self = new UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSettingMoziConfExtensionAppSettings();
            return TeaModel.build(map, self);
        }

        public UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSettingMoziConfExtensionAppSettings setAutoOpenMode(Integer autoOpenMode) {
            this.autoOpenMode = autoOpenMode;
            return this;
        }
        public Integer getAutoOpenMode() {
            return this.autoOpenMode;
        }

        public UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSettingMoziConfExtensionAppSettings setCoolAppCode(String coolAppCode) {
            this.coolAppCode = coolAppCode;
            return this;
        }
        public String getCoolAppCode() {
            return this.coolAppCode;
        }

        public UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSettingMoziConfExtensionAppSettings setExtensionAppBizData(String extensionAppBizData) {
            this.extensionAppBizData = extensionAppBizData;
            return this;
        }
        public String getExtensionAppBizData() {
            return this.extensionAppBizData;
        }

    }

    public static class UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSetting extends TeaModel {
        @NameInMap("CloudRecordOwnerUserId")
        public String cloudRecordOwnerUserId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EnableChat")
        public Integer enableChat;

        @NameInMap("EnableWebAnonymousJoin")
        public Boolean enableWebAnonymousJoin;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("JoinBeforeHost")
        public Integer joinBeforeHost;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LockMediaStatusMicMute")
        public Integer lockMediaStatusMicMute;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LockNick")
        public Integer lockNick;

        @NameInMap("MinutesOwnerUserId")
        public String minutesOwnerUserId;

        @NameInMap("MoziConfExtensionAppSettings")
        public java.util.List<UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSettingMoziConfExtensionAppSettings> moziConfExtensionAppSettings;

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

        public static UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSetting build(java.util.Map<String, ?> map) throws Exception {
            UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSetting self = new UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSetting();
            return TeaModel.build(map, self);
        }

        public UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSetting setCloudRecordOwnerUserId(String cloudRecordOwnerUserId) {
            this.cloudRecordOwnerUserId = cloudRecordOwnerUserId;
            return this;
        }
        public String getCloudRecordOwnerUserId() {
            return this.cloudRecordOwnerUserId;
        }

        public UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSetting setEnableChat(Integer enableChat) {
            this.enableChat = enableChat;
            return this;
        }
        public Integer getEnableChat() {
            return this.enableChat;
        }

        public UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSetting setEnableWebAnonymousJoin(Boolean enableWebAnonymousJoin) {
            this.enableWebAnonymousJoin = enableWebAnonymousJoin;
            return this;
        }
        public Boolean getEnableWebAnonymousJoin() {
            return this.enableWebAnonymousJoin;
        }

        public UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSetting setJoinBeforeHost(Integer joinBeforeHost) {
            this.joinBeforeHost = joinBeforeHost;
            return this;
        }
        public Integer getJoinBeforeHost() {
            return this.joinBeforeHost;
        }

        public UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSetting setLockMediaStatusMicMute(Integer lockMediaStatusMicMute) {
            this.lockMediaStatusMicMute = lockMediaStatusMicMute;
            return this;
        }
        public Integer getLockMediaStatusMicMute() {
            return this.lockMediaStatusMicMute;
        }

        public UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSetting setLockNick(Integer lockNick) {
            this.lockNick = lockNick;
            return this;
        }
        public Integer getLockNick() {
            return this.lockNick;
        }

        public UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSetting setMinutesOwnerUserId(String minutesOwnerUserId) {
            this.minutesOwnerUserId = minutesOwnerUserId;
            return this;
        }
        public String getMinutesOwnerUserId() {
            return this.minutesOwnerUserId;
        }

        public UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSetting setMoziConfExtensionAppSettings(java.util.List<UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSettingMoziConfExtensionAppSettings> moziConfExtensionAppSettings) {
            this.moziConfExtensionAppSettings = moziConfExtensionAppSettings;
            return this;
        }
        public java.util.List<UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSettingMoziConfExtensionAppSettings> getMoziConfExtensionAppSettings() {
            return this.moziConfExtensionAppSettings;
        }

        public UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSetting setPushAllMeetingRecords(Boolean pushAllMeetingRecords) {
            this.pushAllMeetingRecords = pushAllMeetingRecords;
            return this;
        }
        public Boolean getPushAllMeetingRecords() {
            return this.pushAllMeetingRecords;
        }

        public UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSetting setPushCloudRecordCard(Boolean pushCloudRecordCard) {
            this.pushCloudRecordCard = pushCloudRecordCard;
            return this;
        }
        public Boolean getPushCloudRecordCard() {
            return this.pushCloudRecordCard;
        }

        public UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSetting setPushMinutesCard(Boolean pushMinutesCard) {
            this.pushMinutesCard = pushMinutesCard;
            return this;
        }
        public Boolean getPushMinutesCard() {
            return this.pushMinutesCard;
        }

        public UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSetting setWaitingRoom(Integer waitingRoom) {
            this.waitingRoom = waitingRoom;
            return this;
        }
        public Integer getWaitingRoom() {
            return this.waitingRoom;
        }

    }

    public static class UpdateScheduleConfSettingsRequestScheduleConfSettingModel extends TeaModel {
        @NameInMap("CohostUserIds")
        public java.util.List<String> cohostUserIds;

        /**
         * <strong>example:</strong>
         * <p>ding********</p>
         */
        @NameInMap("ConfAllowedCorpId")
        public String confAllowedCorpId;

        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("HostUserId")
        public String hostUserId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LockRoom")
        public Integer lockRoom;

        @NameInMap("MoziConfOpenRecordSetting")
        public UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfOpenRecordSetting moziConfOpenRecordSetting;

        @NameInMap("MoziConfVirtualExtraSetting")
        public UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSetting moziConfVirtualExtraSetting;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MuteOnJoin")
        public Integer muteOnJoin;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScreenShareForbidden")
        public Integer screenShareForbidden;

        public static UpdateScheduleConfSettingsRequestScheduleConfSettingModel build(java.util.Map<String, ?> map) throws Exception {
            UpdateScheduleConfSettingsRequestScheduleConfSettingModel self = new UpdateScheduleConfSettingsRequestScheduleConfSettingModel();
            return TeaModel.build(map, self);
        }

        public UpdateScheduleConfSettingsRequestScheduleConfSettingModel setCohostUserIds(java.util.List<String> cohostUserIds) {
            this.cohostUserIds = cohostUserIds;
            return this;
        }
        public java.util.List<String> getCohostUserIds() {
            return this.cohostUserIds;
        }

        public UpdateScheduleConfSettingsRequestScheduleConfSettingModel setConfAllowedCorpId(String confAllowedCorpId) {
            this.confAllowedCorpId = confAllowedCorpId;
            return this;
        }
        public String getConfAllowedCorpId() {
            return this.confAllowedCorpId;
        }

        public UpdateScheduleConfSettingsRequestScheduleConfSettingModel setHostUserId(String hostUserId) {
            this.hostUserId = hostUserId;
            return this;
        }
        public String getHostUserId() {
            return this.hostUserId;
        }

        public UpdateScheduleConfSettingsRequestScheduleConfSettingModel setLockRoom(Integer lockRoom) {
            this.lockRoom = lockRoom;
            return this;
        }
        public Integer getLockRoom() {
            return this.lockRoom;
        }

        public UpdateScheduleConfSettingsRequestScheduleConfSettingModel setMoziConfOpenRecordSetting(UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfOpenRecordSetting moziConfOpenRecordSetting) {
            this.moziConfOpenRecordSetting = moziConfOpenRecordSetting;
            return this;
        }
        public UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfOpenRecordSetting getMoziConfOpenRecordSetting() {
            return this.moziConfOpenRecordSetting;
        }

        public UpdateScheduleConfSettingsRequestScheduleConfSettingModel setMoziConfVirtualExtraSetting(UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSetting moziConfVirtualExtraSetting) {
            this.moziConfVirtualExtraSetting = moziConfVirtualExtraSetting;
            return this;
        }
        public UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSetting getMoziConfVirtualExtraSetting() {
            return this.moziConfVirtualExtraSetting;
        }

        public UpdateScheduleConfSettingsRequestScheduleConfSettingModel setMuteOnJoin(Integer muteOnJoin) {
            this.muteOnJoin = muteOnJoin;
            return this;
        }
        public Integer getMuteOnJoin() {
            return this.muteOnJoin;
        }

        public UpdateScheduleConfSettingsRequestScheduleConfSettingModel setScreenShareForbidden(Integer screenShareForbidden) {
            this.screenShareForbidden = screenShareForbidden;
            return this;
        }
        public Integer getScreenShareForbidden() {
            return this.screenShareForbidden;
        }

    }

    public static class UpdateScheduleConfSettingsRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static UpdateScheduleConfSettingsRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateScheduleConfSettingsRequestTenantContext self = new UpdateScheduleConfSettingsRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public UpdateScheduleConfSettingsRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
