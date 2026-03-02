// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetUserInRecycleBinResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("User")
    public GetUserInRecycleBinResponseBodyUser user;

    public static GetUserInRecycleBinResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserInRecycleBinResponseBody self = new GetUserInRecycleBinResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserInRecycleBinResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserInRecycleBinResponseBody setUser(GetUserInRecycleBinResponseBodyUser user) {
        this.user = user;
        return this;
    }
    public GetUserInRecycleBinResponseBodyUser getUser() {
        return this.user;
    }

    public static class GetUserInRecycleBinResponseBodyUser extends TeaModel {
        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("DeleteDate")
        public String deleteDate;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("RecycleDate")
        public String recycleDate;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserPrincipalName")
        public String userPrincipalName;

        public static GetUserInRecycleBinResponseBodyUser build(java.util.Map<String, ?> map) throws Exception {
            GetUserInRecycleBinResponseBodyUser self = new GetUserInRecycleBinResponseBodyUser();
            return TeaModel.build(map, self);
        }

        public GetUserInRecycleBinResponseBodyUser setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetUserInRecycleBinResponseBodyUser setDeleteDate(String deleteDate) {
            this.deleteDate = deleteDate;
            return this;
        }
        public String getDeleteDate() {
            return this.deleteDate;
        }

        public GetUserInRecycleBinResponseBodyUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetUserInRecycleBinResponseBodyUser setRecycleDate(String recycleDate) {
            this.recycleDate = recycleDate;
            return this;
        }
        public String getRecycleDate() {
            return this.recycleDate;
        }

        public GetUserInRecycleBinResponseBodyUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetUserInRecycleBinResponseBodyUser setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

    }

}
