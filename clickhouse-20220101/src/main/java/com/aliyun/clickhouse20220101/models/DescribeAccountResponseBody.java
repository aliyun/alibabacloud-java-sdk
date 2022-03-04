// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeAccountResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeAccountResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountResponseBody self = new DescribeAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccountResponseBody setData(DescribeAccountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAccountResponseBodyData getData() {
        return this.data;
    }

    public DescribeAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAccountResponseBodyData extends TeaModel {
        // 账户名称
        @NameInMap("Account")
        public String account;

        // 账户备注
        @NameInMap("Comment")
        public String comment;

        // 账户密码sha256hex
        @NameInMap("PasswordSha256Hex")
        public String passwordSha256Hex;

        // 账户权限描述
        @NameInMap("PrivilegeDescription")
        public String privilegeDescription;

        // 账户权限类型
        @NameInMap("PrivilegeType")
        public String privilegeType;

        public static DescribeAccountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountResponseBodyData self = new DescribeAccountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAccountResponseBodyData setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public DescribeAccountResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DescribeAccountResponseBodyData setPasswordSha256Hex(String passwordSha256Hex) {
            this.passwordSha256Hex = passwordSha256Hex;
            return this;
        }
        public String getPasswordSha256Hex() {
            return this.passwordSha256Hex;
        }

        public DescribeAccountResponseBodyData setPrivilegeDescription(String privilegeDescription) {
            this.privilegeDescription = privilegeDescription;
            return this;
        }
        public String getPrivilegeDescription() {
            return this.privilegeDescription;
        }

        public DescribeAccountResponseBodyData setPrivilegeType(String privilegeType) {
            this.privilegeType = privilegeType;
            return this;
        }
        public String getPrivilegeType() {
            return this.privilegeType;
        }

    }

}
