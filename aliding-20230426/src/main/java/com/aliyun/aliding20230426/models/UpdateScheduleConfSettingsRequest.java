// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateScheduleConfSettingsRequest extends TeaModel {
    @NameInMap("ScheduleConfSettingModel")
    public UpdateScheduleConfSettingsRequestScheduleConfSettingModel scheduleConfSettingModel;

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

    public static class UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSetting extends TeaModel {
        @NameInMap("EnableChat")
        public Integer enableChat;

        @NameInMap("JoinBeforeHost")
        public Integer joinBeforeHost;

        @NameInMap("LockMediaStatusMicMute")
        public Integer lockMediaStatusMicMute;

        @NameInMap("LockNick")
        public Integer lockNick;

        @NameInMap("WaitingRoom")
        public Integer waitingRoom;

        public static UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSetting build(java.util.Map<String, ?> map) throws Exception {
            UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSetting self = new UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSetting();
            return TeaModel.build(map, self);
        }

        public UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSetting setEnableChat(Integer enableChat) {
            this.enableChat = enableChat;
            return this;
        }
        public Integer getEnableChat() {
            return this.enableChat;
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

        @NameInMap("ConfAllowedCorpId")
        public String confAllowedCorpId;

        @NameInMap("HostUserId")
        public String hostUserId;

        @NameInMap("LockRoom")
        public Integer lockRoom;

        @NameInMap("MoziConfVirtualExtraSetting")
        public UpdateScheduleConfSettingsRequestScheduleConfSettingModelMoziConfVirtualExtraSetting moziConfVirtualExtraSetting;

        @NameInMap("MuteOnJoin")
        public Integer muteOnJoin;

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
