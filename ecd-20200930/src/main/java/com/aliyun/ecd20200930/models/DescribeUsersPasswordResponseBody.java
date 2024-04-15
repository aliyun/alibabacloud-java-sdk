// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeUsersPasswordResponseBody extends TeaModel {
    /**
     * <p>The authorized users of the cloud computer.</p>
     */
    @NameInMap("DesktopUsers")
    public java.util.List<DescribeUsersPasswordResponseBodyDesktopUsers> desktopUsers;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUsersPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsersPasswordResponseBody self = new DescribeUsersPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUsersPasswordResponseBody setDesktopUsers(java.util.List<DescribeUsersPasswordResponseBodyDesktopUsers> desktopUsers) {
        this.desktopUsers = desktopUsers;
        return this;
    }
    public java.util.List<DescribeUsersPasswordResponseBodyDesktopUsers> getDesktopUsers() {
        return this.desktopUsers;
    }

    public DescribeUsersPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUsersPasswordResponseBodyDesktopUsers extends TeaModel {
        /**
         * <p>The display name of the end user.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The ID of the end user.</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The password of the end user.</p>
         */
        @NameInMap("Password")
        public String password;

        public static DescribeUsersPasswordResponseBodyDesktopUsers build(java.util.Map<String, ?> map) throws Exception {
            DescribeUsersPasswordResponseBodyDesktopUsers self = new DescribeUsersPasswordResponseBodyDesktopUsers();
            return TeaModel.build(map, self);
        }

        public DescribeUsersPasswordResponseBodyDesktopUsers setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeUsersPasswordResponseBodyDesktopUsers setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribeUsersPasswordResponseBodyDesktopUsers setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

    }

}
