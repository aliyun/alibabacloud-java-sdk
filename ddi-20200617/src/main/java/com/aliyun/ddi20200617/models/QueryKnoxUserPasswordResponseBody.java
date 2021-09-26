// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class QueryKnoxUserPasswordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserInfoList")
    public QueryKnoxUserPasswordResponseBodyUserInfoList userInfoList;

    public static QueryKnoxUserPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryKnoxUserPasswordResponseBody self = new QueryKnoxUserPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryKnoxUserPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryKnoxUserPasswordResponseBody setUserInfoList(QueryKnoxUserPasswordResponseBodyUserInfoList userInfoList) {
        this.userInfoList = userInfoList;
        return this;
    }
    public QueryKnoxUserPasswordResponseBodyUserInfoList getUserInfoList() {
        return this.userInfoList;
    }

    public static class QueryKnoxUserPasswordResponseBodyUserInfoListUserInfo extends TeaModel {
        @NameInMap("Password")
        public String password;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("UserId")
        public String userId;

        public static QueryKnoxUserPasswordResponseBodyUserInfoListUserInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryKnoxUserPasswordResponseBodyUserInfoListUserInfo self = new QueryKnoxUserPasswordResponseBodyUserInfoListUserInfo();
            return TeaModel.build(map, self);
        }

        public QueryKnoxUserPasswordResponseBodyUserInfoListUserInfo setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public QueryKnoxUserPasswordResponseBodyUserInfoListUserInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public QueryKnoxUserPasswordResponseBodyUserInfoListUserInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryKnoxUserPasswordResponseBodyUserInfoList extends TeaModel {
        @NameInMap("UserInfo")
        public java.util.List<QueryKnoxUserPasswordResponseBodyUserInfoListUserInfo> userInfo;

        public static QueryKnoxUserPasswordResponseBodyUserInfoList build(java.util.Map<String, ?> map) throws Exception {
            QueryKnoxUserPasswordResponseBodyUserInfoList self = new QueryKnoxUserPasswordResponseBodyUserInfoList();
            return TeaModel.build(map, self);
        }

        public QueryKnoxUserPasswordResponseBodyUserInfoList setUserInfo(java.util.List<QueryKnoxUserPasswordResponseBodyUserInfoListUserInfo> userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public java.util.List<QueryKnoxUserPasswordResponseBodyUserInfoListUserInfo> getUserInfo() {
            return this.userInfo;
        }

    }

}
