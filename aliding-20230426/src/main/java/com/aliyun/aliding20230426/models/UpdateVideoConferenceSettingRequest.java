// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateVideoConferenceSettingRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowUnmuteSelf")
    public Boolean allowUnmuteSelf;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoTransferHost")
    public Boolean autoTransferHost;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ForbiddenShareScreen")
    public Boolean forbiddenShareScreen;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("LockConference")
    public Boolean lockConference;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MuteAll")
    public Boolean muteAll;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OnlyInternalEmployeesJoin")
    public Boolean onlyInternalEmployeesJoin;

    @NameInMap("TenantContext")
    public UpdateVideoConferenceSettingRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>61289fxxx</p>
     */
    @NameInMap("conferenceId")
    public String conferenceId;

    public static UpdateVideoConferenceSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoConferenceSettingRequest self = new UpdateVideoConferenceSettingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVideoConferenceSettingRequest setAllowUnmuteSelf(Boolean allowUnmuteSelf) {
        this.allowUnmuteSelf = allowUnmuteSelf;
        return this;
    }
    public Boolean getAllowUnmuteSelf() {
        return this.allowUnmuteSelf;
    }

    public UpdateVideoConferenceSettingRequest setAutoTransferHost(Boolean autoTransferHost) {
        this.autoTransferHost = autoTransferHost;
        return this;
    }
    public Boolean getAutoTransferHost() {
        return this.autoTransferHost;
    }

    public UpdateVideoConferenceSettingRequest setForbiddenShareScreen(Boolean forbiddenShareScreen) {
        this.forbiddenShareScreen = forbiddenShareScreen;
        return this;
    }
    public Boolean getForbiddenShareScreen() {
        return this.forbiddenShareScreen;
    }

    public UpdateVideoConferenceSettingRequest setLockConference(Boolean lockConference) {
        this.lockConference = lockConference;
        return this;
    }
    public Boolean getLockConference() {
        return this.lockConference;
    }

    public UpdateVideoConferenceSettingRequest setMuteAll(Boolean muteAll) {
        this.muteAll = muteAll;
        return this;
    }
    public Boolean getMuteAll() {
        return this.muteAll;
    }

    public UpdateVideoConferenceSettingRequest setOnlyInternalEmployeesJoin(Boolean onlyInternalEmployeesJoin) {
        this.onlyInternalEmployeesJoin = onlyInternalEmployeesJoin;
        return this;
    }
    public Boolean getOnlyInternalEmployeesJoin() {
        return this.onlyInternalEmployeesJoin;
    }

    public UpdateVideoConferenceSettingRequest setTenantContext(UpdateVideoConferenceSettingRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public UpdateVideoConferenceSettingRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public UpdateVideoConferenceSettingRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public static class UpdateVideoConferenceSettingRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static UpdateVideoConferenceSettingRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateVideoConferenceSettingRequestTenantContext self = new UpdateVideoConferenceSettingRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public UpdateVideoConferenceSettingRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
