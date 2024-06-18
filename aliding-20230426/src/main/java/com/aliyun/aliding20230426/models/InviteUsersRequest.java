// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InviteUsersRequest extends TeaModel {
    @NameInMap("InviteeList")
    public java.util.List<InviteUsersRequestInviteeList> inviteeList;

    @NameInMap("TenantContext")
    public InviteUsersRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>61289fxxx</p>
     */
    @NameInMap("conferenceId")
    public String conferenceId;

    @NameInMap("phoneInviteeList")
    public java.util.List<InviteUsersRequestPhoneInviteeList> phoneInviteeList;

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

    public InviteUsersRequest setPhoneInviteeList(java.util.List<InviteUsersRequestPhoneInviteeList> phoneInviteeList) {
        this.phoneInviteeList = phoneInviteeList;
        return this;
    }
    public java.util.List<InviteUsersRequestPhoneInviteeList> getPhoneInviteeList() {
        return this.phoneInviteeList;
    }

    public static class InviteUsersRequestInviteeList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>测试用户</p>
         */
        @NameInMap("Nick")
        public String nick;

        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
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

    public static class InviteUsersRequestPhoneInviteeList extends TeaModel {
        @NameInMap("Nick")
        public String nick;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        public static InviteUsersRequestPhoneInviteeList build(java.util.Map<String, ?> map) throws Exception {
            InviteUsersRequestPhoneInviteeList self = new InviteUsersRequestPhoneInviteeList();
            return TeaModel.build(map, self);
        }

        public InviteUsersRequestPhoneInviteeList setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public InviteUsersRequestPhoneInviteeList setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

    }

}
