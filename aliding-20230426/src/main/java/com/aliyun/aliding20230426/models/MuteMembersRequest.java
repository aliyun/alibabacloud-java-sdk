// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class MuteMembersRequest extends TeaModel {
    @NameInMap("TenantContext")
    public MuteMembersRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;012345&quot;]</p>
     */
    @NameInMap("UserIds")
    public java.util.List<String> userIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>607452e01401526ee39609e1</p>
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

    public static MuteMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        MuteMembersRequest self = new MuteMembersRequest();
        return TeaModel.build(map, self);
    }

    public MuteMembersRequest setTenantContext(MuteMembersRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public MuteMembersRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public MuteMembersRequest setUserIds(java.util.List<String> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<String> getUserIds() {
        return this.userIds;
    }

    public MuteMembersRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public MuteMembersRequest setMuteAction(String muteAction) {
        this.muteAction = muteAction;
        return this;
    }
    public String getMuteAction() {
        return this.muteAction;
    }

    public static class MuteMembersRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static MuteMembersRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            MuteMembersRequestTenantContext self = new MuteMembersRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public MuteMembersRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
