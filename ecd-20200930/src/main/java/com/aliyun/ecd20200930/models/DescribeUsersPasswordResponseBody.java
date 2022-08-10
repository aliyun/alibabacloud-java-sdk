// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeUsersPasswordResponseBody extends TeaModel {
    @NameInMap("DesktopUsers")
    public java.util.List<DescribeUsersPasswordResponseBodyDesktopUsers> desktopUsers;

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
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("EndUserId")
        public String endUserId;

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
