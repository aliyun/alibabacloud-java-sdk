// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class MuteAllRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceMute")
    public Boolean forceMute;

    @NameInMap("TenantContext")
    public MuteAllRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("conferenceId")
    public String conferenceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mute</p>
     */
    @NameInMap("muteAction")
    public String muteAction;

    public static MuteAllRequest build(java.util.Map<String, ?> map) throws Exception {
        MuteAllRequest self = new MuteAllRequest();
        return TeaModel.build(map, self);
    }

    public MuteAllRequest setForceMute(Boolean forceMute) {
        this.forceMute = forceMute;
        return this;
    }
    public Boolean getForceMute() {
        return this.forceMute;
    }

    public MuteAllRequest setTenantContext(MuteAllRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public MuteAllRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public MuteAllRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public MuteAllRequest setMuteAction(String muteAction) {
        this.muteAction = muteAction;
        return this;
    }
    public String getMuteAction() {
        return this.muteAction;
    }

    public static class MuteAllRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static MuteAllRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            MuteAllRequestTenantContext self = new MuteAllRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public MuteAllRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
