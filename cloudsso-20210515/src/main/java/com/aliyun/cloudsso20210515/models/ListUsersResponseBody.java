// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the queried entries are truncated. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * <blockquote>
     * <p> This parameter is returned only when the <code>IsTruncated</code> parameter is <code>true</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>K1c3o9K7pFxoTtxH1Nm7MMLb7zrDGvftYBQBPDVv7AD3a8yhRb3Mk8L9ivmN6bFSjfkZNTAg3h4****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>734D9AAC-9A8E-5DF6-A633-ADE70FF2A9B1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCounts")
    public Integer totalCounts;

    /**
     * <p>The users.</p>
     */
    @NameInMap("Users")
    public java.util.List<ListUsersResponseBodyUsers> users;

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

    public ListUsersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUsersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersResponseBody setTotalCounts(Integer totalCounts) {
        this.totalCounts = totalCounts;
        return this;
    }
    public Integer getTotalCounts() {
        return this.totalCounts;
    }

    public ListUsersResponseBody setUsers(java.util.List<ListUsersResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<ListUsersResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class ListUsersResponseBodyUsersExternalId extends TeaModel {
        /**
         * <p>The identifier of the user that is synchronized from an external IdP.</p>
         * 
         * <strong>example:</strong>
         * <p>c73******a5fdd5</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The method for external identity synchronization. Only System for Cross-domain Identity Management (SCIM) synchronization is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>SCIM</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        public static ListUsersResponseBodyUsersExternalId build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyUsersExternalId self = new ListUsersResponseBodyUsersExternalId();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyUsersExternalId setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListUsersResponseBodyUsersExternalId setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

    }

    public static class ListUsersResponseBodyUsersTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListUsersResponseBodyUsersTags build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyUsersTags self = new ListUsersResponseBodyUsersTags();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyUsersTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListUsersResponseBodyUsersTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListUsersResponseBodyUsers extends TeaModel {
        /**
         * <p>The time when the user was created. The value is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-30T09:20:08Z</p>
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
         * <p>AliceLee</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The email address of the user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:AliceLee@example.onmicrosoft.com">AliceLee@example.onmicrosoft.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The identifier information about the user synchronized from an external IdP.</p>
         */
        @NameInMap("ExternalId")
        public ListUsersResponseBodyUsersExternalId externalId;

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
         * <li>Manual: The user is manually created.</li>
         * <li>Synchronized: The user is synchronized from an external IdP.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Synchronized</p>
         */
        @NameInMap("ProvisionType")
        public String provisionType;

        /**
         * <p>The status of the user. Valid values:</p>
         * <ul>
         * <li>Enabled: The logon of the user is enabled.</li>
         * <li>Disabled: The logon of the user is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<ListUsersResponseBodyUsersTags> tags;

        /**
         * <p>The time when the information about the user was modified. The value is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-30T09:20:08Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>u-00bikzkuzbb58luh****</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:AliceLee@example.onmicrosoft.com">AliceLee@example.onmicrosoft.com</a></p>
         */
        @NameInMap("UserName")
        public String userName;

        public static ListUsersResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyUsers self = new ListUsersResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyUsers setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListUsersResponseBodyUsers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUsersResponseBodyUsers setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListUsersResponseBodyUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListUsersResponseBodyUsers setExternalId(ListUsersResponseBodyUsersExternalId externalId) {
            this.externalId = externalId;
            return this;
        }
        public ListUsersResponseBodyUsersExternalId getExternalId() {
            return this.externalId;
        }

        public ListUsersResponseBodyUsers setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public ListUsersResponseBodyUsers setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public ListUsersResponseBodyUsers setProvisionType(String provisionType) {
            this.provisionType = provisionType;
            return this;
        }
        public String getProvisionType() {
            return this.provisionType;
        }

        public ListUsersResponseBodyUsers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUsersResponseBodyUsers setTags(java.util.List<ListUsersResponseBodyUsersTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListUsersResponseBodyUsersTags> getTags() {
            return this.tags;
        }

        public ListUsersResponseBodyUsers setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListUsersResponseBodyUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListUsersResponseBodyUsers setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
