// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class AddTenantMembersBySourceUserRequest extends TeaModel {
    @NameInMap("AddCommand")
    public AddTenantMembersBySourceUserRequestAddCommand addCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static AddTenantMembersBySourceUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTenantMembersBySourceUserRequest self = new AddTenantMembersBySourceUserRequest();
        return TeaModel.build(map, self);
    }

    public AddTenantMembersBySourceUserRequest setAddCommand(AddTenantMembersBySourceUserRequestAddCommand addCommand) {
        this.addCommand = addCommand;
        return this;
    }
    public AddTenantMembersBySourceUserRequestAddCommand getAddCommand() {
        return this.addCommand;
    }

    public AddTenantMembersBySourceUserRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class AddTenantMembersBySourceUserRequestAddCommandSourceUserList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="mailto:123@xx.com">123@xx.com</a></p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <strong>example:</strong>
         * <p>123@dingding</p>
         */
        @NameInMap("DingNumber")
        public String dingNumber;

        @NameInMap("DisplayName")
        public String displayName;

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

        /**
         * <strong>example:</strong>
         * <p>2323131</p>
         */
        @NameInMap("SourceId")
        public String sourceId;

        public static AddTenantMembersBySourceUserRequestAddCommandSourceUserList build(java.util.Map<String, ?> map) throws Exception {
            AddTenantMembersBySourceUserRequestAddCommandSourceUserList self = new AddTenantMembersBySourceUserRequestAddCommandSourceUserList();
            return TeaModel.build(map, self);
        }

        public AddTenantMembersBySourceUserRequestAddCommandSourceUserList setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public AddTenantMembersBySourceUserRequestAddCommandSourceUserList setDingNumber(String dingNumber) {
            this.dingNumber = dingNumber;
            return this;
        }
        public String getDingNumber() {
            return this.dingNumber;
        }

        public AddTenantMembersBySourceUserRequestAddCommandSourceUserList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public AddTenantMembersBySourceUserRequestAddCommandSourceUserList setMail(String mail) {
            this.mail = mail;
            return this;
        }
        public String getMail() {
            return this.mail;
        }

        public AddTenantMembersBySourceUserRequestAddCommandSourceUserList setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }
        public String getMobilePhone() {
            return this.mobilePhone;
        }

        public AddTenantMembersBySourceUserRequestAddCommandSourceUserList setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

    }

    public static class AddTenantMembersBySourceUserRequestAddCommand extends TeaModel {
        @NameInMap("SourceUserList")
        public java.util.List<AddTenantMembersBySourceUserRequestAddCommandSourceUserList> sourceUserList;

        public static AddTenantMembersBySourceUserRequestAddCommand build(java.util.Map<String, ?> map) throws Exception {
            AddTenantMembersBySourceUserRequestAddCommand self = new AddTenantMembersBySourceUserRequestAddCommand();
            return TeaModel.build(map, self);
        }

        public AddTenantMembersBySourceUserRequestAddCommand setSourceUserList(java.util.List<AddTenantMembersBySourceUserRequestAddCommandSourceUserList> sourceUserList) {
            this.sourceUserList = sourceUserList;
            return this;
        }
        public java.util.List<AddTenantMembersBySourceUserRequestAddCommandSourceUserList> getSourceUserList() {
            return this.sourceUserList;
        }

    }

}
