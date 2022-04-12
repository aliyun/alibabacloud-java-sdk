// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListSubAccountResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubAccountList")
    public ListSubAccountResponseBodySubAccountList subAccountList;

    public static ListSubAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSubAccountResponseBody self = new ListSubAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSubAccountResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListSubAccountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSubAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSubAccountResponseBody setSubAccountList(ListSubAccountResponseBodySubAccountList subAccountList) {
        this.subAccountList = subAccountList;
        return this;
    }
    public ListSubAccountResponseBodySubAccountList getSubAccountList() {
        return this.subAccountList;
    }

    public static class ListSubAccountResponseBodySubAccountListSubAccount extends TeaModel {
        @NameInMap("AdminEdasId")
        public String adminEdasId;

        @NameInMap("AdminUserId")
        public String adminUserId;

        @NameInMap("AdminUserKp")
        public String adminUserKp;

        @NameInMap("Email")
        public String email;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("SubEdasId")
        public String subEdasId;

        @NameInMap("SubUserId")
        public String subUserId;

        @NameInMap("SubUserKp")
        public String subUserKp;

        public static ListSubAccountResponseBodySubAccountListSubAccount build(java.util.Map<String, ?> map) throws Exception {
            ListSubAccountResponseBodySubAccountListSubAccount self = new ListSubAccountResponseBodySubAccountListSubAccount();
            return TeaModel.build(map, self);
        }

        public ListSubAccountResponseBodySubAccountListSubAccount setAdminEdasId(String adminEdasId) {
            this.adminEdasId = adminEdasId;
            return this;
        }
        public String getAdminEdasId() {
            return this.adminEdasId;
        }

        public ListSubAccountResponseBodySubAccountListSubAccount setAdminUserId(String adminUserId) {
            this.adminUserId = adminUserId;
            return this;
        }
        public String getAdminUserId() {
            return this.adminUserId;
        }

        public ListSubAccountResponseBodySubAccountListSubAccount setAdminUserKp(String adminUserKp) {
            this.adminUserKp = adminUserKp;
            return this;
        }
        public String getAdminUserKp() {
            return this.adminUserKp;
        }

        public ListSubAccountResponseBodySubAccountListSubAccount setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListSubAccountResponseBodySubAccountListSubAccount setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public ListSubAccountResponseBodySubAccountListSubAccount setSubEdasId(String subEdasId) {
            this.subEdasId = subEdasId;
            return this;
        }
        public String getSubEdasId() {
            return this.subEdasId;
        }

        public ListSubAccountResponseBodySubAccountListSubAccount setSubUserId(String subUserId) {
            this.subUserId = subUserId;
            return this;
        }
        public String getSubUserId() {
            return this.subUserId;
        }

        public ListSubAccountResponseBodySubAccountListSubAccount setSubUserKp(String subUserKp) {
            this.subUserKp = subUserKp;
            return this;
        }
        public String getSubUserKp() {
            return this.subUserKp;
        }

    }

    public static class ListSubAccountResponseBodySubAccountList extends TeaModel {
        @NameInMap("SubAccount")
        public java.util.List<ListSubAccountResponseBodySubAccountListSubAccount> subAccount;

        public static ListSubAccountResponseBodySubAccountList build(java.util.Map<String, ?> map) throws Exception {
            ListSubAccountResponseBodySubAccountList self = new ListSubAccountResponseBodySubAccountList();
            return TeaModel.build(map, self);
        }

        public ListSubAccountResponseBodySubAccountList setSubAccount(java.util.List<ListSubAccountResponseBodySubAccountListSubAccount> subAccount) {
            this.subAccount = subAccount;
            return this;
        }
        public java.util.List<ListSubAccountResponseBodySubAccountListSubAccount> getSubAccount() {
            return this.subAccount;
        }

    }

}
