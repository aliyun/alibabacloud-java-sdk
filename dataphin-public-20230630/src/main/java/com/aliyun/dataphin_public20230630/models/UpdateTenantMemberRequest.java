// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateTenantMemberRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateCommand")
    public UpdateTenantMemberRequestUpdateCommand updateCommand;

    public static UpdateTenantMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTenantMemberRequest self = new UpdateTenantMemberRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTenantMemberRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateTenantMemberRequest setUpdateCommand(UpdateTenantMemberRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateTenantMemberRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateTenantMemberRequestUpdateCommandMemberList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123@dingding</p>
         */
        @NameInMap("DingNumber")
        public String dingNumber;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:123@xx.com">123@xx.com</a></p>
         */
        @NameInMap("Mail")
        public String mail;

        /**
         * <strong>example:</strong>
         * <p>13888888888</p>
         */
        @NameInMap("MobilePhone")
        public String mobilePhone;

        @NameInMap("RoleList")
        public java.util.List<String> roleList;

        /**
         * <strong>example:</strong>
         * <p>2331</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static UpdateTenantMemberRequestUpdateCommandMemberList build(java.util.Map<String, ?> map) throws Exception {
            UpdateTenantMemberRequestUpdateCommandMemberList self = new UpdateTenantMemberRequestUpdateCommandMemberList();
            return TeaModel.build(map, self);
        }

        public UpdateTenantMemberRequestUpdateCommandMemberList setDingNumber(String dingNumber) {
            this.dingNumber = dingNumber;
            return this;
        }
        public String getDingNumber() {
            return this.dingNumber;
        }

        public UpdateTenantMemberRequestUpdateCommandMemberList setMail(String mail) {
            this.mail = mail;
            return this;
        }
        public String getMail() {
            return this.mail;
        }

        public UpdateTenantMemberRequestUpdateCommandMemberList setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }
        public String getMobilePhone() {
            return this.mobilePhone;
        }

        public UpdateTenantMemberRequestUpdateCommandMemberList setRoleList(java.util.List<String> roleList) {
            this.roleList = roleList;
            return this;
        }
        public java.util.List<String> getRoleList() {
            return this.roleList;
        }

        public UpdateTenantMemberRequestUpdateCommandMemberList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class UpdateTenantMemberRequestUpdateCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("MemberList")
        public java.util.List<UpdateTenantMemberRequestUpdateCommandMemberList> memberList;

        public static UpdateTenantMemberRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateTenantMemberRequestUpdateCommand self = new UpdateTenantMemberRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateTenantMemberRequestUpdateCommand setMemberList(java.util.List<UpdateTenantMemberRequestUpdateCommandMemberList> memberList) {
            this.memberList = memberList;
            return this;
        }
        public java.util.List<UpdateTenantMemberRequestUpdateCommandMemberList> getMemberList() {
            return this.memberList;
        }

    }

}
