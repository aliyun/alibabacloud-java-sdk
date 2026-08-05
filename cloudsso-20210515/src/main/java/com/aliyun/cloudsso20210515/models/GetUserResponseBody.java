// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetUserResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE42D2C4-A30A-59B7-ACEB-6D22FB44174A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the user.</p>
     */
    @NameInMap("User")
    public GetUserResponseBodyUser user;

    public static GetUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserResponseBody self = new GetUserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserResponseBody setUser(GetUserResponseBodyUser user) {
        this.user = user;
        return this;
    }
    public GetUserResponseBodyUser getUser() {
        return this.user;
    }

    public static class GetUserResponseBodyUserExternalId extends TeaModel {
        /**
         * <p>The user identifier from the external IdP.</p>
         * 
         * <strong>example:</strong>
         * <p>c73******a5fdd5</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The channel for external user synchronization. Only SCIM synchronization is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>SCIM</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        public static GetUserResponseBodyUserExternalId build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyUserExternalId self = new GetUserResponseBodyUserExternalId();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyUserExternalId setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetUserResponseBodyUserExternalId setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

    }

    public static class GetUserResponseBodyUserTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetUserResponseBodyUserTags build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyUserTags self = new GetUserResponseBodyUserTags();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyUserTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetUserResponseBodyUserTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetUserResponseBodyUser extends TeaModel {
        /**
         * <p>The time when the user was created. The time is in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-26T03:03:42Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a user.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The email address of the user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:Alice@example.com">Alice@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The information about the user identifier from an external IdP.</p>
         */
        @NameInMap("ExternalId")
        public GetUserResponseBodyUserExternalId externalId;

        /**
         * <p>The first name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        @NameInMap("FirstName")
        public String firstName;

        /**
         * <p>The last name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>Lee</p>
         */
        @NameInMap("LastName")
        public String lastName;

        /**
         * <p>The type of the user. Valid values:</p>
         * <ul>
         * <li><p>Manual: The user was created manually.</p>
         * </li>
         * <li><p>Synchronized: The user was synchronized from an external IdP.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("ProvisionType")
        public String provisionType;

        /**
         * <p>The status of the user. Valid values:</p>
         * <ul>
         * <li><p>Enabled</p>
         * </li>
         * <li><p>Disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags attached to the user.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetUserResponseBodyUserTags> tags;

        /**
         * <p>The time when the user was last modified. The time is in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-26T06:43:55Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>u-00q8wbq42wiltcrk****</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static GetUserResponseBodyUser build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyUser self = new GetUserResponseBodyUser();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyUser setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetUserResponseBodyUser setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetUserResponseBodyUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetUserResponseBodyUser setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetUserResponseBodyUser setExternalId(GetUserResponseBodyUserExternalId externalId) {
            this.externalId = externalId;
            return this;
        }
        public GetUserResponseBodyUserExternalId getExternalId() {
            return this.externalId;
        }

        public GetUserResponseBodyUser setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public GetUserResponseBodyUser setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public GetUserResponseBodyUser setProvisionType(String provisionType) {
            this.provisionType = provisionType;
            return this;
        }
        public String getProvisionType() {
            return this.provisionType;
        }

        public GetUserResponseBodyUser setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetUserResponseBodyUser setTags(java.util.List<GetUserResponseBodyUserTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetUserResponseBodyUserTags> getTags() {
            return this.tags;
        }

        public GetUserResponseBodyUser setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetUserResponseBodyUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetUserResponseBodyUser setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
