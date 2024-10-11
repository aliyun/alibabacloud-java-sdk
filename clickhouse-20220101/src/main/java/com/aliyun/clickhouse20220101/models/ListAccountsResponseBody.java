// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ListAccountsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListAccountsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>E889A8CD-A4B4-5676-8EDB-80E06E072353</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccountsResponseBody self = new ListAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccountsResponseBody setData(java.util.List<ListAccountsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAccountsResponseBodyData> getData() {
        return this.data;
    }

    public ListAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAccountsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Account")
        public String account;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>cd0289a263bf4146a2e00888321178234b65e8c050142074ad05683e3749****</p>
         */
        @NameInMap("PasswordSha256Hex")
        public String passwordSha256Hex;

        @NameInMap("PrivilegeDescription")
        public String privilegeDescription;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("PrivilegeType")
        public String privilegeType;

        public static ListAccountsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAccountsResponseBodyData self = new ListAccountsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAccountsResponseBodyData setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public ListAccountsResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListAccountsResponseBodyData setPasswordSha256Hex(String passwordSha256Hex) {
            this.passwordSha256Hex = passwordSha256Hex;
            return this;
        }
        public String getPasswordSha256Hex() {
            return this.passwordSha256Hex;
        }

        public ListAccountsResponseBodyData setPrivilegeDescription(String privilegeDescription) {
            this.privilegeDescription = privilegeDescription;
            return this;
        }
        public String getPrivilegeDescription() {
            return this.privilegeDescription;
        }

        public ListAccountsResponseBodyData setPrivilegeType(String privilegeType) {
            this.privilegeType = privilegeType;
            return this;
        }
        public String getPrivilegeType() {
            return this.privilegeType;
        }

    }

}
