// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAccessKeyInfoInRecycleBinResponseBody extends TeaModel {
    @NameInMap("AccessKey")
    public GetAccessKeyInfoInRecycleBinResponseBodyAccessKey accessKey;

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
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("DeleteDate")
        public String deleteDate;

        @NameInMap("RecycleDate")
        public String recycleDate;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserPrincipalName")
        public String userPrincipalName;

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
