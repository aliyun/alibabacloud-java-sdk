// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAccessKeyInfoInRecycleBinResponseBody extends TeaModel {
    /**
     * <p>The information about the AccessKey pair.</p>
     */
    @NameInMap("AccessKey")
    public GetAccessKeyInfoInRecycleBinResponseBodyAccessKey accessKey;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4507D1CD-526A-4E2B-A1E2-3AB045D1EE0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAccessKeyInfoInRecycleBinResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyInfoInRecycleBinResponseBody self = new GetAccessKeyInfoInRecycleBinResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccessKeyInfoInRecycleBinResponseBody setAccessKey(GetAccessKeyInfoInRecycleBinResponseBodyAccessKey accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public GetAccessKeyInfoInRecycleBinResponseBodyAccessKey getAccessKey() {
        return this.accessKey;
    }

    public GetAccessKeyInfoInRecycleBinResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAccessKeyInfoInRecycleBinResponseBodyAccessKey extends TeaModel {
        /**
         * <p>The AccessKey ID.</p>
         * 
         * <strong>example:</strong>
         * <p>LTAI*******************</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>The time when the AccessKey pair was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-12T09:12:00Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The time when the AccessKey pair will be permanently deleted from the recycle bin.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-12T10:12:00Z</p>
         */
        @NameInMap("DeleteDate")
        public String deleteDate;

        /**
         * <p>The time when the AccessKey pair was deleted and moved to the recycle bin.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-12T10:12:00Z</p>
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

        /**
         * <p>Indicates whether the RAM user to which the AccessKey pair belongs is in the recycle bin. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UserRecycled")
        public Boolean userRecycled;

        public static GetAccessKeyInfoInRecycleBinResponseBodyAccessKey build(java.util.Map<String, ?> map) throws Exception {
            GetAccessKeyInfoInRecycleBinResponseBodyAccessKey self = new GetAccessKeyInfoInRecycleBinResponseBodyAccessKey();
            return TeaModel.build(map, self);
        }

        public GetAccessKeyInfoInRecycleBinResponseBodyAccessKey setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetAccessKeyInfoInRecycleBinResponseBodyAccessKey setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetAccessKeyInfoInRecycleBinResponseBodyAccessKey setDeleteDate(String deleteDate) {
            this.deleteDate = deleteDate;
            return this;
        }
        public String getDeleteDate() {
            return this.deleteDate;
        }

        public GetAccessKeyInfoInRecycleBinResponseBodyAccessKey setRecycleDate(String recycleDate) {
            this.recycleDate = recycleDate;
            return this;
        }
        public String getRecycleDate() {
            return this.recycleDate;
        }

        public GetAccessKeyInfoInRecycleBinResponseBodyAccessKey setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetAccessKeyInfoInRecycleBinResponseBodyAccessKey setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

        public GetAccessKeyInfoInRecycleBinResponseBodyAccessKey setUserRecycled(Boolean userRecycled) {
            this.userRecycled = userRecycled;
            return this;
        }
        public Boolean getUserRecycled() {
            return this.userRecycled;
        }

    }

}
