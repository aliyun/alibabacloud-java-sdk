// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateVideoConferenceSettingShrinkRequest extends TeaModel {
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
    public String tenantContextShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>61289fxxx</p>
     */
    @NameInMap("conferenceId")
    public String conferenceId;

    public static UpdateVideoConferenceSettingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoConferenceSettingShrinkRequest self = new UpdateVideoConferenceSettingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVideoConferenceSettingShrinkRequest setAllowUnmuteSelf(Boolean allowUnmuteSelf) {
        this.allowUnmuteSelf = allowUnmuteSelf;
        return this;
    }
    public Boolean getAllowUnmuteSelf() {
        return this.allowUnmuteSelf;
    }

    public UpdateVideoConferenceSettingShrinkRequest setAutoTransferHost(Boolean autoTransferHost) {
        this.autoTransferHost = autoTransferHost;
        return this;
    }
    public Boolean getAutoTransferHost() {
        return this.autoTransferHost;
    }

    public UpdateVideoConferenceSettingShrinkRequest setForbiddenShareScreen(Boolean forbiddenShareScreen) {
        this.forbiddenShareScreen = forbiddenShareScreen;
        return this;
    }
    public Boolean getForbiddenShareScreen() {
        return this.forbiddenShareScreen;
    }

    public UpdateVideoConferenceSettingShrinkRequest setLockConference(Boolean lockConference) {
        this.lockConference = lockConference;
        return this;
    }
    public Boolean getLockConference() {
        return this.lockConference;
    }

    public UpdateVideoConferenceSettingShrinkRequest setMuteAll(Boolean muteAll) {
        this.muteAll = muteAll;
        return this;
    }
    public Boolean getMuteAll() {
        return this.muteAll;
    }

    public UpdateVideoConferenceSettingShrinkRequest setOnlyInternalEmployeesJoin(Boolean onlyInternalEmployeesJoin) {
        this.onlyInternalEmployeesJoin = onlyInternalEmployeesJoin;
        return this;
    }
    public Boolean getOnlyInternalEmployeesJoin() {
        return this.onlyInternalEmployeesJoin;
    }

    public UpdateVideoConferenceSettingShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public UpdateVideoConferenceSettingShrinkRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

}
