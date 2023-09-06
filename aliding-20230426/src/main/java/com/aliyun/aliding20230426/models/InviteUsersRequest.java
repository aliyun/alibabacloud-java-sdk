// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InviteUsersRequest extends TeaModel {
    @NameInMap("InviteeList")
    public java.util.List<InviteUsersRequestInviteeList> inviteeList;

    @NameInMap("TenantContext")
    public InviteUsersRequestTenantContext tenantContext;

    @NameInMap("conferenceId")
    public String conferenceId;

    public static InviteUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        InviteUsersRequest self = new InviteUsersRequest();
        return TeaModel.build(map, self);
    }

    public InviteUsersRequest setInviteeList(java.util.List<InviteUsersRequestInviteeList> inviteeList) {
        this.inviteeList = inviteeList;
        return this;
    }
    public java.util.List<InviteUsersRequestInviteeList> getInviteeList() {
        return this.inviteeList;
    }

    public InviteUsersRequest setTenantContext(InviteUsersRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public InviteUsersRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public InviteUsersRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public static class InviteUsersRequestInviteeList extends TeaModel {
        @NameInMap("Nick")
        public String nick;

        @NameInMap("UserId")
        public String userId;

        public static InviteUsersRequestInviteeList build(java.util.Map<String, ?> map) throws Exception {
            InviteUsersRequestInviteeList self = new InviteUsersRequestInviteeList();
            return TeaModel.build(map, self);
        }

        public InviteUsersRequestInviteeList setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public InviteUsersRequestInviteeList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class InviteUsersRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static InviteUsersRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            InviteUsersRequestTenantContext self = new InviteUsersRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public InviteUsersRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
