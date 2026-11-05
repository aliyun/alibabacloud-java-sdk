// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateUserResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2BB8C44A-2862-4922-AD43-03924749173B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Resource Access Management (RAM) user information.</p>
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
        @NameInMap("TagKey")
        public String tagKey;

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
         * 
         * <strong>example:</strong>
         * <p>This is a cloud computing engineer.</p>
         */
        @NameInMap("Comments")
        public String comments;

        /**
         * <p>The creation time of the Resource Access Management (RAM) user.</p>
         * <p>Format: RFC 3339 (UTC), such as 2020-10-12T09:12:00Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-12T09:12:00Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The display name of the Resource Access Management (RAM) user.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The electron mailbox of the Resource Access Management (RAM) user.</p>
         * <blockquote>
         * <p>This parameter is applicable only to the China site.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:alice@example.com">alice@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The time of the last logon to the console by the Resource Access Management (RAM) user.</p>
         * <p>Format: RFC 3339 (UTC), such as 2020-10-12T09:12:00Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-12T09:12:00Z</p>
         */
        @NameInMap("LastLoginDate")
        public String lastLoginDate;

        /**
         * <p>The mobile phone number of the Resource Access Management (RAM) user.</p>
         * <blockquote>
         * <p>This parameter is applicable only to the China site.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>86-1868888****</p>
         */
        @NameInMap("MobilePhone")
        public String mobilePhone;

        /**
         * <p>The provision type. Valid values:</p>
         * <ul>
         * <li>Manual: The Resource Access Management (RAM) user is manually created in RAM.</li>
         * <li>SCIM: The Resource Access Management (RAM) user is created through the System for Cross-domain Identity Management protocol.</li>
         * <li>CloudSSO: The user is created through CloudSSO synchronization.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("ProvisionType")
        public String provisionType;

        @NameInMap("Tags")
        public CreateUserResponseBodyUserTags tags;

        /**
         * <p>The update time of the Resource Access Management (RAM) user.</p>
         * <p>Format: RFC 3339 (UTC), such as 2020-10-12T09:12:00Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-12T09:12:00Z</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        /**
         * <p>The ID of the Resource Access Management (RAM) user.</p>
         * 
         * <strong>example:</strong>
         * <p>20732900249392****</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The logon name of the Resource Access Management (RAM) user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
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
