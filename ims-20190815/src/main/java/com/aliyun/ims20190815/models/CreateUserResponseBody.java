// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateUserResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the RAM user.</p>
     */
    @NameInMap("User")
    public CreateUserResponseBodyUser user;

    public static CreateUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserResponseBody self = new CreateUserResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUserResponseBody setUser(CreateUserResponseBodyUser user) {
        this.user = user;
        return this;
    }
    public CreateUserResponseBodyUser getUser() {
        return this.user;
    }

    public static class CreateUserResponseBodyUserTagsTag extends TeaModel {
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

        public static CreateUserResponseBodyUserTagsTag build(java.util.Map<String, ?> map) throws Exception {
            CreateUserResponseBodyUserTagsTag self = new CreateUserResponseBodyUserTagsTag();
            return TeaModel.build(map, self);
        }

        public CreateUserResponseBodyUserTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public CreateUserResponseBodyUserTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class CreateUserResponseBodyUserTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<CreateUserResponseBodyUserTagsTag> tag;

        public static CreateUserResponseBodyUserTags build(java.util.Map<String, ?> map) throws Exception {
            CreateUserResponseBodyUserTags self = new CreateUserResponseBodyUserTags();
            return TeaModel.build(map, self);
        }

        public CreateUserResponseBodyUserTags setTag(java.util.List<CreateUserResponseBodyUserTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<CreateUserResponseBodyUserTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class CreateUserResponseBodyUser extends TeaModel {
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
         * <p>An array that consists of the details of the returned tags.</p>
         */
        @NameInMap("Tags")
        public CreateUserResponseBodyUserTags tags;

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

        public static CreateUserResponseBodyUser build(java.util.Map<String, ?> map) throws Exception {
            CreateUserResponseBodyUser self = new CreateUserResponseBodyUser();
            return TeaModel.build(map, self);
        }

        public CreateUserResponseBodyUser setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public CreateUserResponseBodyUser setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public CreateUserResponseBodyUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateUserResponseBodyUser setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateUserResponseBodyUser setLastLoginDate(String lastLoginDate) {
            this.lastLoginDate = lastLoginDate;
            return this;
        }
        public String getLastLoginDate() {
            return this.lastLoginDate;
        }

        public CreateUserResponseBodyUser setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }
        public String getMobilePhone() {
            return this.mobilePhone;
        }

        public CreateUserResponseBodyUser setProvisionType(String provisionType) {
            this.provisionType = provisionType;
            return this;
        }
        public String getProvisionType() {
            return this.provisionType;
        }

        public CreateUserResponseBodyUser setTags(CreateUserResponseBodyUserTags tags) {
            this.tags = tags;
            return this;
        }
        public CreateUserResponseBodyUserTags getTags() {
            return this.tags;
        }

        public CreateUserResponseBodyUser setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public CreateUserResponseBodyUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public CreateUserResponseBodyUser setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

    }

}
