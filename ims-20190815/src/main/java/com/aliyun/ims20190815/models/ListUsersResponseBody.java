// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the response is truncated. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <p>The parameter that is used to obtain the truncated part. It takes effect only when <code>IsTruncated</code> is set to <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>EXAMPLE</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4B450CA1-36E8-4AA2-8461-86B42BF4CC4E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the RAM user.</p>
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
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>oparator</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
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
         * 
         * <strong>example:</strong>
         * <p>This is a cloud computing engineer.</p>
         */
        @NameInMap("Comments")
        public String comments;

        /**
         * <p>The point in time when the RAM user was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-12T09:12:00Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The display name of the RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The email address of the RAM user.</p>
         * <blockquote>
         * <p> This parameter applies only to the Alibaba Cloud China site (aliyun.com).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:alice@example.com">alice@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The timestamp when the RAM user last logged on to the console.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-12T09:12:00Z</p>
         */
        @NameInMap("LastLoginDate")
        public String lastLoginDate;

        /**
         * <p>The mobile phone number of the RAM user.</p>
         * <blockquote>
         * <p> This parameter applies only to the Alibaba Cloud China site (aliyun.com).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>86-1868888****</p>
         */
        @NameInMap("MobilePhone")
        public String mobilePhone;

        /**
         * <p>The source of the RAM user. Valid values:</p>
         * <ul>
         * <li>Manual: The RAM user is manually created in the RAM console.</li>
         * <li>SCIM: The RAM user is mapped by using System for Cross-domain Identity Management (SCIM).</li>
         * <li>CloudSSO: The RAM user is mapped from a CloudSSO user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CloudSSO</p>
         */
        @NameInMap("ProvisionType")
        public String provisionType;

        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public ListUsersResponseBodyUsersUserTags tags;

        /**
         * <p>The point in time when the information about the RAM user was last modified. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-13T09:19:49Z</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

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

        public ListUsersResponseBodyUsersUser setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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
