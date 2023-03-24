// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the response is truncated. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <p>The parameter that is used to obtain the truncated part. It takes effect only when `IsTruncated` is set to `true`.</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the information about the RAM user.</p>
     */
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
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         */
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
        /**
         * <p>The description.</p>
         */
        @NameInMap("Comments")
        public String comments;

        /**
         * <p>The time when the RAM user was created.</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The display name of the RAM user.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The email address of the RAM user.</p>
         * <br>
         * <p>>  This parameter is valid only on the China site (aliyun.com).</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The last time when the RAM user logged on to the Alibaba Cloud Management Console.</p>
         */
        @NameInMap("LastLoginDate")
        public String lastLoginDate;

        /**
         * <p>The mobile phone number of the RAM user.</p>
         * <br>
         * <p>>  This parameter is valid only on the China site (aliyun.com).</p>
         */
        @NameInMap("MobilePhone")
        public String mobilePhone;

        /**
         * <p>The source of the RAM user. Valid values:</p>
         * <br>
         * <p>*   Manual: The RAM user is manually created in the RAM console.</p>
         * <p>*   SCIM: The RAM user is mapped by using System for Cross-domain Identity Management (SCIM).</p>
         * <p>*   CloudSSO: The RAM user is mapped from a CloudSSO user.</p>
         */
        @NameInMap("ProvisionType")
        public String provisionType;

        /**
         * <p>An array that consists of tags.</p>
         */
        @NameInMap("Tags")
        public ListUsersResponseBodyUsersUserTags tags;

        /**
         * <p>The time when the information about the RAM user was updated.</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        /**
         * <p>The ID of the RAM user.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The logon name of the RAM user.</p>
         */
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
