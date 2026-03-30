// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetUserInRecycleBinResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4507D1CD-526A-4E2B-A1E2-3AB045D1EE0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the RAM user.</p>
     */
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
        /**
         * <p>The time when the RAM user was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-11T09:12:00Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The time when the RAM user will be permanently deleted from the recycle bin.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-12T09:12:00Z</p>
         */
        @NameInMap("DeleteDate")
        public String deleteDate;

        /**
         * <p>The display name of the RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The time when the RAM user was deleted and moved to the recycle bin.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-12T09:12:00Z</p>
         */
        @NameInMap("RecycleDate")
        public String recycleDate;

        /**
         * <p>The ID of the RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p>20732900249392****</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The logon name of the RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
         */
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
