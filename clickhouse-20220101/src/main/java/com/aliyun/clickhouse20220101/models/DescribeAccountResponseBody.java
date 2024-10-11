// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeAccountResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeAccountResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>92016D5B-899D-5B77-A8A7-EFE523D4C80A</p>
     */
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
         * <p>Super</p>
         */
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
