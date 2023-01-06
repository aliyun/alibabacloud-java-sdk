// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    @NameInMap("Marker")
    public String marker;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Users")
    public ListUsersResponseBodyUsers users;

    public static ListUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersResponseBody self = new ListUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListUsersResponseBody setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersResponseBody setUsers(ListUsersResponseBodyUsers users) {
        this.users = users;
        return this;
    }
    public ListUsersResponseBodyUsers getUsers() {
        return this.users;
    }

    public static class ListUsersResponseBodyUsersUserTagsTag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static ListUsersResponseBodyUsersUserTagsTag build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyUsersUserTagsTag self = new ListUsersResponseBodyUsersUserTagsTag();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyUsersUserTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListUsersResponseBodyUsersUserTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListUsersResponseBodyUsersUserTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<ListUsersResponseBodyUsersUserTagsTag> tag;

        public static ListUsersResponseBodyUsersUserTags build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyUsersUserTags self = new ListUsersResponseBodyUsersUserTags();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyUsersUserTags setTag(java.util.List<ListUsersResponseBodyUsersUserTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<ListUsersResponseBodyUsersUserTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class ListUsersResponseBodyUsersUser extends TeaModel {
        @NameInMap("Comments")
        public String comments;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Email")
        public String email;

        @NameInMap("LastLoginDate")
        public String lastLoginDate;

        @NameInMap("MobilePhone")
        public String mobilePhone;

        @NameInMap("ProvisionType")
        public String provisionType;

        @NameInMap("Tags")
        public ListUsersResponseBodyUsersUserTags tags;

        @NameInMap("UpdateDate")
        public String updateDate;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserPrincipalName")
        public String userPrincipalName;

        public static ListUsersResponseBodyUsersUser build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyUsersUser self = new ListUsersResponseBodyUsersUser();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyUsersUser setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public ListUsersResponseBodyUsersUser setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListUsersResponseBodyUsersUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListUsersResponseBodyUsersUser setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListUsersResponseBodyUsersUser setLastLoginDate(String lastLoginDate) {
            this.lastLoginDate = lastLoginDate;
            return this;
        }
        public String getLastLoginDate() {
            return this.lastLoginDate;
        }

        public ListUsersResponseBodyUsersUser setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }
        public String getMobilePhone() {
            return this.mobilePhone;
        }

        public ListUsersResponseBodyUsersUser setProvisionType(String provisionType) {
            this.provisionType = provisionType;
            return this;
        }
        public String getProvisionType() {
            return this.provisionType;
        }

        public ListUsersResponseBodyUsersUser setTags(ListUsersResponseBodyUsersUserTags tags) {
            this.tags = tags;
            return this;
        }
        public ListUsersResponseBodyUsersUserTags getTags() {
            return this.tags;
        }

        public ListUsersResponseBodyUsersUser setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public ListUsersResponseBodyUsersUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListUsersResponseBodyUsersUser setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

    }

    public static class ListUsersResponseBodyUsers extends TeaModel {
        @NameInMap("User")
        public java.util.List<ListUsersResponseBodyUsersUser> user;

        public static ListUsersResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyUsers self = new ListUsersResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyUsers setUser(java.util.List<ListUsersResponseBodyUsersUser> user) {
            this.user = user;
            return this;
        }
        public java.util.List<ListUsersResponseBodyUsersUser> getUser() {
            return this.user;
        }

    }

}
